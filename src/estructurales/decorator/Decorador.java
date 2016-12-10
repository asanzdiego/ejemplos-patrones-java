package estructurales.decorator;

public abstract class Decorador implements Cuenta {

	private Cuenta cuenta;

	public Decorador(final Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public void setCuenta(final Cuenta cuenta) {

		this.cuenta = cuenta;
	}

	public Cuenta getCuenta() {

		return this.cuenta;
	}

	@Override
	public double saldo() {

		return this.cuenta.saldo();
	}

	@Override
	public void ingresar(final double cantidad) {

		this.cuenta.ingresar(cantidad);
	}

	@Override
	public void retirar(final double cantidad) {

		this.cuenta.retirar(cantidad);
	}

	@Override
	public Cliente getCliente() {

		return this.cuenta.getCliente();
	}

	@Override
	public Fecha2 getFecApe() {

		return this.cuenta.getFecApe();
	}

	@Override
	public String toString() {

		return this.cuenta.toString();
	}

	@Override
	public abstract void aplicaIntereses();
}