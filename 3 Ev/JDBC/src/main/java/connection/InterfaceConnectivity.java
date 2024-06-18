package connection;

import java.sql.Connection;
import java.sql.SQLException;

public interface InterfaceConnectivity {
	String DRIVER = "org.mariadb.jdbc.Driver";
	String URL = "jdbc:mariadb://127.0.0.1:3306/estudiantes";
	String USER = "root";
	String PASS = "";
	String BBDD = "estudiantes";

	Connection obtenerConexion() throws SQLException, ClassNotFoundException;
}
