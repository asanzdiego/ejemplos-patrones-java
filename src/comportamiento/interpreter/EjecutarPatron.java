package comportamiento.interpreter;
// Probamos el patron

public class EjecutarPatron {

	public static void main(final String[] args) {

		// creamos un contexto
		final Contexto contexto = new Contexto();
		// introducimos las empresas
		contexto.aniadirEmpresa("IBM");
		contexto.aniadirEmpresa("Indra");
		contexto.aniadirEmpresa("ONO");
		// y los empleados
		contexto.aniadirEmpleado("Juan");
		contexto.aniadirEmpleado("Marta");
		contexto.aniadirEmpleado("Javier");
		// relacionamos empresas y empleados
		contexto.aniadirEmpresayEmpleado(new EmpresayEmpleado("IBM", "Marta"));
		contexto.aniadirEmpresayEmpleado(new EmpresayEmpleado("ONO", "Juan"));
		contexto.aniadirEmpresayEmpleado(new EmpresayEmpleado("Indra", "Juan"));
		contexto.aniadirEmpresayEmpleado(new EmpresayEmpleado("Indra", "Javier"));
		// creamos un interprete para el cliente
		final InterpreteCliente cliente = new InterpreteCliente(contexto);
		// ponemos casos de prueba
		System.out.println("EJEMPLO DE PATRON INTERPRETE");
		System.out.println();
		System.out.println("Interpretando -> muestra empleados:");
		cliente.interpreta("muestra empleados");
		System.out.println("Interpretando -> muestra empleados por empresas:");
		cliente.interpreta("muestra empleados por empresas");
		System.out.println("Interpretando -> muestra empresas:");
		cliente.interpreta("muestra empresas");
		System.out.println("Interpretando -> muestra empresas por empleados:");
		cliente.interpreta("muestra empresas por empleados");
	}
}