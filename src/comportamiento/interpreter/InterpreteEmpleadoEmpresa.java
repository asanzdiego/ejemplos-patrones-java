package comportamiento.interpreter;

// Muestra los empleados ordenados por empresa
import java.util.ArrayList;
import java.util.ListIterator;

public class InterpreteEmpleadoEmpresa implements Interprete {

	// implementacion del metodo interpretar de la interfaz Interprete
	@Override
	public void interpretar(final Contexto contexto) {

		// obtenemos las empresas
		final ArrayList empresas = contexto.getEmpresas();
		final ListIterator iteradorEmpresas = empresas.listIterator(); // iterador
		while (iteradorEmpresas.hasNext()) {
			final String empresa = (String) iteradorEmpresas.next(); // empresa
			                                                         // actual
			// obtenemos los empleados de la empresa actual
			final ArrayList empleadosyempresas = contexto.getEmpleadosPorEmpresa(empresa);
			System.out.println("Empresa:" + empresa);
			final ListIterator iteratorEmpleadosyEmpresas = empleadosyempresas.listIterator();
			System.out.print("Empleados: ");
			while (iteratorEmpleadosyEmpresas.hasNext()) {
				// mostramos los empleados
				System.out.print((String) iteratorEmpleadosyEmpresas.next() + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}