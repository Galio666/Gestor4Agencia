
package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class UsuarioDB {
DBConexion conexion;
Usuario user;
public UsuarioDB()
{
conexion=new DBConexion();
user=null;
}


public ArrayList<Usuario> GetUsuario()
    {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        
         Statement sent = conexion.getStatement();
        if (sent == null)
            return lista;
        
        String strSQL = "SELECT FOLIO,NOMBRE,APPATERNO,APMATERNO,ESTADO FROM USUARIO";
        try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            
            //Si exite solo un empleado con el nombre dado
            while (rs.next())
            {
                String folio = rs.getString("FOLIO");
                String nombre = rs.getString("NOMBRE");
                String apPaterno = rs.getString("APPATERNO");
                String apMaterno=rs.getString("APMATERNO");
                String estado=rs.getString("ESTADO");
                
                
                Usuario  user = new Usuario(folio, nombre, apPaterno, apMaterno, estado);
                
                user.folio = folio;
                user.nombre = nombre;
                user.apPaterno =apPaterno ;
                user.apMaterno = apMaterno;
                user.estado=estado;
                               
                lista.add(user);
            }
                        
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        
        return lista;
    }


public boolean Agregar(Usuario user)
{
    Statement sent=conexion.getStatement();
    if(sent==null)
        return false;
    String sentencia1="INSERT INTO USUARIO VALUES('";
    sentencia1+=user.folio+"','";
    sentencia1+=user.nombre+"','";
    sentencia1+=user.apPaterno+"','";
    sentencia1+=user.apMaterno+"','";
    sentencia1+=user.calle+"','";
    sentencia1+=user.colonia+"','";
    sentencia1+=user.delegacion+"','";
    sentencia1+=user.cp+"','";
    sentencia1+=user.telefono+"','";
    sentencia1+=user.numInt+"','";
    sentencia1+=user.numExt+"','";
    sentencia1+=user.estado+"')";
    int num=0;
    try
    {
        sent.executeUpdate(sentencia1);
    }
    catch(SQLException e)
    {
    System.out.println("Error: "+e.getMessage());
    }
    
    return true;
}

public boolean Eliminar(String folio)
{
   Statement sent = conexion.getStatement();
    if (sent == null)
    return false;

    String sentencia="DELETE FROM USUARIO WHERE NOMBRE='"+folio+"';";
    
    int num = 0;
        try
        {
            num = sent.executeUpdate(sentencia);
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
         return num == 1;
}

public boolean Actualizar(Usuario user)
{
Statement sent = conexion.getStatement();
if(sent==null)
    return false;
String sentencia="UPDATE USUARIO SET NOMBRE='"+user.nombre+"',";
sentencia+="APPATERNO='"+user.apPaterno+"',";
sentencia+="APMATERNO='"+user.apMaterno+"',";
sentencia+="CALLE='"+user.calle+"',";
sentencia+="COLONIA='"+user.colonia+"',";
sentencia+="DELEGACION='"+user.delegacion+"',";
sentencia+="CP='"+user.cp+"',";
sentencia+="TELEFONO='"+user.telefono+"',";
sentencia+="NUMINT='"+user.numInt+"',";
sentencia+="NUMEXT='"+user.numExt+"'";

int num=0;
        try
        {
            num = sent.executeUpdate(sentencia);
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        
        return num == 1;
}
}
