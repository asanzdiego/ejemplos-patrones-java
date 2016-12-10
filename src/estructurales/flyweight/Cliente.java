package estructurales.flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cliente extends JApplet implements ActionListener {

	private static final Color colores[] = { Color.red, Color.blue, Color.yellow, Color.orange, Color.black,
	        Color.gray };

	private static final int NUMERO_FIGURAS = 100;

	// componnetes graficos
	JLabel etiqueta1 = new JLabel("Introduce tipo figura:");

	JTextField texto1 = new JTextField("0");

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

			for (int i = 0; i < Cliente.NUMERO_FIGURAS; ++i) {
				final Figura figura = this.factoria.getFigura(t, this.getRandomColor());
				figura.dibujar(g, this.getRandomX(), this.getRandomY(), this.getRandomLado());
				// Como tenemos 6 colores, solo creamos 6 objetos.
			}
		}

		if (e.getSource() == this.borrar) {
			this.repaint();
		}
	}

	private int getRandomX() {

		return (int) (Math.random() * this.getWidth());
	}

	private int getRandomY() {

		return (int) (Math.random() * this.getHeight());
	}

	private int getRandomLado() {

		return (int) (Math.random() * (this.getHeight() / 10));
	}

	private Color getRandomColor() {

		return Cliente.colores[(int) (Math.random() * Cliente.colores.length)];
	}

}
