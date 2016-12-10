package estructurales.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cliente {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	private static Servidor proxy = new Proxy(new ServidorFicheros("MiServidor"));

	public static void main(final String args[]) {

		String res, nom, id;

		while (true) {
			try {
				do {
					System.out.println("\n\n--- Operaciones del Servidor ---");
					System.out.println(" 1 - Subir fichero. ");
					System.out.println(" 2 - Bajar fichero. ");
					System.out.println(" 3 - Listado ficheros. ");
					System.out.println(" 4 - Salir. ");
					System.out.print(" Seleccione la operacion: ");
					res = Cliente.entrada.readLine();
				} while (!res.equals("1") && !res.equals("2") && !res.equals("3") && !res.equals("4"));

				// subir
				if (res.equals("1")) {
					System.out.println("\n -- Subir fichero -- ");
					System.out.print("Introduzca nombre fichero: ");
					nom = Cliente.entrada.readLine();
					System.out.println(Cliente.proxy.subir(nom));
				}

				// bajar
				else if (res.equals("2")) {
					System.out.println("\n -- Bajar fichero -- ");
					System.out.println(Cliente.proxy.listado());
					System.out.print("Introduzca id del fichero: ");
					id = Cliente.entrada.readLine();
					final Fichero fich = Cliente.proxy.bajar(id);
					System.out.println(fich.toString());
				}

				// listado
				else if (res.equals("3")) {
					System.out.println("\n -- Listado ficheros -- ");
					System.out.println(Cliente.proxy.listado());
				}

				// salir
				else if (res.equals("4")) {
					System.exit(0);
				}
			} catch (final NumberFormatException nfe) {
				System.out.println("\nError de formato numerico: " + nfe.toString());
			} catch (final IOException ioe) {
				System.out.println("\nError de entrada/salida: " + ioe.toString());
			} catch (final Exception e) {
				// Captura cualquier otra excepcion
				System.out.println(e.toString());
			}
		}
	}
}