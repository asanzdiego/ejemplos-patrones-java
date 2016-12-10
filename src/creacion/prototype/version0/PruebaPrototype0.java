package creacion.prototype.version0;
/*********************************************************************
 * EJEMPLO DE PROTOTYPE PATTERN: constructor de copia
 *********************************************************************/

import java.util.Vector;

public class PruebaPrototype0 {

	Persona juan, luis;

	Vector tfnos = new Vector();

	public PruebaPrototype0() {
		final Fecha2 f1 = new Fecha2(15, 3, 1965);
		this.tfnos.add("918885566");
		this.tfnos.add("606997755");
		this.juan = new Persona("15664386T", "Juan", f1, "calle", this.tfnos);
		this.luis = new Persona(this.juan);
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

		final PruebaPrototype0 prueba = new PruebaPrototype0();
		prueba.test();
	}

}
