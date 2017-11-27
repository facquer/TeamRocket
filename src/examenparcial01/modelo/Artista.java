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
public class Artista extends Persona {
    
    
        private String generoMusical;

    public Artista(String generoMusical, String Nombre, String Apellido, String Cedula, String FechaNacimiento) {
        super(Nombre, Apellido, Cedula, FechaNacimiento);
        this.generoMusical = generoMusical;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public String toString() {
        return "Artista{" + "generoMusical=" + generoMusical + '}';
    }
        
        
    
    
    
    
}
