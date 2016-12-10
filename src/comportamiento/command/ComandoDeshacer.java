package comportamiento.command;

//amplia la interfaz comando aniadiendo los metodos deshacer y rehacer
public interface ComandoDeshacer extends Comando {

	public void deshacer();

	public void rehacer();
}
