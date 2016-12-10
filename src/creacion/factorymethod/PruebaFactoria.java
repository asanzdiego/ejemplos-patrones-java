package creacion.factorymethod;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaFactoria extends JApplet implements ActionListener {

	JLabel etiqueta1 = new JLabel("Introduce tipo figura:");

	JTextField texto1 = new JTextField("0");

	JLabel etiqueta2 = new JLabel("Introduce lado figura:");

	JTextField texto2 = new JTextField("50");

	JButton dibujar = new JButton("Dibujar");

	JButton borrar = new JButton("Borrar");

	JPanel panel1 = new JPanel();

	JPanel panel2 = new JPanel();

	FactoriaDeFiguras factoria = new FactoriaDeFiguras();

	@Override
	public void init() {

		this.getContentPane().setLayout(new BorderLayout());
		this.panel1.setLayout(new GridLayout(3, 2));
		this.panel1.add(this.etiqueta1);
		this.panel1.add(this.texto1);
		this.panel1.add(this.etiqueta2);
		this.panel1.add(this.texto2);
		this.panel1.add(this.dibujar);
		this.panel1.add(this.borrar);
		this.dibujar.addActionListener(this);
		this.borrar.addActionListener(this);
		this.getContentPane().add("North", this.panel1);
		this.getContentPane().add("Center", this.panel2);
	}

	@Override
	public void actionPerformed(final ActionEvent e) {

		if (e.getSource() == this.dibujar) {
			final Graphics g = this.panel2.getGraphics();
			final int t = Integer.parseInt(this.texto1.getText()); // captura
			                                                       // tipo
			                                                       // figura
			final int l = Integer.parseInt(this.texto2.getText()); // captura
			                                                       // lado
			                                                       // figura
			final Figura figura = this.factoria.getFigura(t, l);
			figura.dibujar(g, 175, 20);
		}
		if (e.getSource() == this.borrar) {
			this.repaint();
		}
	}

}
