package comportamiento.iterator;

import java.util.Vector;

public class Cliente {

	public static void main(final String arg[]) {

		try {
			final Vector aux = new Vector();
			final Universitario uni1 = new Universitario("12345678", "Pepe", "Informatica", "Alcala");
			final Universitario uni2 = new Universitario("48438979", "Cristina", "Farmacia", "Complutense");
			final Universitario uni3 = new Universitario("62654698", "David", "Medicina", "Alcala");
			final Universitario uni4 = new Universitario("75542987", "Laura", "Derecho", "Carlos III");
			aux.add(uni1);
			aux.add(uni2);
			aux.add(uni3);
			aux.add(uni4);

			final Agregado agregado = new AgregadoConcreto(aux);
			final Iterador iterador = agregado.crearIterador();

			while (iterador.hayMas()) {
				final Universitario uni = (Universitario) iterador.elementoActual();
				System.out.println(uni.toString());
				iterador.siguiente();
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}