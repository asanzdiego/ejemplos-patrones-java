package comportamiento.state;

/**
 * Hace de intermediaria entre los dos estados de los que esta compuesta la
 * aplicacion
 */

public class Contexto {

	private Estado estado; // estado actual

	// metodo setEstado. Permite cambiar el estado actual
	public void setEstado(final Estado estado) {

		this.estado = estado;
	}

	// Invoca al metodo mostrarNombre del estado que corresponda.
	// Se mostrara de una forma u otra segun sea el estado actual
	public void mostrar(final Nombre nombre) {

		System.out.println(this.estado.mostrarNombre(nombre));
	}
}