package creacion.objectpool;
//Excepcion que maneja el caso en que alcancemos el tamanio maximo de

//conexiones en la piscina

public class ErrorPiscina extends Exception {

	// constructores
	public ErrorPiscina() {
		super("Superado el numero maximo de conexiones a la BD");
	}

	public ErrorPiscina(final String s) {
		super(s);
	}
}
