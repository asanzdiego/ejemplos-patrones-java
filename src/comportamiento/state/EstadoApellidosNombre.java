package comportamiento.state;

/**
 * Implementa Estado. Compone una cadena con los apellidos y el nombre.
 */

public class EstadoApellidosNombre implements Estado {

	@Override
	public String mostrarNombre(final Nombre nom) {

		return nom.getApellidos() + ", " + nom.getNombre();
	}
}