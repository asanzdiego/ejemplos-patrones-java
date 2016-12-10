package comportamiento.mediator;

/**
 * Implementa comportamiento del Mediador
 * coordinando todos los colegas.
 */
import java.util.ArrayList;

public class MediadorConcreto implements Mediador {

	private final ArrayList<Colega> colegas = new ArrayList<Colega>();

	@Override
	public void setColega(final Colega colega) {

		this.colegas.add(colega);
	}

	@Override
	public Colega getColega(final int indice) {

		return this.colegas.get(indice);
	}

	@Override
	public void enviar(final String mensaje, final int id) {

		if (id == -1) {
			for (int i = 0; i < this.colegas.size(); i++) {
				this.getColega(i).recibir(mensaje);
			}
		} else {
			this.getColega(id).recibir(mensaje);
		}
	}
}