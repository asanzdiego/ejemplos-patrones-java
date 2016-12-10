package creacion.abstractfactory;

public abstract class FechaNum {

	private int dia;

	private int mes;

	private int anio;

	public abstract String presentaFN();

	public int getAnio() {

		return this.anio;
	}

	public void setAnio(final int a) {

		this.anio = this.anio;
	}

	public int getDia() {

		return this.dia;
	}

	public void setDia(final int dia) {

		this.dia = dia;
	}

	public int getMes() {

		return this.mes;
	}

	public void setMes(final int mes) {

		this.mes = mes;
	}

}