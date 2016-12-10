package comportamiento.command;

// Crea la reunion, el comando y el invocador

public class Cliente {

	public static void main(final String args[]) {

		try {
			// fecha de la reunion
			final FechaHora fh = new FechaHora(1, 6, 2008, 10, 30);
			// la reunion
			final Reunion r = new Reunion("Proyecto", "Roberto, Maria, Javier", "Sala reunion 1", fh);
			System.out.println("\n- Antes de ejecutar los comandos:" + r.toString());

			// comando localizacion
			ComandoDeshacer comando = new ComandoCambiarLocalizacion();
			comando.setReunion(r);
			// invocador
			final Invocador inv = new Invocador();
			// establece y ejecuta el comando
			inv.setComando(comando);
			inv.ejecutaComando("Sala reunion 2");
			System.out.println("\n- Despues de ejecutar el comando localizacion:" + r.toString());
			inv.deshacerComando();
			System.out.println("\n- Deshacer:" + r.toString());
			inv.rehacerComando();
			System.out.println("\n- Rehacer:" + r.toString());
			// comando fecha
			comando = new ComandoCambiarFecha();
			comando.setReunion(r);
			// establece y ejecuta el comando
			inv.setComando(comando);
			inv.ejecutaComando("5/6/2008/12:30");
			System.out.println("\n- Despues de ejecutar el comando fecha:" + r.toString());
			inv.deshacerComando();
			System.out.println("\n- Deshacer:" + r.toString());
			inv.rehacerComando();
			System.out.println("\n- Rehacer:" + r.toString());
		} catch (final Exception e) {
			System.out.println(e.toString());
		}
	}
}
