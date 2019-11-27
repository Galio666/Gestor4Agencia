/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author TOM
 */
public class Empleo {
    String idEmpleo;
    String nombre;
     String Descripcion;
   String numVacantes;

    public Empleo(String idEmpleo, String nombre, String Descripcion, String numVacantes) {
        this.idEmpleo = idEmpleo;
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.numVacantes = numVacantes;
    }

    /**
     * @return the idEmpresa
     */
    public String getIdEmpleo() {
        return idEmpleo;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpleo(String idEmpleo) {
        this.idEmpleo = idEmpleo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the numVacantes
     */
    public String getNumVacantes() {
        return numVacantes;
    }

    /**
     * @param numVacantes the numVacantes to set
     */
    public void setNumVacantes(String numVacantes) {
        this.numVacantes = numVacantes;
    }
    
}
