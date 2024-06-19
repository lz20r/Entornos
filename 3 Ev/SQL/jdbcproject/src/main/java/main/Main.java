package main;

import config.DatabaseConnection;
import operations.DatabaseOperations;
import operations.TableOperations;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            // Registrar el controlador JDBC
            DatabaseConnection.registerDriver();

            // Crear una base de datos
            DatabaseOperations.createDatabase("testdb");

            // Usar la base de datos y realizar operaciones
            try (Connection conn = DatabaseConnection.getConnection("testdb")) {
                DatabaseOperations.useDatabase(conn, "testdb");

                // Crear una tabla
                TableOperations.createTable(conn);

                // Insertar usuarios
                TableOperations.insertUser(conn, "John Doe", "john@example.com");
                TableOperations.insertUser(conn, "Jane Doe", "jane@example.com");

                // Actualizar el correo electrónico de un usuario
                TableOperations.updateUserEmail(conn, 1, "john.doe@example.com");

                // Seleccionar y mostrar todos los usuarios
                TableOperations.selectUsers(conn);

                // Eliminar un usuario
                TableOperations.deleteUser(conn, 2);
            }

            // Eliminar la base de datos
            DatabaseOperations.dropDatabase("testdb");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
