package estructurales.adapter;
//Clase para manejar fechas en USA (MM,DD,AAAA)

import java.util.StringTokenizer;

class FechaUS {

	// atributos
	private int year;

	private int month;

	private int day;

	// constructores
	public FechaUS(final int month, final int day, final int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public FechaUS(final String date) {
		final StringTokenizer st = new StringTokenizer(date, ",");
		final String mm = st.nextToken();
		final String dd = st.nextToken();
		final String aa = st.nextToken();

		this.day = Integer.parseInt(dd);
		this.month = Integer.parseInt(mm);
		this.year = Integer.parseInt(aa);
	}

	// metodos
	@Override
	public String toString() {

		return this.month + "," + this.day + "," + this.year;
	}

	public int getYear() {

		return this.year;
	}

	public void setYear(final int year) {

		this.year = year;
	}

	public int getDay() {

		return this.day;
	}

	public void setDay(final int day) {

		this.day = day;
	}

	public int getMonth() {

		return this.month;
	}

	public void setMonth(final int month) {

		this.month = month;
	}
}
