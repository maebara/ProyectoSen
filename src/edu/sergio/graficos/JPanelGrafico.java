package edu.sergio.graficos;

import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanelGrafico extends JPanel {
	private double[] arrX;

	public JPanelGrafico() {
		this.arrX = new double[19];
		for (int i = 0; i < arrX.length; i++) {
			arrX[i] = i;
		}
	}

	// in another graphics frameworks this method works like update().
	public void paintComponent(Graphics g) {
	
		for (int i = 0; i < arrX.length; i++) {
			g.fillOval(i * 40, (int)(Math.sin(arrX[i]) * 100) + getHeight()/2, 10, 10);
			arrX[i] = arrX[i] + 0.09;
		}
	}

}
