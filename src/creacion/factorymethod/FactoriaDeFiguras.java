package creacion.factorymethod;

public class FactoriaDeFiguras {

	public static final int CUADRADO = 0;

	public static final int CIRCULO = 1;

	public Figura getFigura(final int tipo, final int lado) {

		if (tipo == FactoriaDeFiguras.CUADRADO) {
			return (new Cuadrado(lado));
		} else {
			return (new Circulo(lado));
		}
	}
}