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
public class Presentacion {
    
    private Artista artista;
    private Festival festival;;
    private int orden;

    public Presentacion(Artista artista, Festival festival, int orden) {
        this.artista = artista;
        this.festival = festival;
        this.orden = orden;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "Presentacion{" + "artista=" + artista + ", festival=" + festival + ", orden=" + orden + '}';
    }

    
    
    
    
}
