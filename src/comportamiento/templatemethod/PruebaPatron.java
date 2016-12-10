package comportamiento.templatemethod;

public class PruebaPatron {

	public static void main(final String[] args) {

		// se crean productos concretos
		final Producto p1 = new Pelicula("Mar Adentro", "Javier Bardem, Belen Rueda", 100);
		final Producto p2 = new Pelicula("Torrente", "Santiago Segura, Gabino Diego", 90);
		final Producto j1 = new Juego("Half Life 2", "Accion", "Castellano");
		final Producto j2 = new Juego("Warcraft", "Estrategia", "Castellano");

		System.out.println("EJEMPLO DE PATRON METODO PLANTILLA");
		System.out.println(" ");
		// se invoca al metodo plantilla con cada objeto Producto
		System.out.println("Mostrando " + p1.procesarInformacion(5));
		System.out.println("Mostrando " + j1.procesarInformacion(10));
		System.out.println("Mostrando " + p2.procesarInformacion(3));
		System.out.println("Mostrando " + j2.procesarInformacion(8));
	}
}