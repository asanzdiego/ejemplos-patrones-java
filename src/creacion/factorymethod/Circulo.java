package creacion.factorymethod;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Figura {

	public Circulo(final int lado) {
		super(lado);
	}

	@Override
	public double getArea() {

		return (Math.PI * this.lado * this.lado);
	}

	@Override
	public void dibujar(final Graphics g, final int x, final int y) {

		g.setColor(Color.black);
		g.drawArc(x, y, this.lado, this.lado, 0, 360);
	}
}