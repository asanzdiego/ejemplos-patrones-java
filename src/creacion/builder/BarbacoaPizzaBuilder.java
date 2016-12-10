package creacion.builder;

/**
 *
 * Constructor Concreto
 */
public class BarbacoaPizzaBuilder extends PizzaBuilder {

	@Override
	public void ponerNombre() {

		this.pizza.setNombre("Barbacoa");
	}

	@Override
	public void crearMasa() {

		this.pizza.setMasa("gorda");
	}

	@Override
	public void crearSalsa() {

		this.pizza.setSalsa("barbacoa");
	}

	@Override
	public void crearIngredientes() {

		this.pizza.setIngredientes("mozzarella, ternera, cebolla, maiz");
	}

}
