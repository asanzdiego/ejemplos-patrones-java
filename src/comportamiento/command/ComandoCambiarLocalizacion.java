package comportamiento.command;
//Implementa ComandoDeshacer. 

//Proporciona el comportamiento necesario para cambiar el lugar de una reunion

public class ComandoCambiarLocalizacion implements ComandoDeshacer {

	private Reunion reunion; // referencia al receptor

	private String nuevaLocalizacion; // cuando el usuario la cambie

	private String antiguaLocalizacion; // guardara la antigua localizacion

	@Override
	public Reunion getReunion() {

		return this.reunion;
	}

	@Override
	public void setReunion(final Reunion reunion) {

		this.reunion = reunion;
	}

	/*
	 * Cambia el lugar de la reunion por otro introducido por el usuario y
	 * almacena el valor anterior de la reunion por si luego se quiere recuperar
	 */
	@Override
	public void ejecutar(final String param) {

		this.antiguaLocalizacion = this.reunion.getLocalizacion();
		this.nuevaLocalizacion = param;
		this.reunion.setLocalizacion(this.nuevaLocalizacion);
	}

	// recupera el valor de la Reunion anterior al introducido por el usuario
	@Override
	public void deshacer() {

		this.reunion.setLocalizacion(this.antiguaLocalizacion);
	}

	/*
	 * recupera el valor introducido por el usuario despues de que se hubiera
	 * deshecho
	 */
	@Override
	public void rehacer() {

		this.reunion.setLocalizacion(this.nuevaLocalizacion);
	}
}