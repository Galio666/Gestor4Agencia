/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Mcr
 */
public class CentrosCapacitacion {
    
    String nombre;
    String idCencap;
    String calle;
     String colonia;
    String delegacion;
    String telefono;
    
    public CentrosCapacitacion(String idCencap, String nombre, String calle, String colonia, String delegacion, String telefono) {
        this.nombre = nombre;
        this.idCencap = idCencap;
        this.calle = calle;
        this.colonia = colonia;
        this.delegacion = delegacion;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCencap() {
        return idCencap;
    }

    public void setIdCencap(String idCencap) {
        this.idCencap = idCencap;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    }
   
    
    
    

