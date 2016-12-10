package comportamiento.strategy;

import java.util.ArrayList;

public class Contexto {

	private Estrategia estrategia;

	private final ArrayList<Universitario> alumnos;

	public Contexto(final Estrategia e, final ArrayList<Universitario> u) {
		this.estrategia = e;
		this.alumnos = u;
	}

	public void setEstrategia(final Estrategia e) {

		this.estrategia = e;
	}

	public void ejecutaEstrategia() {

		this.estrategia.ordena(this.alumnos);
		for (int i = 0; i < this.alumnos.size(); i++) {
			System.out.println(this.alumnos.get(i).toString());
		}
	}

}