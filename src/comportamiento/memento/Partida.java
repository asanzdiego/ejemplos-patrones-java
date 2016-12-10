package comportamiento.memento;

public class Partida {

	private final String nombre;

	private final String fase;

	private final FechaHora fecha;

	public Partida(final String nombre, final String fase) {
		this.nombre = nombre;
		this.fase = fase;
		this.fecha = new FechaHora();
	}

	public String getNombre() {

		return this.nombre;
	}

	public String getFase() {

		return this.fase;
	}

	public String getFecha() {

		return this.fecha.toString();
	}

	@Override
	public String toString() {

		return "- Partida salvada:\n" + this.nombre + " # " + this.fase + " # " + this.fecha.toString();
	}
}