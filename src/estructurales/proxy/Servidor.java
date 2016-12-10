package estructurales.proxy;

public interface Servidor {

	public String subir(String nomFich);

	public Fichero bajar(String id);

	public String listado();
}