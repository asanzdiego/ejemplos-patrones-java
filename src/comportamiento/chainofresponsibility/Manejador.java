package comportamiento.chainofresponsibility;

public abstract class Manejador {

	private Manejador sucesor;

	public void setSucesor(final Manejador sucesor) {

		this.sucesor = sucesor;
	}

	public Manejador getSucesor() {

		return this.sucesor;
	}

	public abstract double calculaCosteEnvio(Paquete p);
}