package comportamiento.observer;

public interface Sujeto {

	// establece un valor al que monitorizar su cotizacion
	public void setValor(Valor v);

	// devuelve el valor que monitoriza
	public Valor getValor();

	// aniade un observador a la lista
	public void aniadirObservador(Observador o);

	// elimina un observador de la lista
	public void eliminarObservador(Observador o);

	// notifica a todos los observadores de que se ha producido un cambio
	public void notificarObservadores();
}
