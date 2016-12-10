package comportamiento.visitor;

public class VisitanteHorarioNormal implements Visitante {

	@Override
	public double visitar(final LlamadaMetropolitana metropoli) {

		return metropoli.getDuracion() * 0.0240;
	}

	@Override
	public double visitar(final LlamadaProvincial prov) {

		return prov.getDuracion() * 0.0384;
	}

	@Override
	public double visitar(final LlamadaInterprovincial intprov) {

		return intprov.getDuracion() * 0.0645;
	}
}