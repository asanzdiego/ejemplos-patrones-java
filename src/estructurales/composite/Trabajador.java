package estructurales.composite;

//Trabajador generico de una empresa
import java.util.Enumeration;

public abstract class Trabajador {

	protected String puesto;

	protected double salario;

	public Trabajador(final String puesto, final float salario) {
		this.puesto = puesto;
		this.salario = salario;
	}

	public String getPuesto() {

		return this.puesto;
	}

	public void setPuesto(final String nuevo) {

		this.puesto = nuevo;
	}

	public double getSalario() {

		return this.salario;
	}

	public void setSalario(final double nuevo) {

		this.salario = nuevo;
	}

	@Override
	public String toString() {

		return "puesto: " + this.puesto + " - Salario: " + this.salario;
	}

	public abstract void aniadirSubordinado(Trabajador t);

	public abstract void eliminarSubordinado(Trabajador t);

	public abstract Enumeration empleadosSubordinados();

	public abstract double getSalarios();

	public abstract String getDesc();
}
