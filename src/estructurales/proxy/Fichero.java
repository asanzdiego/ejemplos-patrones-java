package estructurales.proxy;

import java.io.File;

public class Fichero {

	private final String id;

	private String nombre;

	private final Fecha2 fechaCrea;

	private final File fichero;

	private final long tamanio;

	// contador unico para el identificador del fichero
	private static int contador = 0;

	// constructor
	public Fichero(final String nombre) {
		this.id = Integer.toString(Fichero.getContador());
		this.nombre = nombre;
		this.fechaCrea = new Fecha2();
		this.fichero = new File(nombre);
		this.tamanio = this.fichero.length();
	}

	// metodos
	private static int getContador() {

		return Fichero.contador++;
	}

	public String getId() {

		return this.id;
	}

	public String getNombre() {

		return this.nombre;
	}

	public void setNombre(final String nombre) {

		this.nombre = nombre;
	}

	public Fecha2 getFechaCrea() {

		return this.fechaCrea;
	}

	public File getFichero() {

		return this.fichero;
	}

	@Override
	public String toString() {

		return this.id + " " + this.nombre + " # " + this.tamanio;
	}
}
