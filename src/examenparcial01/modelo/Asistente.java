/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.modelo;

/**
 *
 * @author Joel Vasquez
 */
public class Asistente extends Persona {
    
    private String profesion;

    public Asistente(String profesion, String Nombre, String Apellido, String Cedula, String FechaNacimiento) {
        super(Nombre, Apellido, Cedula, FechaNacimiento);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Asistente{" + "profesion=" + profesion + '}';
    }
    
    
    
    
    
    
}
