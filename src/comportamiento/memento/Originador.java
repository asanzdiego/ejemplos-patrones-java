package comportamiento.memento;

/**
 * Crea un Recuerdo que contienen una instantanea de su estado interno actual.
 * Usa el Reuerdo para restaurar su estado interno.
 */

public class Originador {

	private Partida partida;

	public Partida getPartida() {

		return this.partida;
	}

	public void setPartida(final Partida partida) {

		this.partida = partida;
	}

	public void setRecuerdo(final Recuerdo recuerdo) {

		this.partida = recuerdo.getPartida();
	}

	public Recuerdo crearRecuerdo() {

		return new Recuerdo(this.partida);
	}
}