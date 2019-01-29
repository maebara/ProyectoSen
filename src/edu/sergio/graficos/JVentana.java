package edu.sergio.graficos;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JVentana extends JFrame{

	private JPanelGrafico panelGrafico;
	
	public JVentana() {
		super();
		this.setBounds(0, 0, 400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.panelGrafico = new JPanelGrafico();
		this.setContentPane(panelGrafico);
		this.setBackground(Color.WHITE);
	}
	
	
	
	public static void main(String[] args) {
		JVentana ventana = new JVentana();
		ventana.setVisible(true);
	}
}
