package operations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableOperations {

    public static void createTable(Connection conn) {
        String query = "CREATE TABLE IF NOT EXISTS users (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(100) NOT NULL," +
                "email VARCHAR(100) NOT NULL UNIQUE)";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Table 'users' created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertUser(Connection conn, String name, String email) {
        String query = "INSERT INTO users (name, email) VALUES ('" + name + "', '" + email + "')";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("User inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteUser(Connection conn, int id) {
        String query = "DELETE FROM users WHERE id = " + id;
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("User deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateUserEmail(Connection conn, int id, String newEmail) {
        String query = "UPDATE users SET email = '" + newEmail + "' WHERE id = " + id;
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("User email updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectUsers(Connection conn) {
        String query = "SELECT * FROM users";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
