package creacion.builder;

/**
 *
 * Director
 */
public class Cocinero {

	private PizzaBuilder pizzaBuilder;

	public void setPizzaBuilder(final PizzaBuilder pb) {

		this.pizzaBuilder = pb;
	}

	public Pizza getPizza() {

		return this.pizzaBuilder.getPizza();
	}

	public void crearPizza() {

		this.pizzaBuilder.crearNuevaPizza();
		this.pizzaBuilder.ponerNombre();
		this.pizzaBuilder.crearMasa();
		this.pizzaBuilder.crearSalsa();
		this.pizzaBuilder.crearIngredientes();
	}

}
