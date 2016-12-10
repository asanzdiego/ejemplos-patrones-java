package comportamiento.state;

public class Nombre {

	private final String nombre;

	private final String apellidos;

	public Nombre(final String nombre, final String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {

		return this.nombre;
	}

	public String getApellidos() {

		return this.apellidos;
	}
}