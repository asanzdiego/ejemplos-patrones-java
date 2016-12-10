package comportamiento.strategy;

import java.util.ArrayList;

public class Cliente {

	public static void main(final String arg[]) {

		try {
			// Los alumnos
			final ArrayList<Universitario> aux = new ArrayList<Universitario>();
			final Universitario uni1 = new Universitario("12345678", "Pepe", "Informatica", "Alcala");
			final Universitario uni2 = new Universitario("48438979", "Cristina", "Farmacia", "Murcia");
			final Universitario uni3 = new Universitario("62654698", "David", "Medicina", "Alcala");
			final Universitario uni4 = new Universitario("75542987", "Laura", "Derecho", "Carlos III");
			aux.add(uni1);
			aux.add(uni2);
			aux.add(uni3);
			aux.add(uni4);
			// La estrategia inicial
			Estrategia est = new EstrategiaConcretaNombre();
			// El contexto
			final Contexto contexto = new Contexto(est, aux);
			System.out.println("### Estrategia Nombre:\n");
			contexto.ejecutaEstrategia();
			System.out.println("\n### Estrategia Universidad:\n");
			// cambiamos la estrategia
			est = new EstrategiaConcretaUniversidad();
			contexto.setEstrategia(est);
			contexto.ejecutaEstrategia();
		} catch (final Exception e) {
			e.toString();
		}
	}
}