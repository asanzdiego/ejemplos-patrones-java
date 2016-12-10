package comportamiento.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EstrategiaConcretaNombre implements Estrategia {

	@Override
	public void ordena(final ArrayList<Universitario> alumnos) {

		// Comparador para ordenar los alumnos por su nombre
		final Comparator NomAluComp = new Comparator() {

			@Override
			public int compare(final Object o1, final Object o2) {

				final Universitario uni1 = (Universitario) o1;
				final Universitario uni2 = (Universitario) o2;

				return uni1.getNombre().compareTo(uni2.getNombre());
			}
		};

		// Ordenamos los objetos del array por el atributo Nombre
		Collections.sort(alumnos, NomAluComp);
	}
}