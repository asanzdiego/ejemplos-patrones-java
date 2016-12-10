package comportamiento.iterator;

public class IteradorConcreto implements Iterador {

	private final AgregadoConcreto agregado;

	private int indice = 0;

	public IteradorConcreto(final AgregadoConcreto agregado) {
		this.agregado = agregado;
	}

	@Override
	public Object primero() throws IndexOutOfBoundsException {

		Object objeto = null;
		if (!this.agregado.elementos.isEmpty()) {
			this.indice = 0;
			objeto = this.agregado.elementos.firstElement();
		} else {
			throw new IndexOutOfBoundsException();
		}
		return objeto;
	}

	@Override
	public Object siguiente() throws IndexOutOfBoundsException {

		Object objeto = null;
		if (this.indice < this.agregado.elementos.size()) {
			objeto = this.agregado.elementos.elementAt(this.indice);
			this.indice += 1;
		} else {
			throw new IndexOutOfBoundsException();
		}
		return objeto;
	}

	@Override
	public boolean hayMas() {

		boolean resultado = true;
		if (this.agregado.elementos.isEmpty() || (this.indice == this.agregado.elementos.size())) {
			resultado = false;
		}
		return resultado;
	}

	@Override
	public Object elementoActual() throws IndexOutOfBoundsException {

		Object objeto = null;
		if (this.indice < this.agregado.elementos.size()) {
			objeto = this.agregado.elementos.elementAt(this.indice);
		} else {
			throw new IndexOutOfBoundsException();
		}
		return objeto;
	}
}