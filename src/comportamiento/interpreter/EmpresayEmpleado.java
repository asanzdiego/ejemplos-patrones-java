package comportamiento.interpreter;
//Relaciona un empleado con una empresa

public class EmpresayEmpleado {

	private final String empresa;

	private final String empleado;

	// constructor
	public EmpresayEmpleado(final String empresa, final String empleado) {
		this.empresa = empresa;
		this.empleado = empleado;
	}

	// metodos get
	public String getEmpresa() {

		return this.empresa;
	}

	public String getEmpleado() {

		return this.empleado;
	}
}