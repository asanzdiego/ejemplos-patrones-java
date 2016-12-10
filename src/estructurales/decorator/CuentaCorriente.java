package estructurales.decorator;

public class CuentaCorriente extends Decorador {

	// tarjeta de credito asociada a la cuenta corriente
	private final String tarjetaCredito;

	public CuentaCorriente(final Cuenta c, final String tc) {
		super(c);
		this.tarjetaCredito = tc;
	}

	public String getTarjeta() {

		return this.tarjetaCredito;
	}

	@Override
	public void aplicaIntereses() {

		final double interes = 0.5; // 0.5% de intereres para todas las cuentas
		                            // corrientes
		final double saldoActual = super.saldo();
		super.getCuenta().ingresar(saldoActual * (interes / 100));
	}

	@Override
	public String toString() {

		return super.toString() + "\nTarjeta de Credito: " + this.tarjetaCredito;
	}
}