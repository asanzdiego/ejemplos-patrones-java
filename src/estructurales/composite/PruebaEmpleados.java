package estructurales.composite;

public class PruebaEmpleados {

	public static void main(final String args[]) {

		final Empleado e1 = new Empleado("programador1", 800);
		final Empleado e2 = new Empleado("programador2", 1200);
		final Empleado e3 = new Empleado("programador3", 900);
		final Empleado e4 = new Empleado("programador4", 1100);
		final Jefe j1 = new Jefe("analista1", 1500);
		final Jefe j2 = new Jefe("analista2", 1500);
		final Jefe j3 = new Jefe("jefe proyecto", 2000);

		j1.aniadirSubordinado(e1);
		j1.aniadirSubordinado(e2);
		j2.aniadirSubordinado(e3);
		j2.aniadirSubordinado(e4);
		j3.aniadirSubordinado(j1);
		j3.aniadirSubordinado(j2);

		System.out.println("Empleados:\n" + j3.getDesc());

		System.out.println("\nSalarios: " + j3.getSalarios());
	}
}
