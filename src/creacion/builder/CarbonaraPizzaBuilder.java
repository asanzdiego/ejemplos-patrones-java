package creacion.builder;

/**
 *
 * Constructor Concreto
 */
public class CarbonaraPizzaBuilder extends PizzaBuilder {

	@Override
	public void ponerNombre() {

		this.pizza.setNombre("Carbonara");
	}

	@Override
	public void crearMasa() {

		this.pizza.setMasa("fina");
	}

	@Override
	public void crearSalsa() {

		this.pizza.setSalsa("carbonara");
	}

	@Override
	public void crearIngredientes() {

		this.pizza.setIngredientes("mozzarella, bacon, cebolla");
	}

}
