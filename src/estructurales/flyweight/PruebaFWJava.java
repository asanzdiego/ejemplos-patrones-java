package estructurales.flyweight;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class PruebaFWJava extends JFrame {

	public static void main(final String args[]) {

		final PruebaFWJava p = new PruebaFWJava();
	}

	public PruebaFWJava() {
		super("Prueba Patron Flyweight Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setup();
	}

	public void setup() {

		final JPanel panel1 = new JPanel(), panel2 = new JPanel();
		final Border border1 = BorderFactory.createRaisedBevelBorder();
		final Border border2 = BorderFactory.createRaisedBevelBorder();
		panel1.setBorder(border1);
		panel1.setLayout(new BorderLayout());
		panel1.add("Center", new JLabel("BevelBorder 1", SwingConstants.CENTER));
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setBorder(border2);
		panel2.setLayout(new BorderLayout());
		panel2.add("Center", new JLabel("BevelBorder 2", SwingConstants.CENTER));
		panel2.setPreferredSize(new Dimension(100, 100));

		// Configuramos el frame
		final Container contenedor = this.getContentPane();
		contenedor.setLayout(new GridLayout(2, 1, 15, 15));
		contenedor.add(panel1);
		contenedor.add(panel2);

		this.setSize(400, 500);
		this.setVisible(true);

		// comprobamos que estamos utilizando el mismo objeto de la factoria
		System.out.println(border1 == border2);
	}
}
