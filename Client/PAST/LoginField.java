package Client.PAST;
import javax.swing.*;
import java.awt.*;
public class LoginField extends JFrame  {
    public static JTextField usernameField;
    public static JPasswordField passwordField;
    public LoginField() {
        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Sign In");
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Empty label for visual balance
        panel.add(loginButton);
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new LoginField();
    }
}
