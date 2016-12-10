package comportamiento.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EstrategiaConcretaUniversidad implements Estrategia {

	@Override
	public void ordena(final ArrayList<Universitario> alumnos) {

		// Comparador para ordenar los alumnos por su nombre
		final Comparator NomUniComp = new Comparator() {

			@Override
			public int compare(final Object o1, final Object o2) {

				final Universitario uni1 = (Universitario) o1;
				final Universitario uni2 = (Universitario) o2;

				return uni1.getUniversidad().compareTo(uni2.getUniversidad());
			}
		};

		// Ordenamos los objetos del array por el atributo Nombre
		Collections.sort(alumnos, NomUniComp);
	}
}