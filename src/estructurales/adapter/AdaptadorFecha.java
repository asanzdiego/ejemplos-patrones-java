package estructurales.adapter;
//Clase para adaptar fechas USA (MM,DD,AAAA) a ES (DD/MM/AAAA)

import java.util.StringTokenizer;

class AdaptadorFecha implements Fecha {

	// Adapta el objeto de tipo Fecha USA
	FechaUS fus;

	// constructor
	public AdaptadorFecha(final FechaUS fus) {
		this.fus = fus;
	}

	// metodos
	@Override
	public String toString() {

		final StringTokenizer st = new StringTokenizer(this.fus.toString(), ",");
		final String mm = st.nextToken();
		final String dd = st.nextToken();
		final String aaaa = st.nextToken();

		return dd + "/" + mm + "/" + aaaa;
	}

	@Override
	public int getAnio() {

		return this.fus.getYear();
	}

	@Override
	public void setAnio(final int anio) {

		this.fus.setYear(anio);
	}

	@Override
	public int getDia() {

		return this.fus.getDay();
	}

	@Override
	public void setDia(final int dia) {

		this.fus.setDay(dia);
	}

	@Override
	public int getMes() {

		return this.fus.getMonth();
	}

	@Override
	public void setMes(final int mes) {

		this.fus.setMonth(mes);
	}
}
