package estructurales.bridge;

//Abstraccion
public class CensoAbst {

	// referencia al implementador
	protected CensoImp imp;

	// ordena el censo
	public Object[] ordena() {

		return this.imp.ordena();
	}

	// Asignamos un implementador concreto.
	public void setImplementador(final CensoImp ci) {

		this.imp = ci;
	}

	public CensoImp getImplementador() {

		return this.imp;
	}
}