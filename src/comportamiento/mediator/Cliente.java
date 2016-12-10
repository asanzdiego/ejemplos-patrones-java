package comportamiento.mediator;

public class Cliente {

	public static void main(final String args[]) {

		try {
			// El mediador
			final Mediador mediador = new MediadorConcreto();

			// Los colegas
			final Colega colega0 = new ColegaConcreto(mediador);
			final Colega colega1 = new ColegaConcreto(mediador);
			final Colega colega2 = new ColegaConcreto(mediador);

			// Enviamos mensajes
			System.out.println("Enviamos mensajes:");
			System.out.println("Enviamos mensaje del colega 0 al 2:");
			colega0.enviar("Hola desde el colega 0.", 2);
			colega1.enviar("Hola a todos.", -1);
		} catch (final Exception e) {
			e.toString();
		}
	}

}