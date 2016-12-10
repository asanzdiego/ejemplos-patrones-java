package comportamiento.observer;

/**
 * Mantiene una referencia a un objeto SujetoConcreto Implementa la interfaz
 * Observador y define los metodos para responder a los mensajes recibidos del
 * sujeto.
 */

public class ObservadorConcreto implements Observador {

	private final String nombre; // nombre del observador

	private final double precioVentaAccion; // precio al que queremos vender

	private final Sujeto sujeto; // valor al que observamos

	private final int numAcciones; // cantidad de acciones

	public ObservadorConcreto(final String nombre, final double precio, final Sujeto sujeto, final int numAcciones) {
		this.nombre = nombre;
		this.precioVentaAccion = precio;
		this.sujeto = sujeto;
		this.numAcciones = numAcciones;
		sujeto.aniadirObservador(this);
	}

	@Override
	public String actualizar() {

		final double cot = this.sujeto.getValor().getCotizacion();
		String res = "Actualizando con cotizacion a: " + cot + ", y precio venta a:" + this.precioVentaAccion;

		if (cot >= this.precioVentaAccion) {
			final double total = cot * this.numAcciones;
			res += "\nEl observador " + this.nombre + " ha vendido sus " + this.numAcciones + " acciones a " + total
			        + " euros.";
			this.sujeto.eliminarObservador(this);
		} else {
			res += "\nEl observador " + this.nombre + " no vende sus acciones.";
		}

		return res;
	}
}