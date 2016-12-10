package creacion.abstractfactory;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class PruebaLocale {

	public static void main(final String args[]) {

		System.out.println(Locale.getDefault());
		final Locale local = new Locale("en", "US");
		final Date hoy = new Date();
		final String hoystr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, local).format(hoy);
		System.out.println("Hoy: " + hoystr);
	}
}
