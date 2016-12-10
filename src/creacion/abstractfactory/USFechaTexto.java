package creacion.abstractfactory;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class USFechaTexto extends FechaTexto {

	@Override
	public String presentaFT() {

		final Locale local = new Locale("en", "US");
		final Date hoy = new Date();
		final String hoystr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, local).format(hoy);
		return hoystr;
	}

}