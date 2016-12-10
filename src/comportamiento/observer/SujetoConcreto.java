package comportamiento.observer;
/**
 * Gestiona a sus observadores.
 * Notifica cambios en la cotizacion de una accion.
 */

import java.util.ArrayList;

public class SujetoConcreto implements Sujeto {

	// los observadores de un valor
	private final ArrayList<Observador> observadores = new ArrayList<Observador>();

	// el valor monitorizado
	private Valor valor;

	@Override
	public void setValor(final Valor v) {

		this.valor = v;
	}

	@Override
	public Valor getValor() {

		return this.valor;
	}

	// aniade un observador a la lista
	@Override
	public void aniadirObservador(final Observador o) {

		if (this.observadores.contains(o) == false) {
			this.observadores.add(o);
		}
	}

	// elimina un observador de la lista
	@Override
	public void eliminarObservador(final Observador o) {

		this.observadores.remove(o);
	}

	// notifica a todos los observadores que se ha producido
	// un cambio en la cotizacion de un valor
	@Override
	public void notificarObservadores() {

		// pasamos el vector a un array para evitar la eliminacion
		// de los observadores en tiempo de ejecucion
		final Object[] obArray = this.observadores.toArray();

		for (final Object element : obArray) {
			final Observador o = (Observador) element;
			System.out.println(o.actualizar());
		}
	}

}