/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TOM
 */
public class CapacitacionHelper {
    
     DBConexion conexion;

     CentrosCapacitacion cencap;
public CapacitacionHelper()
{
conexion=new DBConexion();
cencap=null;
}

public boolean Agregar(CentrosCapacitacion cencap)
{
    Statement sent=conexion.getStatement();
    if(sent==null)
        return false;
    String sentencia1="INSERT INTO CENTROCAPACITACION VALUES('";
    sentencia1+=cencap.idCencap+"','";
    sentencia1+=cencap.nombre+"','";
    sentencia1+=cencap.calle+"','";
    sentencia1+=cencap.colonia+"','";
    sentencia1+=cencap.delegacion+"','";
    sentencia1+=cencap.telefono+"')";
    int num=0;
    try
    {
        sent.executeUpdate(sentencia1);
        return true;
    }
    catch(SQLException e)
    {
    System.out.println("Error: "+e.getMessage());
    }
    
    return true;
}


public boolean Eliminar(String idCapacitacion)
{
   Statement sent = conexion.getStatement();
    if (sent == null)
    return false;

    String sentencia="DELETE FROM CENTROCAPACITACION  WHERE IDCAPACITACION='"+idCapacitacion+"';";
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
    

public boolean Actualizar(CentrosCapacitacion cencap)
{
Statement sent = conexion.getStatement();
if(sent==null)
    return false;
String sentencia="UPDATE CENTROCAPACITACION SET IDCAPACITACION='"+cencap.idCencap+"',";
sentencia+="NOMBRE='"+cencap.nombre+"',";
sentencia+="CALLE='"+cencap.calle+"',";
sentencia+="COLONIA='"+cencap.colonia+"',";
sentencia+="DELEGACION='"+cencap.delegacion+"',";
sentencia+="TELEFONO='"+cencap.telefono+"'";



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
