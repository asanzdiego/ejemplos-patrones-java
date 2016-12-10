package estructurales.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cliente {

	public static void main(final String args[]) throws IOException {

		final BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		Fecha fecha;

		String f;

		System.out.println("Introduce fecha en formato USA (MM,DD,AAAA): ");
		f = entrada.readLine();
		fecha = new AdaptadorFecha(new FechaUS(f));
		System.out.println("Fecha adaptada en formato ES:");
		System.out.println(fecha.toString());
	}
}
