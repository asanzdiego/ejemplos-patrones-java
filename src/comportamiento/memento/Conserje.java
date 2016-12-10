package comportamiento.memento;
/**
 * Es el responsable de la custodia de los recuerdos.
 * Nunca opera o examina el contenido de un recuerdo.
 */

import java.util.ArrayList;

public class Conserje {

	private final ArrayList<Recuerdo> recuerdos = new ArrayList<Recuerdo>();

	public void setRecuerdo(final Recuerdo recuerdo) {

		this.recuerdos.add(recuerdo);
	}

	public Recuerdo getRecuerdo(final int indice) {

		if (indice < this.recuerdos.size()) {
			final Recuerdo r = this.recuerdos.get(indice);
			return r;
		} else {
			return null;
		}
	}

}