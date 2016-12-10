package comportamiento.command;

//interfaz comando. Modela el comportamiento generico de los comandos
public interface Comando {

	void setReunion(Reunion reunion);

	Reunion getReunion();

	void ejecutar(String param);
}