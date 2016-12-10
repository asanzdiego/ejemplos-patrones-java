package creacion.objectpool;
// JDBCConnectionImpl.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Vector;

public class JDBCConexionImpl {

	// nombre de la instancia de la base de datos
	private String nombreBD;

	private Connection con; // conexion con la BD

	private JDBCConexionImpl(final String nombreBD) throws SQLException, // constructor
	                                                                     // privado
	        ClassNotFoundException {
		this.nombreBD = nombreBD;

		// codigo para crar la conexion a Access
		if (nombreBD == "access") {
			// Cargamos los drivers
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// Hacemos la conexion
			this.con = DriverManager.getConnection("jdbc:odbc:AccessODBC", "", "");
			return;
		}

		// si no se encuentra el nombre de la base
		throw new ClassNotFoundException();
		// return;
	}

	String getNombreBD() {

		return this.nombreBD;
	}

	Connection getConexion() {

		return this.con;
	}

	static class JDBCPool {

		// diccionario de nombres de BBDD con su correspondiente vector de
		// conexiones
		private final Hashtable tablaPiscinas = new Hashtable();

		// metodos y atributos para el patron Singleton
		private JDBCPool() {
		} // constructor privado

		private static JDBCPool _instancia; // obtenemos la instancia de la
		                                    // clase

		private final int maxTamPiscina = 50; // tamanio maximo de la piscina

		private static int contObjPiscina = 0; // contador de objetos en la
		                                       // piscina

		// Singleton
		public static JDBCPool getInstancia() {

			if (JDBCPool._instancia == null) {
				synchronized (JDBCPool.class) {
					if (JDBCPool._instancia == null) {
						JDBCPool._instancia = new JDBCPool();
					}
				}
			}
			return JDBCPool._instancia;
		}

		// obtenemos una conexion de la piscina
		public synchronized JDBCConexionImpl obtenerImpl(final String nombreBD)
		        throws SQLException, ClassNotFoundException, ErrorPiscina {

			// obtenemos la piscina relacionandolo al nombre de la base de datos
			final Vector pool = (Vector) this.tablaPiscinas.get(nombreBD);

			if (pool != null) {
				final int size = pool.size();
				System.out.println("### Tamanio inicial de la piscina:" + size);
				if (size > 0) {
					JDBCConexionImpl impl = null;
					// devolvemos las conexiones existentes no usadas
					impl = (JDBCConexionImpl) pool.elementAt(size - 1);
					// quitamos la conexion de la piscina
					pool.removeElementAt(size - 1);
					// devolvemos la conexion
					System.out.println(" * OBTENEMOS UNA CONEXION DE LA PISCINA");
					System.out.println("###	Tamanio final de la piscina: " + pool.size());
					return impl;
				}
			}

			if (JDBCPool.contObjPiscina < this.maxTamPiscina) {
				// la piscina esta vacia asi q creamos una nueva conexion
				System.out.println("\n * CREAMOS UNA NUEVA CONEXION");
				JDBCPool.contObjPiscina++;
				return new JDBCConexionImpl(nombreBD);
			} else {
				// la piscina esta vacia y se ha alcanzado el numero maximo de
				// conexiones
				throw new ErrorPiscina("\nNumero maximo de conexiones alcanzadas para " + nombreBD);
				// return;
			}
		}

		// devolvemos la conexion a la piscina
		public synchronized void devolverImpl(final JDBCConexionImpl impl) {

			final String nombreBD = impl.getNombreBD();
			Vector pool = (Vector) this.tablaPiscinas.get(nombreBD);
			if (pool == null) {
				pool = new Vector();
				this.tablaPiscinas.put(nombreBD, pool);
			}
			System.out.println("### Tamanio inicial piscina: " + pool.size());
			pool.addElement(impl);
			System.out.println("* GUARDAMOS LA NUEVA CONEXION EN LA PISCINA");
			System.out.println("### Tamanio final piscina: " + pool.size());
		}
	}

}
