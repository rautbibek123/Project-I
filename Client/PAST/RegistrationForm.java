package Client.PAST;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm implements ActionListener {

    private final JFrame frame;
    private final JTextField nameField;
    private final JTextField emailField;
    private final JButton submitButton;

    public RegistrationForm() {
        frame = new JFrame("User Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create form elements
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Create layout and add components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); // VBox

        JPanel namePanel = new JPanel();
        namePanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // HBox for alignment
        namePanel.add(nameLabel);
        namePanel.add(nameField);

        JPanel emailPanel = new JPanel();
        emailPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // HBox for alignment
        emailPanel.add(emailLabel);
        emailPanel.add(emailField); // Corrected line

        mainPanel.add(namePanel);
        mainPanel.add(emailPanel);
        mainPanel.add(submitButton);

        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Implement logic to handle form submission (e.g., validate data, save user information)
            System.out.println("Name: " + nameField.getText());
            System.out.println("Email: " + emailField.getText());
            // Clear the form after successful submission (optional)
            nameField.setText("");
            emailField.setText("");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
