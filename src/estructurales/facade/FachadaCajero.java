package estructurales.facade;

/**
 * Simplifica el acceso a cada uno de los subsistemas de un sistema bancario a
 * traves del cajero.
 */

public class FachadaCajero {

	private final ValidacionUsuario val = new ValidacionUsuario();

	private final RetirarDinero ret = new RetirarDinero();

	private final RecargaMovil rec = new RecargaMovil();

	public String sacarDinero() {

		return this.val.valida() + this.ret.retirar();
	}

	public String recargaMovil() {

		return this.val.valida() + this.rec.recarga();
	}
}