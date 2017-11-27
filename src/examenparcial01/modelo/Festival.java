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
public class Festival {
    
    private String nombre;
    private String Lugar;
    private String Fecha;

    public Festival(String nombre, String Lugar, String Fecha) {
        this.nombre = nombre;
        this.Lugar = Lugar;
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "Festival{" + "nombre=" + nombre + ", Lugar=" + Lugar + ", Fecha=" + Fecha + '}';
    }
    
    
    
}
