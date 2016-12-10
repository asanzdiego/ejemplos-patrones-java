package comportamiento.templatemethod;

/* Clase Juego, extiende de Producto. Representa un Producto de tipo juego */
public class Juego extends Producto {

	// ademas del atributo titulo de la clase padre se aniaden el genero y el
	// idioma del juego
	private String genero;

	private String idioma;

	// constructor
	public Juego(final String titulo, final String genero, final String idioma) {
		this.setNombreTitulo(titulo); // metodo de la clase padre
		this.genero = genero;
		this.idioma = idioma;
	}

	public void setGenero(final String gen) {

		this.genero = gen;
	}

	public String getGenero() {

		return this.genero;
	}

	public void setIdioma(final String id) {

		this.idioma = id;
	}

	public String getIdioma() {

		return this.idioma;
	}

	/*
	 * Implementacion de los metodos abstractos de la clase padre. Se muestran
	 * los datos del juego y el precio de su alquiler
	 */
	@Override
	public String getPresentacionProducto() {

		return ("Juego: " + this.getNombreTitulo() + "; genero: " + this.getGenero() + "; idioma: " + this.idioma);
	}

	@Override
	public String getPrecio(final int horas) {

		return "Precio del alquiler: " + (horas * 0.75);
	}
}