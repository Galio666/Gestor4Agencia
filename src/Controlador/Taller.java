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
public class Taller {
    
    
    String nombre;
    String idTaller;
    String descripcion;
    String nombreProfesor;
    String noAula;

    public Taller(String idTaller, String nombre, String descripcion, String nombreProfesor, String noAula) {
        this.idTaller = idTaller;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nombreProfesor = nombreProfesor;
        this.noAula = noAula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdperfil() {
        return idTaller;
    }

    public void setIdperfil(String idTaller) {
        this.idTaller = idTaller;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreTitular() {
        return nombreProfesor;
    }

    public void setNombreTitular(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getNoAula() {
        return noAula;
    }

    public void setNoAula(String noAula) {
        this.noAula = noAula;
    }
    
    
    
    
    
}
