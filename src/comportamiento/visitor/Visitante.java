package comportamiento.visitor;

/*Interfaz Visitante. Define un metodo visitar para cada una de las clases
 *concretas a visitar*/
public interface Visitante {

	public double visitar(LlamadaMetropolitana metropoli);

	public double visitar(LlamadaProvincial prov);

	public double visitar(LlamadaInterprovincial intprov);
}
