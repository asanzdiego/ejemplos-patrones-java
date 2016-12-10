package creacion.builder;

/**
 *
 * Producto
 */
public class Pizza {

	private String nombre;

	private String masa;

	private String salsa;

	private String ingredientes;

	public Pizza() {
	}

	public String getNombre() {

		return this.nombre;
	}

	public void setNombre(final String nombre) {

		this.nombre = nombre;
	}

	public String getMasa() {

		return this.masa;
	}

	public void setMasa(final String masa) {

		this.masa = masa;
	}

	public String getSalsa() {

		return this.salsa;
	}

	public void setSalsa(final String salsa) {

		this.salsa = salsa;
	}

	public String getIngredientes() {

		return this.ingredientes;
	}

	public void setIngredientes(final String ingredientes) {

		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {

		return "Pizza: " + this.getNombre() + " - " + this.getMasa() + " - " + this.getSalsa() + " - "
		        + this.getIngredientes();
	}

}
