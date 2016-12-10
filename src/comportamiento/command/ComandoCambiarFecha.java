package comportamiento.command;
//Implementa ComandoDeshacer. 

//Proporciona el comportamiento necesario para cambiar la fecha de una reunion

public class ComandoCambiarFecha implements ComandoDeshacer {

	private Reunion reunion; // referencia al receptor

	private FechaHora nuevaFecha; // cuando el usuario la cambie

	private FechaHora antiguaFecha; // guardara la antigua fecha

	@Override
	public Reunion getReunion() {

		return this.reunion;
	}

	@Override
	public void setReunion(final Reunion reunion) {

		this.reunion = reunion;
	}

	/*
	 * Cambia la fecha de la reunion por otra introducida por el usuario y
	 * almacena el valor anterior de la reunion por si luego se quiere recuperar
	 */
	@Override
	public void ejecutar(final String param) {

		this.antiguaFecha = this.reunion.getFecha();
		this.nuevaFecha = new FechaHora(param);
		this.reunion.setFecha(this.nuevaFecha);
	}

	// recupera el valor de la Reunion anterior al introducido por el usuario
	@Override
	public void deshacer() {

		this.reunion.setFecha(this.antiguaFecha);
	}

	/*
	 * recupera el valor introducido por el usuario despues de que se hubiera
	 * deshecho
	 */
	@Override
	public void rehacer() {

		this.reunion.setFecha(this.nuevaFecha);
	}
}
