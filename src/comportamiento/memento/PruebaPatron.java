package comportamiento.memento;

public class PruebaPatron {

	public static void main(final String args[]) {

		try {
			// partidas
			final Partida p1 = new Partida("p1", "fase 1");
			final Partida p2 = new Partida("p2", "fase 2");
			final Partida p3 = new Partida("p3", "fase 3");

			// originador
			final Originador originador = new Originador();

			// conserje
			final Conserje conserje = new Conserje();

			// establecemos partidas y guardamos sus recuerdos para poder
			// recuperarlos
			originador.setPartida(p1);
			conserje.setRecuerdo(originador.crearRecuerdo());

			originador.setPartida(p2);
			conserje.setRecuerdo(originador.crearRecuerdo());

			originador.setPartida(p3);
			conserje.setRecuerdo(originador.crearRecuerdo());

			// recuperamos la partida 1
			originador.setRecuerdo(conserje.getRecuerdo(0));
			System.out.println(originador.getPartida().toString());
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}