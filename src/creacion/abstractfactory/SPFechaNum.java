package creacion.abstractfactory;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class SPFechaNum extends FechaNum {

	@Override
	public String presentaFN() {

		final Locale local = new Locale("es", "ES");
		final Date hoy = new Date();
		final String hoystr = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, local).format(hoy);
		return hoystr;
	}

}