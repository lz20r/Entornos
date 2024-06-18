package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection implements InterfaceConnectivity {
	public static void main(String[] args) {
		GetConnection getConnection = new GetConnection();
		try {
			Connection conexion = getConnection.obtenerConexion();
			if (conexion != null) {
				System.out.println("Conexión exitosa!");
				// Puedes hacer más operaciones con la conexión aquí
			}
		} catch (SQLException e) {
			System.out.println("Error de SQL: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador: " + e.getMessage());
		}
	}

	@Override
	public Connection obtenerConexion() throws SQLException, ClassNotFoundException {
		setDriver(DRIVER);
		return DriverManager.getConnection(URL, USER, PASS);
	}

	private void setDriver(String driver) throws ClassNotFoundException {
		Class.forName(driver);
	}
}
