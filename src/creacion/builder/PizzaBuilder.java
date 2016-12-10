package creacion.builder;

/**
 *
 * Constructor
 */
public abstract class PizzaBuilder {

	protected Pizza pizza;

	public Pizza getPizza() {

		return this.pizza;
	}

	public void crearNuevaPizza() {

		this.pizza = new Pizza();
	}

	public abstract void ponerNombre();

	public abstract void crearMasa();

	public abstract void crearSalsa();

	public abstract void crearIngredientes();

}
