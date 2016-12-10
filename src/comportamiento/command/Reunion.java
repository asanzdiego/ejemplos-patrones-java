package comportamiento.command;
//Representa el receptor del patron.

public class Reunion {

	private String motivo; // motivo de la reunion

	private String participantes; // gente que ira a la reunion

	private String localizacion; // sitio en que se producira la reunion

	private FechaHora fecha; // fecha de la reunion

	public Reunion(final String motivo, final String participantes, final String localizacion, final FechaHora fecha) {
		this.motivo = motivo;
		this.participantes = participantes;
		this.localizacion = localizacion;
		this.fecha = fecha;
	}

	public String getMotivo() {

		return this.motivo;
	}

	public void setMotivo(final String nuevo) {

		this.motivo = nuevo;
	}

	public String getParticipantes() {

		return this.participantes;
	}

	public void setParticipantes(final String nuevos) {

		this.participantes = nuevos;
	}

	public String getLocalizacion() {

		return this.localizacion;
	}

	public void setLocalizacion(final String nueva) {

		this.localizacion = nueva;
	}

	public FechaHora getFecha() {

		return this.fecha;
	}

	public void setFecha(final FechaHora nueva) {

		this.fecha = nueva;
	}

	@Override
	public String toString() {

		return "\n#### reunion #### \n# " + this.motivo + " \n# " + this.participantes + " \n# " + this.localizacion
		        + " \n# " + this.fecha.toString();
	}
}