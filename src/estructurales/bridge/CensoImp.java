package estructurales.bridge;

//Implementador
//Clase general para manejar el censo
import java.util.Hashtable;

public abstract class CensoImp {

	protected Hashtable personas = new Hashtable();

	private Persona objper;

	// consulta los datos de una persona
	public Persona consultaPersona(final String dni) {

		this.objper = (Persona) this.personas.get(dni);
		if (this.objper != null) {
			return this.objper;
		} else {
			return null;
		}
	}

	// alta de una persona en el censo
	public void altaPersona(final Persona per) {

		this.personas.put(per.getDni(), per);
	}

	// baja de una persona del censo
	public boolean bajaPersona(final String dni) {

		this.objper = (Persona) this.personas.get(dni);
		if (this.objper != null) {
			this.personas.remove(dni);
			return true;
		} else {
			return false;
		}
	}

	// total personas en el censo
	public int numeroPersonas() {

		return this.personas.size();
	}

	// imprime el contenido del censo
	@Override
	public String toString() {

		return this.personas.toString();
	}

	// ordena el censo
	public abstract Object[] ordena();
}
