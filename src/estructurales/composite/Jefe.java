package estructurales.composite;

//Jefe con subordinados
import java.util.Enumeration;
import java.util.Vector;

public class Jefe extends Trabajador {

	Vector subordinados;

	public Jefe(final String puesto, final float salario) {
		super(puesto, salario);
		this.subordinados = new Vector();
	}

	@Override
	public void aniadirSubordinado(final Trabajador t) {

		this.subordinados.addElement(t);
	}

	@Override
	public void eliminarSubordinado(final Trabajador t) {

		this.subordinados.removeElement(t);
	}

	@Override
	public Enumeration empleadosSubordinados() {

		return this.subordinados.elements();
	}

	// salarios de sus subordinados
	@Override
	public double getSalarios() {

		double sum = this.salario; // el salario de este empleado
		// aniadimos el salario de sus subordinados
		for (int i = 0; i < this.subordinados.size(); i++) {
			sum += ((Trabajador) this.subordinados.elementAt(i)).getSalarios();
		}
		return sum;
	}

	// descripcion de sus subordinados
	@Override
	public String getDesc() {

		String desc = this.toString(); // el puesto de este empleado
		// aniadimos los puestos de sus subordinados
		for (int i = 0; i < this.subordinados.size(); i++) {
			desc += "\n\t### " + ((Trabajador) this.subordinados.elementAt(i)).getDesc();
		}
		return desc;
	}
}
