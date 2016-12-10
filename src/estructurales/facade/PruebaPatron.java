package estructurales.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaPatron {

	public static void main(final String args[]) throws IOException {

		final BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		final FachadaCajero fachada = new FachadaCajero();
		System.out.println("Introduce operacion cajero \n1- Sacar Dinero \n2- Recarga Movil \nOpcion:");
		final int opcion = Integer.parseInt(entrada.readLine());
		if (opcion == 1) {
			System.out.println(fachada.sacarDinero());
		} else {
			System.out.println(fachada.recargaMovil());
		}
	}
}