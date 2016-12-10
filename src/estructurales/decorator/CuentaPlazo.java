package estructurales.decorator;

public class CuentaPlazo extends Decorador {

	// interes aplicado a la cuenta a plazo
	private final double interes;

	// plazo en anios
	private final int plazo;

	public CuentaPlazo(final Cuenta c, final double interes, final int plazo) {
		super(c);
		this.interes = interes;
		this.plazo = plazo;
	}

	@Override
	public void aplicaIntereses() {

		final double saldoActual = super.saldo();
		super.getCuenta().ingresar(saldoActual * (this.interes / 100) * this.plazo);
	}

	public double getInteres() {

		return this.interes;
	}

	public int getPlazo() {

		return this.plazo;
	}

	@Override
	public String toString() {

		return super.toString() + "\nInteres: " + this.interes + " - Plazo: " + this.plazo;
	}
}