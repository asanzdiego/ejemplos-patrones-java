package creacion.prototype.version1;

import java.util.Vector;

public class PruebaPrototype1 {

	Persona juan, luis;

	Vector tfnos = new Vector();

	public PruebaPrototype1() {
		final Fecha2 f1 = new Fecha2(15, 3, 1965);
		this.tfnos.add("918885566");
		this.tfnos.add("606997755");
		this.juan = new Persona("15664386T", "Juan", f1, "calle", this.tfnos);
		this.luis = (Persona) this.juan.clone();
	}

	public void test() {

		System.out.print("Juan: ");
		System.out.println(this.juan.toString());
		System.out.print("Luis: ");
		System.out.println(this.luis.toString());
		System.out.println("--------------------COPIA PROFUNDA---------------\n" + "    juan == luis      : "
		        + (this.juan == this.luis) + "\n" + "    juan.equals(luis) : " + this.juan.equals(this.luis));

	}

	public static void main(final String[] args) {

		final PruebaPrototype1 prueba = new PruebaPrototype1();
		prueba.test();
	}

}
