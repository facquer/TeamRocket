/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01;

import examenparcial01.controlador.GestionDato;
import examenparcial01.vista.Ventana;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Asistente> as= new ArrayList<Asistente>();
        List<Artista> ar= new ArrayList<Artista>();
        List<Boleto> bo= new ArrayList<Boleto>();
        List<Festival> fe= new ArrayList<Festival>();
        GestionDato gD = new GestionDato(ar,as,bo,fe);
        System.out.println("");
        
        
        Ventana v = new Ventana("Examen Parcial 01", gD);
    }
    
}
