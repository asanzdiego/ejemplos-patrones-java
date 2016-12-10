package creacion.singleton;

public class SingletonOpt {

	private static SingletonOpt instancia = new SingletonOpt();

	private SingletonOpt() {
	}

	public static SingletonOpt getInstancia() {

		return SingletonOpt.instancia;
	}
}
