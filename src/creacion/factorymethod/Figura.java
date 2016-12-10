package creacion.factorymethod;

import java.awt.Graphics;

public abstract class Figura {

	int lado = 0;

	public Figura(final int lado) {
		this.lado = lado;
	}

	public abstract double getArea();

	public abstract void dibujar(Graphics g, int x, int y);
}