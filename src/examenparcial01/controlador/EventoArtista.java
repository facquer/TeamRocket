/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Artista;
import examenparcial01.vista.VentanaArtista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Estudiante
 */
public class EventoArtista implements ActionListener{
    private VentanaArtista ventanaArtista;
    private GestionDato gestionDato;

    public VentanaArtista getVentanaArtista() {
        return ventanaArtista;
    }

    public void setVentanaArtista(VentanaArtista ventanaArtista) {
        this.ventanaArtista = ventanaArtista;
    }

   

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if (ae.getSource().equals(this.ventanaArtista.getBoton())) {
           String n = this.ventanaArtista.getTxtList().get(0).getText();
		        String ap = this.ventanaArtista.getTxtList().get(1).getText();
			String c = this.ventanaArtista.getTxtList().get(2).getText();
                        String f = this.ventanaArtista.getTxtList().get(3).getText();
       	                String g = this.ventanaArtista.getTxtList().get(4).getText();
                        
                       Artista a = new Artista(n, ap, c, f, g);
				this.gestionDato.addArtista(a);
                                        

				
			}
       }
    }
    


