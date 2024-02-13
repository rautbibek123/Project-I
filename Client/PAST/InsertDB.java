package Client.PAST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDB {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String password = "Pea@#123";  // Provide your actual password here
try {
    try (Connection connection = DriverManager.getConnection(url, user, password)) {
        try (Statement statement = connection.createStatement()) {
            // Create the table if it doesn't exist
//                String createTableSQL = "CREATE TABLE IF NOT EXISTS Student_1 ("
//                        + "id INT AUTO_INCREMENT PRIMARY KEY,"
//                        + "name VARCHAR(255),"
//                        + "age INT check(age > 18))"; // Added closing parenthesis
//                statement.executeUpdate(createTableSQL);

            // Insert data into the table
//             String updateDataSQL = "UPDATE Student_1 SET  name = 'Hari' WHERE age = 30";
//                int rowsAffected = statement.executeUpdate(updateDataSQL);
//                System.out.println(rowsAffected + " row(s) updated.");

            // Insert data into the table
//                String insertDataSQL = "INSERT INTO Student_1 (name, age) VALUES "
//                        + "('John Doe', 25),"
//                        + "('Jane Smith', 30)";
//                int rowsAffected = statement.executeUpdate(insertDataSQL);
//                System.out.println(rowsAffected + " row(s) inserted.");


//                 String deleteDataSQL = "DELETE FROM Student_1 WHERE  name = 'Ram' ";
//              int rowsAffected = statement.executeUpdate(deleteDataSQL);
//               System.out.println(rowsAffected + " row(s) updated.");
//            String selectDataSQL = "SELECT * FROM student_1";
//            try (ResultSet resultSet = statement.executeQuery(selectDataSQL)) {
//                // Iterate over the result set and display information
//                while (resultSet.next()) {
//                    int id = resultSet.getInt("id");
//                    String name = resultSet.getString("name");
//                    int age = resultSet.getInt("age");
//                    System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
//                }
//            }
        }
    }

        } catch (SQLException e) {
            System.out.println("Connection failed. Check the stack trace.");
            e.printStackTrace();
        }
     }
}