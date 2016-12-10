package creacion.singleton;

public class Singleton {

	private static Singleton instancia;

	private Singleton() {
	}

	public static Singleton getInstancia() {

		if (Singleton.instancia == null) {
			Singleton.instancia = new Singleton();
		}
		return Singleton.instancia;
	}
}
