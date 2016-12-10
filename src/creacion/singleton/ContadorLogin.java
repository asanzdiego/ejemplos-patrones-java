package creacion.singleton;
/*
 * Clase Singleton
 */

import java.util.Vector;

public class ContadorLogin {

	private final Vector usuarios = new Vector();

	private static ContadorLogin instancia;

	private ContadorLogin() {
	} // constructor privado

	public static ContadorLogin getInstancia() {

		if (ContadorLogin.instancia == null) {
			ContadorLogin.instancia = new ContadorLogin();
		}
		return ContadorLogin.instancia;
	}

	public boolean devolverEstadoCuenta(final String userId) {

		if (this.usuarios.contains(userId)) {
			return true;
		} else {
			this.usuarios.add(userId);
			return false;
		}
	}

	public void borrarLogin(final String userId) {

		this.usuarios.remove(userId);
	}

} // fin de la clase
