package creacion.builder;

/**
 *
 * Cliente
 */
public class Cliente {

	public static void main(final String[] args) {

		Pizza pizza;
		final Cocinero cocinero = new Cocinero();
		final PizzaBuilder bpb = new BarbacoaPizzaBuilder();
		final PizzaBuilder cpb = new CarbonaraPizzaBuilder();

		cocinero.setPizzaBuilder(bpb);
		cocinero.crearPizza();
		pizza = cocinero.getPizza();
		System.out.println(pizza.toString());

		cocinero.setPizzaBuilder(cpb);
		cocinero.crearPizza();
		pizza = cocinero.getPizza();
		System.out.println(pizza.toString());
	}

}
