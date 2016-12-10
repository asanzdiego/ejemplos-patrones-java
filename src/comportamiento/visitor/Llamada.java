package comportamiento.visitor;

/*Llamada. Representa un elemento que sera visitado. Define el metodo
 *aceptar, que acepta a un visitante para que realice las acciones oportunas*/
public abstract class Llamada {

	private int duracion; // duracion de la llamada en minutos

	private int hora; // hora a la que se hizo la llamada

	private char dia; // dia de la semana en que se hizo la llamada (L..D)

	public Llamada(final int minutos, final int hora, final char dia) {
		this.duracion = minutos;
		this.hora = hora;
		this.dia = dia;
	}

	public void setDuracion(final int minutos) {

		this.duracion = minutos;
	}

	public int getDuracion() {

		return this.duracion;
	}

	public void setHora(final int hora) {

		this.hora = hora;
	}

	public int getHora() {

		return this.hora;
	}

	public void setDia(final char dia) {

		this.dia = dia;
	}

	public int getDia() {

		return this.dia;
	}

	@Override
	public String toString() {

		return "# Llamada realizada el dia " + this.dia + " a las " + this.hora + " horas, con una duracion de "
		        + this.duracion + " minutos.";
	}

	public abstract double aceptar(Visitante visitante); // metodo aceptar
}
