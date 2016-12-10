package estructurales.composite;

//Empleado sin subordinados
import java.util.Enumeration;

public class Empleado extends Trabajador {

	public Empleado(final String puesto, final float salario) {
		super(puesto, salario);
	}

	@Override
	public void aniadirSubordinado(final Trabajador t) {

	}

	@Override
	public void eliminarSubordinado(final Trabajador t) {

	}

	@Override
	public Enumeration empleadosSubordinados() {

		return null;
	}

	@Override
	public double getSalarios() {

		return this.salario;
	}

	@Override
	public String getDesc() {

		return "### " + super.toString();
	}
}
