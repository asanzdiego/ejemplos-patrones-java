package comportamiento.state;

/**
 * Implementa Estado. Compone una cadena con el nombre y los apellidos
 */

public class EstadoNombreApellidos implements Estado {

	@Override
	public String mostrarNombre(final Nombre nom) {

		return nom.getNombre() + " " + nom.getApellidos();
	}
}