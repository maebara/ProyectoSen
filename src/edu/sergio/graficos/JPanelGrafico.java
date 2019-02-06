package edu.sergio.graficos;

import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanelGrafico extends JPanel {
	private double[] arrX;
	private double amplitud;
	private double incrementoX;
	private int periodo;
	
	public JPanelGrafico() {
		incrementoX = 0.1;
		amplitud = 100;
		periodo = 15;
		
		this.arrX = new double[40];
		double val = incrementoX;
		for (int i = 0; i < arrX.length; i++) {
			arrX[i] = val;
			val = val + incrementoX;
		}	
	}

	public void paintComponent(Graphics g) {
		for (int i = 0; i < arrX.length; i++) {
			g.fillOval(i * periodo, (int)(Math.sin(arrX[i]) * amplitud) + getHeight()/2, 10, 10);
			arrX[i] = arrX[i] + incrementoX;
		}
	}
}
