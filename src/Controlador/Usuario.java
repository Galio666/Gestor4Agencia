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
public class Usuario {
    String folio;
    String nombre;
    String apPaterno;
    String apMaterno;
    String calle;
    String colonia;
    String delegacion;
    String cp;
    String telefono;
    String numInt;
    String numExt;
    String estado;
    
    public Usuario(String folio,String nombre,String apMaterno,String apPaterno,String calle,String colonia,String delegacion,String cp,String telefono,String numInt,String numExt,String estado)
    {
    this.folio=folio;
    this.nombre=nombre;
    this.apPaterno=apPaterno;
    this.apMaterno=apMaterno;
    this.calle=calle;
    this.colonia=colonia;
    this.delegacion=delegacion;
    this.cp=cp;
    this.telefono=telefono;
    this.numInt=numInt;
    this.numExt=numExt;
    this.estado=estado;
    }
    
    public Usuario(String folio,String nombre,String apMaterno,String apPaterno,String calle,String colonia,String delegacion,String cp,String telefono,String numInt,String estado)
    {
    this.folio=folio;
    this.nombre=nombre;
    this.apPaterno=apPaterno;
    this.apMaterno=apMaterno;
    this.calle=calle;
    this.colonia=colonia;
    this.delegacion=delegacion;
    this.cp=cp;
    this.telefono=telefono;
    this.numInt=numInt;
    this.estado=estado;
    }

    public Usuario(String folio, String nombre, String apPaterno, String apMaterno, String estado) {
        this.folio=folio;
    this.nombre=nombre;
    this.apPaterno=apPaterno;
    this.apMaterno=apMaterno;
    this.estado=estado;
    }
    
    public String getEstado(){
    return estado;
    }
    
    public void setEstado(String estado){
    this.estado=estado;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
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

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumInt() {
        return numInt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    public String getNumExt() {
        return numExt;
    }

    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }
    
    
    
}
