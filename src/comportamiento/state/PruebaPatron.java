package comportamiento.state;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PruebaPatron {

	public static void main(final String args[]) {

		try {
			final BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("EJEMPLO DE PATRON ESTADO:");
			System.out.print("Introduce tu nombre: ");
			final String nombre = entrada.readLine();
			System.out.print("Introduce tus apellidos: ");
			final String apellidos = entrada.readLine();
			final Nombre nom = new Nombre(nombre, apellidos);
			final Contexto contexto = new Contexto();
			Estado estado;
			System.out.println("\n# Tu nombre con el estado NombreApellidos:");
			estado = new EstadoNombreApellidos();
			contexto.setEstado(estado);
			contexto.mostrar(nom);
			System.out.println("\n# Tu nombre con el estado ApellidosNombre:");
			estado = new EstadoApellidosNombre();
			contexto.setEstado(estado);
			contexto.mostrar(nom);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
