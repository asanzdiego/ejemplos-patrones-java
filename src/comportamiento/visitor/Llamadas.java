package comportamiento.visitor;
/**
 * Es el responsable de guardar todas las llamadas que se han realizado y clasificarlas.
 */

import java.util.Vector;

public class Llamadas {

	private final Vector llamadasHorarioReducido = new Vector();

	private final Vector llamadasHorarioNormal = new Vector();

	// aniade una llamada a la lista dependiendo de su tipo (reducida o normal)
	public void aniadirLlamada(final Llamada llamada) {

		if ((llamada.getDia() == 'L') || (llamada.getDia() == 'M') || (llamada.getDia() == 'X')
		        || (llamada.getDia() == 'J') || (llamada.getDia() == 'V')) {
			if ((llamada.getHora() >= 8) && (llamada.getHora() < 18)) {
				this.llamadasHorarioNormal.addElement(llamada);
			} else {
				this.llamadasHorarioReducido.addElement(llamada);
			}
		} else {
			this.llamadasHorarioReducido.addElement(llamada);
		}
	}

	// devuelve todas las llamadas de horario reducido
	public Vector getLlamadasHorarioReducido() {

		return this.llamadasHorarioReducido;
	}

	// devuelve todas las llamadas de horario normal
	public Vector getLlamadasHorarioNormal() {

		return this.llamadasHorarioNormal;
	}
}