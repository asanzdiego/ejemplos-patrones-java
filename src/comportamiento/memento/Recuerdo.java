package comportamiento.memento;

/**
 * Almacena el estado interno de un objeto Originador.
 */

public class Recuerdo {

	private Partida partida = null;

	public Recuerdo(final Partida partida) {
		this.partida = partida;
	}

	public Partida getPartida() {

		return this.partida;
	}

	public void setPartida(final Partida partida) {

		this.partida = partida;
	}
}