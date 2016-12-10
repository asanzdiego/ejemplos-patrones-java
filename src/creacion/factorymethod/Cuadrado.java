package creacion.factorymethod;

import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado extends Figura {

	public Cuadrado(final int lado) {
		super(lado);
	}

	@Override
	public double getArea() {

		return (this.lado * this.lado);
	}

	@Override
	public void dibujar(final Graphics g, final int x, final int y) {

		g.setColor(Color.black);
		g.drawRect(x, y, this.lado, this.lado);
	}
}