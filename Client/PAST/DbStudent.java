package Client.PAST;
import java.sql.*;
public class DbStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db_std";
        String user = "root";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            // Print the total number of students
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM tbl_std");
            if (resultSet.next()) {
                System.out.println("Total number of students: " + resultSet.getInt(1));
            }
            // Find the average mark
            resultSet = statement.executeQuery("SELECT AVG(mark) FROM tbl_std");
            if (resultSet.next()) {
                System.out.println("Average mark: " + resultSet.getDouble(1));
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
