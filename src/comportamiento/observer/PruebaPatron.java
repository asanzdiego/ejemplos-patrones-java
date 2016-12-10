package comportamiento.observer;

public class PruebaPatron {

	public static void main(final String args[]) {

		try {
			// valor
			final Valor v1 = new Valor("Jazztel", 0.25);

			// sujeto para monitorizar el valor
			final Sujeto sujeto = new SujetoConcreto();
			sujeto.setValor(v1);

			// observadores
			final Observador o1 = new ObservadorConcreto("o1", 0.3, sujeto, 200);
			final Observador o2 = new ObservadorConcreto("o2", 0.4, sujeto, 400);

			// notificamos a los observadores para que actualicen
			System.out.println("Notificamos...");
			sujeto.notificarObservadores();

			v1.setCotizacion(0.35); // cambiamos la cotizacion
			System.out.println("Notificamos...");
			sujeto.notificarObservadores();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}