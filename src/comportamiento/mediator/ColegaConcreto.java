package comportamiento.mediator;

public class ColegaConcreto extends Colega {

	public ColegaConcreto(final Mediador mediador) {
		super(mediador);
	}

	@Override
	public void enviar(final String mensaje, final int id) {

		this.getMediador().enviar(mensaje, id);
	}

	@Override
	public void recibir(final String mensaje) {

		System.out.println("# ColegaConcreto " + this.getId() + " ha recibido el mensaje:\n" + mensaje);
	}
}