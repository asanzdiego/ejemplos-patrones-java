package comportamiento.mediator;

/**
 * Define una interface para comunicarse con los colegas.
 */
public interface Mediador {

	public void setColega(Colega colega);

	public Colega getColega(int indice);

	public void enviar(String mensaje, int id);
}