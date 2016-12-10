package comportamiento.templatemethod;

/*Clase Pelicula, extiende de Producto. Representa un Producto de tipo pelicula*/
public class Pelicula extends Producto {

	// ademas del atributo titulo de la clase padre se aniaden los protagonistas
	// y la duracion
	private String protagonistas;

	private int duracion;

	// constructor
	public Pelicula(final String tit, final String protas, final int dur) {
		this.setNombreTitulo(tit); // metodo de la clase padre
		this.protagonistas = protas;
		this.duracion = dur;
	}

	public void setProtagonistas(final String protas) {

		this.protagonistas = protas;
	}

	public String getProtagonistas() {

		return this.protagonistas;
	}

	public void setDuracion(final int dur) {

		this.duracion = dur;
	}

	public int getDuracion() {

		return this.duracion;
	}

	/*
	 * Implementacion de los metodos abstractos de la clase padre. Se muestran
	 * los datos de la pelicula y el precio de su alquiler
	 */
	@Override
	public String getPresentacionProducto() {

		return ("Pelicula: " + this.getNombreTitulo() + "; protagonistas: " + this.getProtagonistas() + "; duracion: "
		        + this.getDuracion());
	}

	@Override
	public String getPrecio(final int horas) {

		return "Precio del alquiler: " + (horas * 0.5);
	}
}