package comportamiento.chainofresponsibility;

public class ManejadorConcreto1 extends Manejador {

	@Override
	public double calculaCosteEnvio(final Paquete p) {

		if (p.getDestino().equals("Madrid Capital")) {
			return (p.getPeso() * 1.5) + 3;
		} else if (super.getSucesor() != null) {
			return this.getSucesor().calculaCosteEnvio(p);
		}

		return 0;
	}
}