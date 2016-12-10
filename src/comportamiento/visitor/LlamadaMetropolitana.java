package comportamiento.visitor;

public class LlamadaMetropolitana extends Llamada {

	private final double establecimiento = 0.0685;

	public LlamadaMetropolitana(final int minutos, final int hora, final char dia) {
		super(minutos, hora, dia);
	}

	/*
	 * Implementacion del metodo aceptar de la clase Llamada. Acepta la visita
	 * de un visitante concreto e invoca al metodo visitar del mismo para que
	 * realice la accion que deba. Se envia como parametro el propio objeto, que
	 * es el elemento visitado
	 */
	@Override
	public double aceptar(final Visitante visitante) {

		return this.establecimiento + visitante.visitar(this);
	}
}