package creacion.prototype;
// -----------------------------------------------------------------------------

// EjemploClonacion.java
// -----------------------------------------------------------------------------

import java.util.Iterator;
import java.util.LinkedList;

public class EjemploClonacion implements Cloneable {

	private LinkedList nombres = new LinkedList();

	public EjemploClonacion() {
		this.nombres.add("Silvia");
		this.nombres.add("Juan");
		this.nombres.add("Antonio");
	}

	@Override
	public String toString() {

		final StringBuffer sb = new StringBuffer();
		final Iterator i = this.nombres.iterator();
		while (i.hasNext()) {
			sb.append("\n\t" + i.next());
		}
		return sb.toString();
	}

	// copia superficial
	@Override
	public Object clone() {

		try {
			return super.clone();
		} catch (final CloneNotSupportedException e) {
			throw new Error("Error en clone (debes implementar la interfaz Cloneable)");
		}
	}

	// copia profunda
	public Object deepClone() {

		try {
			final EjemploClonacion copia = (EjemploClonacion) super.clone();
			copia.nombres = (LinkedList) this.nombres.clone();
			return copia;
		} catch (final CloneNotSupportedException e) {
			throw new Error("Error en clone (debes implementar la interfaz Cloneable)");
		}
	}

	// comprobaciones
	@Override
	public boolean equals(final Object obj) {

		/* referencias iguales */
		if (obj == this) {
			return true;
		}

		/* referencia nula */
		if (obj == null) {
			return false;
		}

		/* referencias del mismo tipo */
		if (!(this.getClass() == obj.getClass())) {
			return false;
		} else {
			final EjemploClonacion tmp = (EjemploClonacion) obj;
			if (this.nombres == tmp.nombres) {
				return true;
			} else {
				return false;
			}
		}

	}

	public static void main(final String[] args) {

		final EjemploClonacion ec1 = new EjemploClonacion();
		System.out.println("\nEjemploClonacion[1]\n" + "-----------------" + ec1);

		final EjemploClonacion ec2 = (EjemploClonacion) ec1.clone();
		System.out.println("\nEjemploClonacion[2]\n" + "-----------------" + ec2);

		System.out.println("\nCopia superficial\n" + "--------------------\n" + "    ec1.equals(ec2) : "
		        + ec1.equals(ec2) + "\n" + "    ec1 == ec2      : " + (ec1 == ec2));

		final EjemploClonacion ec3 = (EjemploClonacion) ec1.deepClone();
		System.out.println("\nCopia profunda\n" + "--------------------\n" + "    ec1.equals(ec3) : " + ec1.equals(ec3)
		        + "\n" + "    ec1 == ec3      : " + (ec1 == ec3));

		System.out.println();
	}

}
