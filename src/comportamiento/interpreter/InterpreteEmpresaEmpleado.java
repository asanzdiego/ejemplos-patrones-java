package comportamiento.interpreter;
// Muestra las empresas por empleado

import java.util.ArrayList;
import java.util.ListIterator;

public class InterpreteEmpresaEmpleado implements Interprete {

	@Override
	public void interpretar(final Contexto contexto) {

		// seleccionamos los empleados
		final ArrayList empleados = contexto.getEmpleados();
		final ListIterator iteradorEmpleados = empleados.listIterator();
		// mientras haya empleadoes...
		while (iteradorEmpleados.hasNext()) {
			final String empleado = (String) iteradorEmpleados.next();
			System.out.println("Empleado: " + empleado);
			// obtenemos las empresas en los que ha trabajado
			final ArrayList empleadosyempresas = contexto.getEmpresasPorEmpleado(empleado);
			final ListIterator iteradorEmpresasyEmpleados = empleadosyempresas.listIterator();
			// los mostramos
			System.out.print("Empresas: ");
			while (iteradorEmpresasyEmpleados.hasNext()) {
				System.out.print((String) iteradorEmpresasyEmpleados.next() + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}