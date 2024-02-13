package Client.PAST;
import javax.swing.*;
import java.awt.*;
public class Square2D extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Set colors
        g.setColor(Color.RED);
        // Draw square
        g.fillRect(50, 50, 200, 200);
        // Set color for circle
        g.setColor(Color.GREEN);
        // Calculate center coordinates for circle
        int centerX = 50 + 200 / 2;
        int centerY = 50 + 200 / 2;
        // Calculate radius based on square dimensions
        int radius = 200 / 3;
        // Draw circle
        g.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
        // Set color for text
        g.setColor(Color.BLACK);
        // Set font
        g.setFont(new Font("Arial", Font.BOLD, 20));
        // Calculate text position based on square dimensions
        int textX = centerX - (g.getFontMetrics().stringWidth("All the Best") / 2);
        int textY = centerY - radius - g.getFontMetrics().getHeight() / 2;
        // Draw text
        g.drawString("All the Best", textX, textY);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw 2D Square");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Square2D());
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
