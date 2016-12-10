package estructurales.flyweight;

import java.awt.Color;
import java.util.Hashtable;

public class FactoriaDeFiguras {

	// almacena color
	private static final Hashtable circulosPorColor = new Hashtable();

	private static final Hashtable cuadradosPorColor = new Hashtable();

	public static final int CUADRADO = 0;

	public static final int CIRCULO = 1;

	Figura fig;

	// obtiene el peso liguero
	public Figura getFigura(final int tipo, final Color color) {

		if (tipo == FactoriaDeFiguras.CUADRADO) {
			this.fig = (Cuadrado) FactoriaDeFiguras.cuadradosPorColor.get(color);
			if (this.fig == null) {
				this.fig = new Cuadrado(color);
				FactoriaDeFiguras.cuadradosPorColor.put(color, this.fig);
				System.out.println("Creamos un cuadrado de color: " + color);
			}
			return this.fig;
		} else {
			this.fig = (Circulo) FactoriaDeFiguras.circulosPorColor.get(color);
			if (this.fig == null) {
				this.fig = new Circulo(color);
				FactoriaDeFiguras.circulosPorColor.put(color, this.fig);
				System.out.println("Creamos un circulo de color: " + color);
			}
			return this.fig;
		}
	}

}