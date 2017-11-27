/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class GestionDato {
    private ArrayList<Artista> listaArtista;
    private ArrayList<Asistente> listaAsistente;
    private ArrayList<Boleto> listaBoleto;
    private ArrayList<Festival> listaFestival;

    public GestionDato(ArrayList<Artista> listaArtista, ArrayList<Asistente> listaAsistente, ArrayList<Boleto> listaBoleto, ArrayList<Festival> listaFestival) {
        this.listaArtista = listaArtista;
        this.listaAsistente = listaAsistente;
        this.listaBoleto = listaBoleto;
        this.listaFestival = listaFestival;
    }
    
    public boolean addArtista(Artista artista){
        return this.listaArtista.add(artista);                
    }
    public boolean addAsistente(Asistente asistente){
        return this.listaAsistente.add(asistente);
    }
    public boolean addBoleto(Boleto boleto){
        return this.listaBoleto.add(boleto);        
    }
    public boolean addFestival(Festival festival){
        return this.listaFestival.add(festival);
    }
    

    public ArrayList<Artista> getListaArtista() {
        return listaArtista;
    }

    public void setListaArtista(ArrayList<Artista> listaArtista) {
        this.listaArtista = listaArtista;
    }

    public ArrayList<Asistente> getListaAsistente() {
        return listaAsistente;
    }

    public void setListaAsistente(ArrayList<Asistente> listaAsistente) {
        this.listaAsistente = listaAsistente;
    }

    public ArrayList<Boleto> getListaBoleto() {
        return listaBoleto;
    }

    public void setListaBoleto(ArrayList<Boleto> listaBoleto) {
        this.listaBoleto = listaBoleto;
    }

    public ArrayList<Festival> getListaFestival() {
        return listaFestival;
    }

    public void setListaFestival(ArrayList<Festival> listaFestival) {
        this.listaFestival = listaFestival;
    }
    
    

    
}
