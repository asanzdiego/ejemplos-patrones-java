package comportamiento.chainofresponsibility;

public class Cliente {

	public static void main(final String arg[]) {

		try {
			// Los manejadores
			final Manejador manejador1 = new ManejadorConcreto1();
			final Manejador manejador2 = new ManejadorConcreto2();
			final Manejador manejador3 = new ManejadorConcreto3();
			// Los sucesores
			manejador1.setSucesor(manejador2);
			manejador2.setSucesor(manejador3);

			// Calculamos cuanto nos cuesta enviar los paquetes
			final Paquete p1 = new Paquete("Bicicleta", "Madrid Capital", 300);
			final Paquete p2 = new Paquete("Ordenador", "Comunidad Madrid", 20);
			final Paquete p3 = new Paquete("PDA", "Burgos", 1);
			System.out.println("Coste envio paquete: \n" + p1.toString() + "\n" + manejador1.calculaCosteEnvio(p1));
			System.out.println("Coste envio paquete: \n" + p2.toString() + "\n" + manejador1.calculaCosteEnvio(p2));
			System.out.println("Coste envio paquete: \n" + p3.toString() + "\n" + manejador1.calculaCosteEnvio(p3));
		} catch (final Exception e) {
			e.toString();
		}
	}
}