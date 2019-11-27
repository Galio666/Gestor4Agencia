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
public class EmpleoHelper {
    
    DBConexion conexion;
    Empleo emp;
    
    public EmpleoHelper(){
    conexion=new DBConexion();
    emp=null;
    
    
    }
    
    public boolean Agregar(Empleo emp)
{
    Statement sent=conexion.getStatement();
    if(sent==null)
        return false;
    String sentencia1="INSERT INTO EMPLEO VALUES('";
    sentencia1+=emp.idEmpleo+"','";
    sentencia1+=emp.nombre+"','";
    sentencia1+=emp.Descripcion+"','";
    sentencia1+=emp.numVacantes+"')";
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

    
}
