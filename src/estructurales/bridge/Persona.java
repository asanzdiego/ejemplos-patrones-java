package estructurales.bridge;

public class Persona {

	private String dni;

	private String nombre;

	private Fecha2 fechaNac;

	private String direccion;

	private String tfno;

	// constructor
	public Persona(final String p_dni, final String p_nombre, final Fecha2 p_fecnac, final String p_direccion,
	        final String p_tfno) {
		this.dni = p_dni;
		this.nombre = p_nombre;
		this.fechaNac = p_fecnac;
		this.direccion = p_direccion;
		this.tfno = p_tfno;
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

	public String getTfno() {

		return this.tfno;
	}

	public void setTfnos(final String tfno) {

		this.tfno = tfno;
	}

	@Override
	public String toString() {

		return this.dni + " " + this.nombre;
	}
}
