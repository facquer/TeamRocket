/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiante
 */
public class VentanaArtista extends JFrame
{
    private JPanel panelInicial; 
    private JPanel panelSup;
    private JPanel panelInf;
    private List<JLabel> etiList;
    private JButton boton;
    private List<JTextField> txtList;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;            
    private GestionDato gestionDato;
    
    
    public VentanaArtista(GestionDato gD)
    {
        super("Artista");
        this.gestionDato=gD;
        this.setSize(500, 400);
        this.iniciaComponente();
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
    

    public void iniciaComponente() {
		this.etiList = new ArrayList<JLabel>();
		this.etiList.add(new JLabel("Ingrese el nombre:"));
		this.etiList.add(new JLabel("Ingrese el apellido:"));
		this.etiList.add(new JLabel("Ingrese la cedula:"));
		this.etiList.add(new JLabel("Fecha de nacimiento:"));
		this.etiList.add(new JLabel("Ingrese el Genero Musical"));

		this.txtList = new ArrayList<JTextField>();
		this.txtList.add(new JTextField(15));
		this.txtList.add(new JTextField(15));
		this.txtList.add(new JTextField(15));
		this.txtList.add(new JTextField(15));
		this.txtList.add(new JTextField(15));

		this.boton = new JButton("Guardar");
		

		//this.boton.addActionListener(new EventoAspirante(this.gestionDato, this));


		this.encabezado = new Object[5];
		this.encabezado[0] = "Nombre";
		this.encabezado[1] = "Apellido";
		this.encabezado[2] = "Cedula";
		this.encabezado[3] = "Fecha Nac";
		this.encabezado[4] = "Genero";

		//this.datos = cargaDatosTabla(this.gestionDato.getArtistaList().size(), 5);

		this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
		this.tabla = new JTable(this.modeloTabla);
		this.scroll = new JScrollPane(this.tabla);

		LayoutManager disenio = new GridLayout(6, 2);
		LayoutManager disenio2 = new GridLayout(2, 1);
		LayoutManager disenio3 = new GridLayout(1, 2);
		this.panelInf = new JPanel(new BorderLayout());
		this.panelSup = new JPanel(disenio);
		this.panelInicial = new JPanel(disenio2);

		for (int i = 0; i < 5; i++) {
			this.panelSup.add(this.etiList.get(i));
			this.panelSup.add(this.txtList.get(i));
		}

		this.panelInf.add(this.scroll, BorderLayout.CENTER);
		this.panelSup.add(this.boton);

		this.panelInicial.add(this.panelSup);
		this.panelInicial.add(this.panelInf);
		this.add(this.panelInicial);

	}

    public JPanel getPanelInicial() {
        return panelInicial;
    }

    public void setPanelInicial(JPanel panelInicial) {
        this.panelInicial = panelInicial;
    }

    public JPanel getPanelSup() {
        return panelSup;
    }

    public void setPanelSup(JPanel panelSup) {
        this.panelSup = panelSup;
    }

    public JPanel getPanelInf() {
        return panelInf;
    }

    public void setPanelInf(JPanel panelInf) {
        this.panelInf = panelInf;
    }

    public List<JLabel> getEtiList() {
        return etiList;
    }

    public void setEtiList(List<JLabel> etiList) {
        this.etiList = etiList;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }


    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }
    
    
}
