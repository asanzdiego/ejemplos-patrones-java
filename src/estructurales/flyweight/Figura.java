package estructurales.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura {

	protected Color color;

	public Figura(final Color color) {
		this.color = color;
	}

	public Color getColor() {

		return this.color;
	}

	public abstract void dibujar(Graphics g, int x, int y, int lado);
}