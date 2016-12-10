package creacion.prototype.version1;

import java.util.Vector;

public class Persona implements Cloneable {

	private String dni;

	private String nombre;

	private Fecha2 fechaNac;

	private String direccion;

	private Vector tfnos;

	// constructor
	public Persona(final String p_dni, final String p_nombre, final Fecha2 p_fecnac, final String p_direccion,
	        final Vector p_tfnos) {
		this.dni = p_dni;
		this.nombre = p_nombre;
		this.fechaNac = p_fecnac;
		this.direccion = p_direccion;
		this.tfnos = p_tfnos;
	}

	// metodos
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

	public Fecha2 getFechaNac() {

		return this.fechaNac;
	}

	public void setFechaNac(final Fecha2 fechaNac) {

		this.fechaNac = fechaNac;
	}

	public String getDireccion() {

		return this.direccion;
	}

	public void setDireccion(final String direccion) {

		this.direccion = direccion;
	}

	public Vector getTfnos() {

		return this.tfnos;
	}

	public void setTfnos(final Vector tfnos) {

		this.tfnos = tfnos;
	}

	@Override
	public String toString() {

		return this.dni + " " + this.nombre + " # codigo: " + this.hashCode();
	}

	@Override
	public Object clone() {

		Persona otra = null;
		try {
			otra = (Persona) super.clone();
			// Hasta aqui hemos hecho una copia superficial.
			// Ahora la haremos profunda.
			otra.fechaNac = (Fecha2) this.fechaNac.clone();
			otra.tfnos = (Vector) this.tfnos.clone();
		} catch (final CloneNotSupportedException e) {
		}
		// Esta excepcion no debera aparecer

		return otra;
	}

}
