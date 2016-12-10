package comportamiento.chainofresponsibility;

public class ManejadorConcreto2 extends Manejador {

	@Override
	public double calculaCosteEnvio(final Paquete p) {

		if (p.getDestino().equals("Comunidad Madrid")) {
			return (p.getPeso() * 1.5) + 6;
		} else if (super.getSucesor() != null) {
			return this.getSucesor().calculaCosteEnvio(p);
		}

		return 0;

	}
}