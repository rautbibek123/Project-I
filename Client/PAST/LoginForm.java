package Client.PAST;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Pea@#123";

    public LoginForm() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // empty label for spacing
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Validate credentials against the database
                if (validateLogin(username, password)) {
                    JOptionPane.showMessageDialog(LoginForm.this, "Login Successful. Welcome, " + username,
                            "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(LoginForm.this, "Invalid username or password",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    // Method to validate login credentials against the database
    private boolean validateLogin(String username, String password) {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD)) {
            String query = "SELECT * FROM user WHERE username = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next(); // If there is a match, the ResultSet will have at least one row
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm();
            }
        });
    }
}
