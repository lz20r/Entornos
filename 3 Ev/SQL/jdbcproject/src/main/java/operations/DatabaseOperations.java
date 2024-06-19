package operations;

import config.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperations {

    public static void createDatabase(String dbName) {
        String query = "CREATE DATABASE " + dbName;
        try (Connection conn = DatabaseConnection.getConnection("");
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Database " + dbName + " created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void dropDatabase(String dbName) {
        String query = "DROP DATABASE " + dbName;
        try (Connection conn = DatabaseConnection.getConnection("");
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Database " + dbName + " dropped successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void useDatabase(Connection conn, String dbName) {
        String query = "USE " + dbName;
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Using database " + dbName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
