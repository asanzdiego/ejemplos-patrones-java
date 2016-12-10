package estructurales.decorator;

public class CuentaGeneral implements Cuenta {

	private double saldo;

	private final Cliente cliente;

	private final Fecha2 fecApertura;

	public CuentaGeneral(final double saldoini, final Cliente cliente) {
		this.saldo = saldoini;
		this.cliente = cliente;
		this.fecApertura = new Fecha2();
	}

	@Override
	public double saldo() {

		return this.saldo;
	}

	@Override
	public void ingresar(final double cantidad) {

		this.saldo += cantidad;
	}

	@Override
	public void retirar(final double cantidad) {

		this.saldo -= cantidad;
	}

	@Override
	public Cliente getCliente() {

		return this.cliente;
	}

	@Override
	public Fecha2 getFecApe() {

		return this.fecApertura;
	}

	@Override
	public String toString() {

		return "\n### Informacion cuenta:\n Cliente: \n" + this.cliente.toString() + "\n Fecha apertura: "
		        + this.fecApertura;
	}

	@Override
	public void aplicaIntereses() {

	}
}