package comportamiento.command;
//Clase para manejar fechas con horas (DD/MM/AAAA/HO:MI)

import java.util.Calendar;
import java.util.StringTokenizer;

class FechaHora {

	// atributos
	private int anio;

	private int mes;

	private int dia;

	private int hora;

	private int min;

	// constructores
	public FechaHora(final int dia, final int mes, final int anio, final int hora, final int min) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.hora = hora;
		this.min = min;
	}

	public FechaHora(final String cadenaFecha) {
		final StringTokenizer st = new StringTokenizer(cadenaFecha, "/:");
		final String dd = st.nextToken();
		final String mm = st.nextToken();
		final String aa = st.nextToken();
		final String ho = st.nextToken();
		final String mi = st.nextToken();

		this.dia = Integer.parseInt(dd);
		this.mes = Integer.parseInt(mm);
		this.anio = Integer.parseInt(aa);
		this.hora = Integer.parseInt(ho);
		this.min = Integer.parseInt(mi);
	}

	public FechaHora() {
		final Calendar hoy = Calendar.getInstance();
		this.anio = hoy.get(Calendar.YEAR);
		this.mes = hoy.get(Calendar.MONTH) + 1;
		this.dia = hoy.get(Calendar.DAY_OF_MONTH);
		this.hora = hoy.get(Calendar.HOUR_OF_DAY);
		this.min = hoy.get(Calendar.MINUTE);
	}

	// metodos
	@Override
	public String toString() {

		if (this.min < 10) {
			return this.dia + "/" + this.mes + "/" + this.anio + "/" + this.hora + ":0" + this.min;
		} else {
			return this.dia + "/" + this.mes + "/" + this.anio + "/" + this.hora + ":" + this.min;
		}
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

	public int getHora() {

		return this.hora;
	}

	public void setHora(final int hora) {

		this.hora = hora;
	}

	public int getMin() {

		return this.min;
	}

	public void setMin(final int min) {

		this.min = min;
	}

}
