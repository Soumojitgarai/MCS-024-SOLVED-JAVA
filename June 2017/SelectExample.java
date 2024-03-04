import java.sql.*;

public class SelectExample {

    public static void main(String[] args) throws SQLException {
        // Connection details
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        // Establish connection
        Connection connection = DriverManager.getConnection(url, username, password);

        // Create a statement
        Statement statement = connection.createStatement();

        // Execute the SELECT query
        String query = "SELECT * FROM your_table";
        ResultSet resultSet = statement.executeQuery(query);

        // Process the result set
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            // ... access other columns as needed
            System.out.println("ID: " + id + ", Name: " + name);
        }

        // Close resources
        resultSet.close();
        statement.close();
        connection.close();
    }
}
