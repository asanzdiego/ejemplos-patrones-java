package comportamiento.mediator;

/**
 * Cada Colega conoce a su mediador.
 */
public abstract class Colega {

	private Mediador mediador; // el mediador

	private final int id; // identificador del colega

	private static int contador = 0; // secuencia para el id

	public Colega(final Mediador mediador) {
		this.mediador = mediador;
		mediador.setColega(this);
		this.id = Colega.getContador();
	}

	private static int getContador() {

		return Colega.contador++;
	}

	public Mediador getMediador() {

		return this.mediador;
	}

	public void setMediador(final Mediador mediador) {

		this.mediador = mediador;
	}

	public int getId() {

		return this.id;
	}

	public abstract void enviar(String mensaje, int id);

	public abstract void recibir(String mensaje);
}