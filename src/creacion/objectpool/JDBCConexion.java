package creacion.objectpool;
// JDBCConnection.java

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConexion {

	// nombre de la instancia de la base de datos
	private final String nombreBD;

	// piscina de objetos
	private final JDBCConexionImpl.JDBCPool piscinaConexiones;

	// la conexion
	private JDBCConexionImpl impl;

	// JDBC statement y resultset
	private Statement stmt;

	private ResultSet rs;

	// flag: comprueba si hay un ResulSet abierto en uso
	private boolean enUso;

	// instancia a la piscina de conexiones
	public JDBCConexion(final String nombreBD) {
		this.nombreBD = nombreBD;
		this.piscinaConexiones = JDBCConexionImpl.JDBCPool.getInstancia();
		this.enUso = false;
	}

	// enviamos peticiones a la base
	void enviarPeticion(final String sqlString) throws SQLException, ClassNotFoundException, ErrorPiscina {

		if (this.enUso) {
			this.cerrarPeticion();
		}
		this.impl = this.piscinaConexiones.obtenerImpl(this.nombreBD);
		this.stmt = this.impl.getConexion().createStatement();
		// rs = stmt.executeQuery(sqlString);
		final boolean hayResultados = this.stmt.execute(sqlString);
		if (hayResultados) {
			this.rs = this.stmt.getResultSet();
		} else {
			this.rs = null;
		}
		this.enUso = true;
	}

	// devolvemos al cliente el ResultSet resultado de la consulta a la BD
	ResultSet getRs() {

		return this.rs;
	}

	// cerramos la peticion y devolvemos los recursos
	void cerrarPeticion() throws SQLException {

		this.rs.close();
		this.stmt.close();
		this.piscinaConexiones.devolverImpl(this.impl);
		this.enUso = false;
	}

	// liberamos los recursos cuando el objeto es destruido
	protected void finalizar() throws SQLException {

		if (this.enUso) {
			this.cerrarPeticion();
		}
	}

}
