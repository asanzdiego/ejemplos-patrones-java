package comportamiento.chainofresponsibility;

public class Paquete {

	private final String contenido;

	private final String destino;

	private final double peso;

	public Paquete(final String contenido, final String destino, final double peso) {
		this.contenido = contenido;
		this.destino = destino;
		this.peso = peso;
	}

	public String getContenido() {

		return this.contenido;
	}

	public String getDestino() {

		return this.destino;
	}

	public double getPeso() {

		return this.peso;
	}

	@Override
	public String toString() {

		return "### Paquete # Contenido: " + this.contenido + " # Destino: " + this.destino + " # Peso: " + this.peso;
	}
}