package estructurales.bridge;

import java.util.Arrays;
import java.util.Comparator;

public class CensoImp2 extends CensoImp {

	@Override
	public Object[] ordena() {

		// Comparador para ordenar las personas por su DNI
		final Comparator DniPerComp = new Comparator() {

			@Override
			public int compare(final Object o1, final Object o2) {

				final Persona per1 = (Persona) o1;
				final Persona per2 = (Persona) o2;
				return per1.getDni().compareTo(per2.getDni());
			}
		};

		// Cargamos todas las personas en un array
		final Object perArray[] = this.personas.values().toArray();
		// Ordenamos el array
		Arrays.sort(perArray, DniPerComp);
		return perArray;
	}
}
