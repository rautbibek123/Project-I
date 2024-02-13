package Client.PAST;
import java.awt.*;
        import java.awt.event.*;

public class CloseAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("Close Window Example");
        frame.setSize(300, 300);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
