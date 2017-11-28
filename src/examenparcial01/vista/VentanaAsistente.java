/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import java.awt.BorderLayout;
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
public class VentanaAsistente extends JFrame{
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

    public VentanaAsistente(GestionDato gestionDato) {
        super("Asistente");
        this.gestionDato = gestionDato;
        this.setLocation(500, 30);
        this.setSize(500, 400);
        this.iniciaComponente();
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    private void iniciaComponente() {
        this.etiList = new ArrayList<JLabel>();
	this.etiList.add(new JLabel("Nombre:"));
	this.etiList.add(new JLabel("Apellido:"));
	this.etiList.add(new JLabel("Cedula:"));
	this.etiList.add(new JLabel("Fecha de nacimiento:"));
	this.txtList = new ArrayList<JTextField>();
	this.txtList.add(new JTextField());
	this.txtList.add(new JTextField());
	this.txtList.add(new JTextField());
	this.txtList.add(new JTextField());
		
	this.boton = new JButton("Guardar");
	this.encabezado = new Object[4];
	this.encabezado[0] = "Nombre";
	this.encabezado[1] = "Apellido";
	this.encabezado[2] = "Cedula";
	this.encabezado[3] = "Fecha Nacimiento";
		
	this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
	this.tabla = new JTable(this.modeloTabla);
	this.scroll = new JScrollPane(this.tabla);
        LayoutManager disenio = new GridLayout(6, 2);
	LayoutManager disenio2 = new GridLayout(2, 1);
	LayoutManager disenio3 = new GridLayout(1, 2);
	this.panelInf = new JPanel(new BorderLayout());
	this.panelSup = new JPanel(disenio);
	this.panelInicial = new JPanel(disenio2);

	for (int i = 0; i < 4; i++) {
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

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }
    
    
}
