package estructurales.decorator;
//Clase para manejar fechas (DD/MM/AAAA)

import java.util.Calendar;
import java.util.StringTokenizer;

class Fecha2 {

	// atributos
	private int anio;

	private int mes;

	private int dia;

	// constructores
	public Fecha2(final int dia, final int mes, final int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public Fecha2(final String cadenaFecha) {
		final StringTokenizer st = new StringTokenizer(cadenaFecha, "/");
		final String dd = st.nextToken();
		final String mm = st.nextToken();
		final String aa = st.nextToken();

		this.dia = Integer.parseInt(dd);
		this.mes = Integer.parseInt(mm);
		this.anio = Integer.parseInt(aa);
	}

	public Fecha2() {
		final Calendar hoy = Calendar.getInstance();
		this.anio = hoy.get(Calendar.YEAR);
		this.mes = hoy.get(Calendar.MONTH) + 1;
		this.dia = hoy.get(Calendar.DAY_OF_MONTH);
	}

	// metodos
	@Override
	public String toString() {

		return this.dia + "/" + this.mes + "/" + this.anio;
	}

	public int getAnio() {

		return this.anio;
	}

	public void setAnio(final int anio) {

		this.anio = anio;
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
