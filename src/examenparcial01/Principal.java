/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01;

import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Asistente;
import examenparcial01.modelo.Boleto;
import examenparcial01.modelo.Festival;
import examenparcial01.vista.VentanaArtista;
import examenparcial01.vista.VentanaAsistente;
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
        
        
        VentanaArtista v = new VentanaArtista( gD);
        VentanaAsistente vA = new VentanaAsistente(gD);
    }
    
}
