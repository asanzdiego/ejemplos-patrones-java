package comportamiento.visitor;

public class VisitanteHorarioReducido implements Visitante {

	@Override
	public double visitar(final LlamadaMetropolitana metropoli) {

		return metropoli.getDuracion() * 0.0099;
	}

	@Override
	public double visitar(final LlamadaProvincial prov) {

		return prov.getDuracion() * 0.0264;
	}

	@Override
	public double visitar(final LlamadaInterprovincial intprov) {

		return intprov.getDuracion() * 0.0378;
	}
}