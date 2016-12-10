package comportamiento.strategy;

public class Universitario {

	private String dni;

	private String nombre;

	private String carrera;

	private String universidad;

	public Universitario(final String dni, final String nombre, final String carrera, final String universidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.carrera = carrera;
		this.universidad = universidad;
	}

	public String getDni() {

		return this.dni;
	}

	public void setDni(final String dni) {

		this.dni = dni;
	}

	public String getNombre() {

		return this.nombre;
	}

	public void setNombre(final String nombre) {

		this.nombre = nombre;
	}

	public String getCarrera() {

		return this.carrera;
	}

	public void setCarrera(final String carrera) {

		this.carrera = carrera;
	}

	public String getUniversidad() {

		return this.universidad;
	}

	public void setUniversidad(final String universidad) {

		this.universidad = universidad;
	}

	@Override
	public String toString() {

		return this.dni + " " + this.nombre + " # Carrera: " + this.carrera + " # Universidad: " + this.universidad;
	}
}