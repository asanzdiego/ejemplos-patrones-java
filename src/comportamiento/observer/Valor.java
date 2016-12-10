package comportamiento.observer;

public class Valor {

	private String titulo;

	private double cotizacion;

	public Valor(final String t, final double c) {
		this.titulo = t;
		this.cotizacion = c;
	}

	public String getTitulo() {

		return this.titulo;
	}

	public void setTitulo(final String nuevo) {

		this.titulo = nuevo;
	}

	public double getCotizacion() {

		return this.cotizacion;
	}

	public void setCotizacion(final double nuevo) {

		this.cotizacion = nuevo;
	}

	@Override
	public String toString() {

		return "# Valor de " + this.titulo + " cotiza a " + this.cotizacion;
	}
}