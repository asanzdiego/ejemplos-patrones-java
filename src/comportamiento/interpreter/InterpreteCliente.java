package comportamiento.interpreter;
// Interpreta una expresion introducida por el cliente

import java.util.StringTokenizer;

public class InterpreteCliente {

	Contexto contexto;

	// constructor
	public InterpreteCliente(final Contexto contexto) {
		this.contexto = contexto;
	}

	// se interpreta la expresion introducida por el cliente
	public void interpreta(final String expresion) {

		final StringBuffer result = new StringBuffer("Resultado: ");

		String tokenActual;
		final StringTokenizer tokens = new StringTokenizer(expresion);

		char mostrar = ' '; // que hay que mostar?
		char mostrarPor = ' '; // por que cosa hay que ordenarlo?
		boolean usaPor = false; // hay que ordenarlo por algo?

		while (tokens.hasMoreTokens()) // analizamos la cadena expresion
		{
			tokenActual = tokens.nextToken();
			if (tokenActual.equals("muestra")) /*
			                                    * en el caso de que el elemento
			                                    * de la orden sea muestra
			                                    */
			{
				continue;
			} // seguimos analizando mas elementos...
			else if (tokenActual.equals("empresas"))// si el elemento es
			                                        // empresas
			{
				if (mostrar == ' ') // y mostrar no esta inicializado
				{
					mostrar = 'E';
				} // lo inicializamos a E (de empresa)
				else // si ya estaba inicalizado
				{ // si utiliza por y mostrarPor no esta inicalizado
					if ((mostrarPor == ' ') && (usaPor)) {
						mostrarPor = 'E';
					} // lo inicializamos a E
				}
			}
			// lo mismo que antes para empleados
			else if (tokenActual.equals("empleados"))// si no es empresa
			{
				if (mostrar == ' ') // y mostrar no esta inicializado
				{
					mostrar = 'T';
				} // lo inicializamos a T (trabajador)
				else {// si utiliza Por y no esta inicializado
					if ((mostrarPor == ' ') && (usaPor)) {
						mostrarPor = 'T';
					} // lo inicializamos a T
				}
			}
			// si el elemento es por actualizamos usaPor
			else if (tokenActual.equals("por")) {
				usaPor = true;
			}

		} // while

		Interprete interprete = null;// declaramos un interprete

		switch (mostrar) {
			case 'T': // si es mostrar empleado
			{
				switch (mostrarPor) // y ademas por empresa
				{
					case 'E': { // invocamos un InterpreteEmpleado
						interprete = new InterpreteEmpleadoEmpresa();
						break;
					}
					default: {// sino es que no utliliza por y se invoca un
					          // InterpreteEmpleado
						interprete = new InterpreteEmpleado();
						break;
					}
				}
				break;
			}
			case 'E': // si es mostrar empresa
			{
				switch (mostrarPor) // y ademas por empleado
				{
					case 'T': { // InterpreteEmpresaEmpleado
						interprete = new InterpreteEmpresaEmpleado();
						break;
					}
					default: { // sino InterpreteEmpresa
						interprete = new InterpreteEmpresa();
						break;
					}
				}
				break;
			}

		}
		// interpretamos con el interprete que sea
		interprete.interpretar(this.contexto);
	}
}