package comportamiento.visitor;

public class Cliente {

	public static void main(final String args[]) {

		try {
			// importes parciales y totales de la factura
			double parcial = 0, total = 0;

			// las llamadas
			final Llamada l1 = new LlamadaMetropolitana(20, 10, 'L');
			final Llamada l2 = new LlamadaMetropolitana(15, 22, 'M');
			final Llamada l3 = new LlamadaProvincial(10, 16, 'X');
			final Llamada l4 = new LlamadaProvincial(22, 19, 'J');
			final Llamada l5 = new LlamadaInterprovincial(40, 23, 'S');
			final Llamada l6 = new LlamadaInterprovincial(35, 12, 'V');

			final Llamadas llamadas = new Llamadas();
			llamadas.aniadirLlamada(l1);
			llamadas.aniadirLlamada(l2);
			llamadas.aniadirLlamada(l3);
			llamadas.aniadirLlamada(l4);
			llamadas.aniadirLlamada(l5);
			llamadas.aniadirLlamada(l6);

			// los visitantes
			final Visitante vn = new VisitanteHorarioNormal();
			final Visitante vr = new VisitanteHorarioReducido();

			System.out.println("### FACTURA DE TELEFONO ###\n");
			System.out.println("\n## LLAMADAS HORARIO NORMAL ##");
			for (int i = 0; i < llamadas.getLlamadasHorarioNormal().size(); ++i) {
				final Llamada ll = (Llamada) llamadas.getLlamadasHorarioNormal().elementAt(i);
				parcial = ll.aceptar(vn);
				System.out.println(ll.toString() + "\nImporte: " + parcial);
				total += parcial;
			}

			System.out.println("\n## LLAMADAS HORARIO REDUCIDO ##");
			for (int i = 0; i < llamadas.getLlamadasHorarioReducido().size(); ++i) {
				final Llamada ll = (Llamada) llamadas.getLlamadasHorarioReducido().elementAt(i);
				parcial = ll.aceptar(vr);
				System.out.println(ll.toString() + "\nImporte: " + parcial);
				total += parcial;
			}

			System.out.println("\n\n *** Importe Total: " + total + " ***");

		} catch (final Exception e) {
			e.toString();
		}
	}
}
