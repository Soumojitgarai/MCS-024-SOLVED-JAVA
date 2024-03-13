import java.sql.*;

// Assuming you have the necessary JDBC driver and connection details

public class DisplayStudents {

    public static void main(String[] args) throws SQLException {
        // Replace with your actual connection details
        String url = "jdbc:mysql://localhost:3306/Student";
        String username = "your_username";
        String password = "your_password";

        // Connect to the database
        Connection connection = DriverManager.getConnection(url, username, password);

        // Create a statement object
        Statement statement = connection.createStatement();

        // Execute the SELECT query
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Student");

        // Display the results
        while (resultSet.next()) {
            int studentId = resultSet.getInt("student_ID");
            String studentName = resultSet.getString("student_name");
            String programme = resultSet.getString("programme");

            System.out.printf("Student ID: %d, Name: %s, Programme: %s\n", studentId, studentName, programme);
        }

        // Close the connections
        resultSet.close();
        statement.close();
        connection.close();
    }
}

