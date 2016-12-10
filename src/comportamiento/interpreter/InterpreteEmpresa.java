package comportamiento.interpreter;
// Muestra las empresas

import java.util.ArrayList;
import java.util.ListIterator;

public class InterpreteEmpresa implements Interprete {

	// implementacion del metodo interpretar de la interfaz Interprete
	@Override
	public void interpretar(final Contexto contexto) {

		final ArrayList empresas = contexto.getEmpresas(); // empresas
		final ListIterator iteradorEmpresas = empresas.listIterator(); // iterador
		System.out.print("Empresas: ");
		while (iteradorEmpresas.hasNext()) {
			System.out.print((String) iteradorEmpresas.next() + ", ");
		}
		System.out.println("");
		System.out.println("");
	}
}
