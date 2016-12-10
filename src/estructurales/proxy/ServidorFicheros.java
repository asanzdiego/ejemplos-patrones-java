package estructurales.proxy;

import java.util.Enumeration;
import java.util.Hashtable;

public class ServidorFicheros implements Servidor {

	// nombre del servidor
	private final String nombre;

	private final Hashtable ficheros;

	private Fichero fich;

	public ServidorFicheros(final String nombre) {
		this.nombre = nombre;
		this.ficheros = new Hashtable();
	}

	@Override
	public String subir(final String nomFich) {

		this.fich = new Fichero(nomFich);
		this.ficheros.put(this.fich.getId(), this.fich);
		return "\nFichero subido correctamente.";
	}

	@Override
	public Fichero bajar(final String id) {

		return (Fichero) this.ficheros.get(id);
	}

	@Override
	public String listado() {

		String lis = "\n### Listado del servidor: " + this.nombre + " ###";
		for (final Enumeration e = this.ficheros.elements(); e.hasMoreElements();) {
			this.fich = (Fichero) e.nextElement();
			lis += "\n\t" + this.fich.toString();
		}
		return lis;
	}

}