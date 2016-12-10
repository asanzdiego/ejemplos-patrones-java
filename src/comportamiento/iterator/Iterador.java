package comportamiento.iterator;

public interface Iterador {

	Object primero() throws IndexOutOfBoundsException;

	Object siguiente() throws IndexOutOfBoundsException;

	boolean hayMas();

	Object elementoActual() throws IndexOutOfBoundsException;
}