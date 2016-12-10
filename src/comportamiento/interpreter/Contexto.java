package comportamiento.interpreter;
// Almacena los empleados, empresas y sus relaciones

import java.util.ArrayList;
import java.util.ListIterator;

public class Contexto {

	private final ArrayList empresas = new ArrayList(); // los empresas

	private final ArrayList empleados = new ArrayList(); // los empleados

	private final ArrayList empresasyempleados = new ArrayList(); // las
	                                                              // relaciones

	// aniade una empresa a la lista
	public void aniadirEmpresa(final String empresa) {

		this.empresas.add(empresa);
	}

	// aniade un empleado a la lista
	public void aniadirEmpleado(final String empleado) {

		this.empleados.add(empleado);
	}

	// aniadimos una relacion entre empleado y empresa al array
	public void aniadirEmpresayEmpleado(final EmpresayEmpleado empresayempleado) {

		this.empresasyempleados.add(empresayempleado);
	}

	// metodos get para los arrays
	public ArrayList getEmpresas() {

		return this.empresas;
	}

	public ArrayList getEmpleados() {

		return this.empleados;
	}

	/*
	 * devuelve un array con los empleados que pertenecen a la empresa que se
	 * pasa como parametro
	 */
	public ArrayList getEmpleadosPorEmpresa(final String empresaEn) {

		final ArrayList empleadosPorEmpresa = new ArrayList();
		EmpresayEmpleado tempempresayempleado;
		final ListIterator iteradorEmpresasyEmpleados = this.empresasyempleados.listIterator();
		while (iteradorEmpresasyEmpleados.hasNext()) {
			tempempresayempleado = (EmpresayEmpleado) iteradorEmpresasyEmpleados.next();
			if (empresaEn.equals(tempempresayempleado.getEmpresa())) {
				empleadosPorEmpresa.add(tempempresayempleado.getEmpleado());
			}
		}
		return empleadosPorEmpresa;
	}

	/*
	 * devuelve un array con las empresas en las que ha trabajado el empleado
	 * que se pasa como parametro
	 */
	public ArrayList getEmpresasPorEmpleado(final String empleadoEn) {

		final ArrayList empresasPorEmpleado = new ArrayList();
		EmpresayEmpleado tempempresayempleado;
		final ListIterator iteradorEmpleadosyEmpresas = this.empresasyempleados.listIterator();
		while (iteradorEmpleadosyEmpresas.hasNext()) {
			tempempresayempleado = (EmpresayEmpleado) iteradorEmpleadosyEmpresas.next();
			if (empleadoEn.equals(tempempresayempleado.getEmpleado())) {
				empresasPorEmpleado.add(tempempresayempleado.getEmpresa());
			}
		}
		return empresasPorEmpleado;
	}
}