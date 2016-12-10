package comportamiento.command;

public class Invocador {

	// el comando al que le pediremos que ejecute la peticion
	private ComandoDeshacer comando;

	public void setComando(final ComandoDeshacer comando) {

		this.comando = comando;
	}

	public void ejecutaComando(final String param) {

		this.comando.ejecutar(param);
	}

	public void deshacerComando() {

		this.comando.deshacer();
	}

	public void rehacerComando() {

		this.comando.rehacer();
	}
}
