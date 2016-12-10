package comportamiento.chainofresponsibility;

public class ManejadorConcreto3 extends Manejador {

	// resto de zonas
	@Override
	public double calculaCosteEnvio(final Paquete p) {

		return (p.getPeso() * 1.5) + 8;
	}
}