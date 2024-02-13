package Client.PAST;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayDB {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String password = "Pea@#123";  // Provide your actual password here

        try {
            // Establish connection
            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                try (Statement statement = connection.createStatement()) {
                    // Select data from the table
                    String selectDataSQL = "SELECT * FROM student_1";
                    try (ResultSet resultSet = statement.executeQuery(selectDataSQL)) {
                        // Iterate over the result set and display information
                        while (resultSet.next()) {
                            int id = resultSet.getInt("id");
                            String name = resultSet.getString("name");
                            int age = resultSet.getInt("age");

                            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Database operation failed. Check the stack trace.");
            e.printStackTrace();
        }
    }
}

