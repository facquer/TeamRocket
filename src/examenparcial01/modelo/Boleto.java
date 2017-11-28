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
public class Boleto {
    
    private String numAsiento;
    private Asistente asistente;
    private Festival festival;

    public Boleto( String numAsiento, Asistente asistente, Festival festival) {
       
        this.numAsiento = numAsiento;
        this.asistente = asistente;
        this.festival = festival;
    }

 
    public String getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(String numAsiento) {
        this.numAsiento = numAsiento;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    @Override
    public String toString() {
        return "Boleto{  numAsiento=" + numAsiento + ", asistente=" + asistente + ", festival=" + festival + '}';
    }
    
    

}
