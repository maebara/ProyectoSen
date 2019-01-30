package edu.sergio.graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class JVentana extends JFrame{
	private JPanelGrafico panelGrafico;
	private double x;
	
	public JVentana() {
		super();
		setBounds(0, 0, 600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		panelGrafico = new JPanelGrafico();
		setContentPane(panelGrafico);
		setBackground(Color.WHITE);
		x = 0;		
	}
		
	public void iniciarAnimacion() {
		Timer timer = new Timer(17, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				update();
			}
		});
		
		timer.start();
	}

	private void update() {
		double senX = Math.sin(this.x);
		Punto p = panelGrafico.getPunto();
		p.setX(x);
		p.setY(senX);
		x = x + 0.09;
		repaint();
	}

	public static void main(String[] args) {
		JVentana ventana = new JVentana();
		ventana.setVisible(true);
		ventana.iniciarAnimacion();
	}
}
