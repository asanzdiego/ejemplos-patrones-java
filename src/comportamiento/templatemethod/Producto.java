package comportamiento.templatemethod;

//Clase abstracta Producto
public abstract class Producto {

	private String titulo;// titulo del producto

	// este es el Metodo Plantilla. Llama al metodo concreto de cada clase
	public final String procesarInformacion(final int horas) {

		final StringBuffer informacion = new StringBuffer("Informacion sobre el producto alquilado:\n");

		/*
		 * estos metodos seran implementados por todas las clases hijas de
		 * Producto para mostrar la informacion de cada producto concreto
		 */
		informacion.append(this.getPresentacionProducto());
		informacion.append("\n" + this.getPrecio(horas));

		return informacion.toString();
	}

	// metodos get y set para todas las clases hijo
	public final void setNombreTitulo(final String nomTit) {

		this.titulo = nomTit;
	}

	public final String getNombreTitulo() {

		return this.titulo;
	}

	// metodos abstractos. Deben ser implementados por cada clase hija

	// presentacion del producto concreto
	public abstract String getPresentacionProducto();

	// devuelve el precio del alquiler del producto segun las horas de alquiler
	public abstract String getPrecio(int horas);
}