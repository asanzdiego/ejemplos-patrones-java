package creacion.objectpool;
//Cliente del Object Pool

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ClienteOP {

	static JDBCConexion conexion; // conexion con la base de datos a traves del
	                              // OP

	static ResultSet resultado; // resultados de la consulta

	static ResultSetMetaData tabla; // formato de la tabla

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	static String sqlQuery;

	public static void main(final String[] args) {

		final int cols = 0;
		final boolean hayResultados;
		ClienteOP.conexion = new JDBCConexion("access");

		try {
			do {
				System.out.println("\nIntroduzca una consulta SQL (o salir):\n");
				ClienteOP.sqlQuery = ClienteOP.entrada.readLine();
				if (ClienteOP.sqlQuery.toLowerCase().equals("salir")) {
					ClienteOP.conexion.finalizar();
					System.out.println("\nConexion cerrada.");
					System.exit(0);
				}
				// enviamos la sentencia
				ClienteOP.conexion.enviarPeticion(ClienteOP.sqlQuery);

				// obtenemos los resultados
				ClienteOP.resultado = ClienteOP.conexion.getRs();
				ClienteOP.tabla = ClienteOP.resultado.getMetaData();

				// mostramos los datos por pantalla
				if (ClienteOP.resultado != null) {
					ClienteOP.imprimirResultados();
				} else {
					System.out.println("\nSentencia ejecutada.");
				}

				// cerramos la conexion
				ClienteOP.conexion.cerrarPeticion();
			} while (true);// fin del do-while
		} catch (final Exception e) {
			System.out.println("Error.");
			System.out.println(e.getMessage());
		} // fin del try-catch
	}// fin de la funcion

	static public void imprimirResultados() throws SQLException {

		int numeroColumnas, i;
		numeroColumnas = ClienteOP.tabla.getColumnCount();
		System.out.println("\n\n***** Resultado de la consulta *****");
		for (i = 1; i <= numeroColumnas; i++) {
			System.out.print(ClienteOP.tabla.getColumnLabel(i) + "\t");
		} // fin del for
		System.out.println("\n");
		while (ClienteOP.resultado.next()) {
			for (i = 1; i <= numeroColumnas; i++) {
				System.out.print(ClienteOP.resultado.getString(i) + "\t");
			} // fin del for
			System.out.println("");
		} // fin del while
		System.out.println("\n\n");
	}// fin de la funcion
}
