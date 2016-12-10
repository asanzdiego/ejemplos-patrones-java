package estructurales.proxy;

public class Proxy implements Servidor {

	private Servidor serv;

	public Proxy(final Servidor serv) {
		this.serv = serv;
	}

	public void setServidor(final Servidor serv) {

		this.serv = serv;
	}

	public Servidor getServidor() {

		return this.serv;
	}

	@Override
	public String subir(final String nomFich) {

		return "\n(Subiendo desde el proxy...)" + this.serv.subir(nomFich);
	}

	@Override
	public Fichero bajar(final String id) {

		return this.serv.bajar(id);
	}

	@Override
	public String listado() {

		return "\n(Listando desde el proxy...)" + this.serv.listado();
	}

}
