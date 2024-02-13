package Client.PAST;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GridLayoutT extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button;
    public GridLayoutT() {
        super("Text Field Check");
        setLayout(new GridLayout(4, 1));

        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        button = new JButton("Check");

        add(new JLabel("Text Field 1:"));
        add(textField1);
        add(new JLabel("Text Field 2:"));
        add(textField2);
        // Create separate JPanel for the button with FlowLayout
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(button);
        add(buttonPanel); // Add the JPanel containing the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                if (text1.equals(text2)) {
                    getContentPane().setBackground(Color.GREEN);
                } else {
                    getContentPane().setBackground(Color.RED);
                }
            }
        });
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutT();
    }
}
