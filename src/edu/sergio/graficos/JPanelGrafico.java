package edu.sergio.graficos;

import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanelGrafico extends JPanel {

	private Punto punto;

	public JPanelGrafico() {
		this.punto = new Punto(0, 0);
	}

	public void paintComponent(Graphics g) {
		int y = (int) (punto.getY() * 100);
//		for (int i = 10; i < 100; i = i + 10) {
//			g.fillOval(i, y + 200 - i, 10, 10);
//		}
		g.fillOval(10, y + 200, 10, 10);
	}	

	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}
}
