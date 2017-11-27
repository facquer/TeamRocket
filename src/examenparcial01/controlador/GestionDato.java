/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Asistente;
import examenparcial01.modelo.Boleto;
import examenparcial01.modelo.Festival;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class GestionDato {
    private List<Artista> listaArtista;
    private List<Asistente> listaAsistente;
    private List<Boleto> listaBoleto;
    private List<Festival> listaFestival;

    public GestionDato(List<Artista> listaArtista, List<Asistente> listaAsistente, List<Boleto> listaBoleto, List<Festival> listaFestival) {
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

    public List<Artista> getListaArtista() {
        return listaArtista;
    }

    public void setListaArtista(List<Artista> listaArtista) {
        this.listaArtista = listaArtista;
    }

    public List<Asistente> getListaAsistente() {
        return listaAsistente;
    }

    public void setListaAsistente(List<Asistente> listaAsistente) {
        this.listaAsistente = listaAsistente;
    }

    public List<Boleto> getListaBoleto() {
        return listaBoleto;
    }

    public void setListaBoleto(List<Boleto> listaBoleto) {
        this.listaBoleto = listaBoleto;
    }

    public List<Festival> getListaFestival() {
        return listaFestival;
    }

    public void setListaFestival(List<Festival> listaFestival) {
        this.listaFestival = listaFestival;
    }
    

    
    
}
