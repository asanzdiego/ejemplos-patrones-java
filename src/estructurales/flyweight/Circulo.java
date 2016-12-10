package estructurales.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Figura {

	public Circulo(final Color color) {
		super(color);
	}

	@Override
	public void dibujar(final Graphics g, final int x, final int y, final int lado) {

		g.setColor(this.color);
		g.drawArc(x, y, lado, lado, 0, 360);
	}
}