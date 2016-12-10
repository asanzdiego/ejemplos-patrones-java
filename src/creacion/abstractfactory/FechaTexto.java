package creacion.abstractfactory;

public abstract class FechaTexto {

	private String dia;

	private String mes;

	private String anio;

	public abstract String presentaFT();

	public String getAnio() {

		return this.anio;
	}

	public void setAnio(final String a) {

		this.anio = this.anio;
	}

	public String getDia() {

		return this.dia;
	}

	public void setDia(final String dia) {

		this.dia = dia;
	}

	public String getMes() {

		return this.mes;
	}

	public void setMes(final String mes) {

		this.mes = mes;
	}

}