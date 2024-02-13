package Client.PAST;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApplication extends JFrame implements ActionListener {
    // Components
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    // Constructor
    LoginApplication() {
        // Set frame properties
        setTitle("Login Application");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Username Label
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(30, 30, 80, 25);
        add(usernameLabel);

        // Username Text Field
        usernameField = new JTextField();
        usernameField.setBounds(110, 30, 150, 25);
        add(usernameField);

        // Password Label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(30, 65, 80, 25);
        add(passwordLabel);

        // Password Field
        passwordField = new JPasswordField();
        passwordField.setBounds(110, 65, 150, 25);
        add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(110, 100, 80, 25);
        loginButton.addActionListener(this);
        add(loginButton);

        // Set frame visibility
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the entered username and password
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Check if the username and password are correct
        if (username.equals("Admin") && password.equals("admin")) {
            JOptionPane.showMessageDialog(this, "Login Success");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Login");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the LoginApplication class
        new LoginApplication();
    }
}

