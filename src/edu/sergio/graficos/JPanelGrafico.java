package edu.sergio.graficos;

import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanelGrafico extends JPanel {
	private double[] arrX;
	private double amplitud;
	
	public JPanelGrafico() {
		this.arrX = new double[40];
		double val = 0.1;
		for (int i = 0; i < arrX.length; i++) {
			arrX[i] = val;
			val = val + 0.1;
		}
		amplitud = 100;
	}

	// in another graphics frameworks this method works like update().
	public void paintComponent(Graphics g) {
		
		for (int i = 0; i < arrX.length; i++) {
			g.fillOval(i * 14, (int)(Math.sin(arrX[i]) * amplitud) + getHeight()/2, 10, 10);
			arrX[i] = arrX[i] + 0.1;
		}
		
	}

}
