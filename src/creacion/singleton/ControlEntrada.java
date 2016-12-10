package creacion.singleton;
/* Control de entrada para Patron Singleton */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControlEntrada {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	// Obtenemos una referencia al contador de login
	// private static ContadorLogin contador = ContadorLogin.getInstancia();

	private static String usuario, res;

	public static void main(final String args[]) {

		final ContadorLogin contador = ContadorLogin.getInstancia();
		while (true) {
			try {
				do {
					System.out.println("\n\n--- Operaciones de Login ---");
					System.out.println(" 1 - Login. ");
					System.out.println(" 2 - Salir. ");
					System.out.print(" Seleccione la operacion: ");
					ControlEntrada.res = ControlEntrada.entrada.readLine();
				} while (!ControlEntrada.res.equals("1") && !ControlEntrada.res.equals("2"));

				// login
				if (ControlEntrada.res.equals("1")) {
					System.out.println("\n -- Login -- ");
					System.out.print("Introduzca usuario: ");
					ControlEntrada.usuario = ControlEntrada.entrada.readLine();
					if (contador.devolverEstadoCuenta(ControlEntrada.usuario)) {
						System.out.println("Ya se ha registrado en el sistema.");
					} else {
						System.out.println("Bienvenido al sistema");
					}

				}
				// salir
				else if (ControlEntrada.res.equals("2")) {
					System.exit(0);
				}
			} catch (final IOException ioe) {
				System.out.println("\nError de entrada/salida: " + ioe.toString());
			} catch (final Exception e) {
				// Captura cualquier otra excepcion
				System.out.println(e.toString());
			}
		}
	}

}
