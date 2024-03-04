import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionDemo {

    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        // Connect to the database
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database successfully!");

            // Close the connection (optional within try-with-resources)
            connection.close();
            System.out.println("Connection closed.");

        } catch (SQLException e) {
            System.err.println("Error connecting to database: " + e.getMessage());
        }

        // Using try-with-resources for automatic closing (recommended)
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected using try-with-resources.");
        } catch (SQLException e) {
            System.err.println("Error connecting using try-with-resources: " + e.getMessage());
        }
    }
}
