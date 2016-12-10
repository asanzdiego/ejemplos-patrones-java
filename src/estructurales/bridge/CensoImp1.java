package estructurales.bridge;

import java.util.Arrays;
import java.util.Comparator;

public class CensoImp1 extends CensoImp {

	@Override
	public Object[] ordena() {

		// Comparador para ordenar las personas por su nombre
		final Comparator NomPerComp = new Comparator() {

			@Override
			public int compare(final Object o1, final Object o2) {

				final Persona p1 = (Persona) o1;
				final Persona p2 = (Persona) o2;
				return p1.getNombre().compareTo(p2.getNombre());
			}
		};

		// Cargamos todas las personas en un array
		final Object perArray[] = this.personas.values().toArray();
		// Ordenamos el array
		Arrays.sort(perArray, NomPerComp);
		return perArray;
	}
}
