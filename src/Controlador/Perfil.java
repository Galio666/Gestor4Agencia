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
public class Perfil {
    String edoDiscapacidad;
    String edoFamiliar;
    String edoLaboral;

    public String getEdoDiscapacidad() {
        return edoDiscapacidad;
    }

    public void setEdoDiscapacidad(String edoDiscapacidad) {
        this.edoDiscapacidad = edoDiscapacidad;
    }

    public String getEdoFamiliar() {
        return edoFamiliar;
    }

    public void setEdoFamiliar(String edoFamiliar) {
        this.edoFamiliar = edoFamiliar;
    }

    public String getEdoLaboral() {
        return edoLaboral;
    }

    public void setEdoLaboral(String edoLaboral) {
        this.edoLaboral = edoLaboral;
    }

    public Perfil(String edoDiscapacidad, String edoFamiliar, String edoLaboral) {
        this.edoDiscapacidad = edoDiscapacidad;
        this.edoFamiliar = edoFamiliar;
        this.edoLaboral = edoLaboral;
    }

}
