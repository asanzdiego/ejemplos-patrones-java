package estructurales.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado extends Figura {

	public Cuadrado(final Color color) {
		super(color);
	}

	@Override
	public void dibujar(final Graphics g, final int x, final int y, final int lado) {

		g.setColor(this.color);
		g.drawRect(x, y, lado, lado);
	}
}