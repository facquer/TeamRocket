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
    
    public Object[] comboBoxAsistente() {
		Object[] combo = new Object[this.getListaAsistente().size()];
		int i = 0;
		for (Asistente a:this.getListaAsistente()) {
			combo[i] = a.getNombre() + " " + a.getApellido();
			i++;
		}
		return combo;
	}
     public Object[] comboBoxArtista() {
		Object[] combo = new Object[this.getListaArtista().size()];
		int i = 0;
		for (Artista a:this.getListaArtista()) {
			combo[i] = a.getNombre() + " " + a.getApellido();
			i++;
		}
		return combo;
	}
      public Object[] comboBoxFestival() {
		Object[] combo = new Object[this.getListaFestival().size()];
		int i = 0;
		for (Festival f:this.getListaFestival()) {
			combo[i] = f.getNombre()+" "+f.getLugar();
			i++;
		}
		return combo;
	}
      public Asistente buscarAsistente(String x) {
		Asistente retorno = null;
		Object[] combo = new Object[this.getListaAsistente().size()];
		int i = 0;
		for (Asistente a : this.getListaAsistente()) {
                    
			combo[i] = a.getNombre() + " " + a.getApellido();
			i++;
		}
		int j = 0;
		for (Asistente a : this.listaAsistente) {
			if (combo[j].equals(x)) {
				retorno = a;
			}
			j++;
		}
		return retorno;
	}
      public Artista buscarArtista(String x) {
		Artista retorno = null;
		Object[] combo = new Object[this.getListaArtista().size()];
		int i = 0;
		for (Artista ar : this.getListaArtista()) {
                    
			combo[i] = ar.getNombre() + " " + ar.getApellido();
			i++;
		}
		int j = 0;
		for (Artista ar : this.listaArtista) {
			if (combo[j].equals(x)) {
				retorno = ar;
			}
			j++;
		}
		return retorno;
	}
      public Festival buscarFestival(String x) {
		Festival retorno = null;
		Object[] combo = new Object[this.getListaFestival().size()];
		int i = 0;
		for (Festival f : this.getListaFestival()) {
                    
			combo[i] = f.getNombre() + " " + f.getLugar();
			i++;
		}
		int j = 0;
		for (Festival f : this.listaFestival) {
			if (combo[j].equals(x)) {
				retorno = f;
			}
			j++;
		}
		return retorno;
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
