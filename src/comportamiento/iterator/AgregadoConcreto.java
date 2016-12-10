package comportamiento.iterator;

import java.util.Vector;

public class AgregadoConcreto implements Agregado {

	public Vector elementos;

	public AgregadoConcreto(final Vector vec) {
		this.elementos = vec;
	}

	@Override
	public Iterador crearIterador() {

		return new IteradorConcreto(this);
	}

}