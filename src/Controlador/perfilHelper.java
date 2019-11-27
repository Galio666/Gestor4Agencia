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
 * @author Mcr
 */
public class perfilHelper {
    DBConexion conexion;
    Perfil per;
    
    public perfilHelper(){
        conexion=new DBConexion();
        per=null;
    }
    
    public boolean Agregar(Perfil per,String folio,String idPerfil){
    Statement sent=conexion.getStatement();
    if(sent==null)
        return false;
    String sentencia1="INSERT INTO PERFIL VALUES('";
    sentencia1+=idPerfil+"','";
    sentencia1+="DESEMPLEADO','";
    sentencia1+=folio+"','";
    sentencia1+="null','";
    sentencia1+="null','";
    sentencia1+="null','";
    sentencia1+=per.edoFamiliar+"','";
    sentencia1+=per.edoDiscapacidad+"','";
    sentencia1+=per.edoLaboral+"')";
    int num=0;
    try
    {
        sent.executeUpdate(sentencia1);
    }
    catch(SQLException e)
    {
    return false;
    }
    return true;
  }
    
    public boolean Editar(Perfil per,String folio)
    {
        Statement sent =conexion.getStatement();
        if(sent==null)
            return false;
        String sentencia="UPDATE PERFIL SET EDOEMPLEO='DESEMPLEADO',";
        sentencia+=" EDOFAMILIAR='"+per.edoFamiliar+"',";
        sentencia+=" EDODISCAPACIDAD='"+per.edoDiscapacidad+"',";
        sentencia+=" EDOLABORAL='"+per.edoLaboral+"' WHERE IDPERFIL='"+folio+"'";
        System.out.println(sentencia);
        int num=0;
        
        int numero = 0;
        try
        {
            numero = sent.executeUpdate(sentencia);
        }
        catch(SQLException e)
        {
                return false;
        }
        
        return num == 1;
        }
        
    
    
    

}