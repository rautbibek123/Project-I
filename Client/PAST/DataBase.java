package Client.PAST;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase{

    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String password = "Pea@#123";

        // Establish a connection
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database!");

            // Your database-related code goes here

        } catch (SQLException e) {
            System.out.println("Connection failed. Check the stack trace.");
            e.printStackTrace();
        }
    }
}

