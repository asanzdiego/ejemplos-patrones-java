package estructurales.bridge;

public class CensoAbstRef extends CensoAbst {

	// devuelve los telefonos de las personas ordenadas
	@Override
	public Object[] ordena() {

		final Object[] personasOrdenadas = super.ordena();
		final Object[] telefonos = new Object[personasOrdenadas.length];

		for (int i = 0; i < personasOrdenadas.length; i++) {
			final Persona per = (Persona) personasOrdenadas[i];
			telefonos[i] = per.getTfno();
		}
		return telefonos;
	}
}