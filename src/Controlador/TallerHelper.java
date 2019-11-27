/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author TOM
 */
public class TallerHelper {
    DBConexion conexion;
Taller tall;
public TallerHelper()
{
conexion=new DBConexion();
tall=null;
}

public boolean Agregar(Taller tall)
{
    Statement sent=conexion.getStatement();
    if(sent==null)
        return false;
    String sentencia1="INSERT INTO TALLER VALUES('";
    sentencia1+=tall.idTaller+"','";
    sentencia1+=tall.nombre+"','";
    sentencia1+=tall.descripcion+"','";
    sentencia1+=tall.nombreProfesor+"','";
    sentencia1+=tall.noAula+"')";
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

public ArrayList<Taller> GetTalleres()
    {
        ArrayList<Taller> lista = new ArrayList<Taller>();
        
         Statement sent = conexion.getStatement();
        if (sent == null)
            return lista;
        
        String strSQL = "SELECT * FROM TALLER";
        try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            
            //Si exite solo un empleado con el nombre dado
            while (rs.next())
            {
                String idTaller = rs.getString("IDTALLER");
                String nombre = rs.getString("NOMBRE");
                String descripcion = rs.getString("DESCRIPCION");
                String nombreProfesor=rs.getString("NOMBRETITULAR");
                String  noAula=rs.getString("NOAULA");
                
                
                Taller  tall = new Taller(idTaller, nombre, descripcion, nombreProfesor, noAula);
                
                tall.idTaller = idTaller;
                tall.nombre = nombre;
                tall.descripcion = descripcion;
                tall.nombreProfesor = nombreProfesor;
                tall.noAula=noAula;
                               
                lista.add(tall);
            }
                        
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        
        return lista;
    }

}
