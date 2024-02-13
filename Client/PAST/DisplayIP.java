package Client.PAST;
import java.net.InetAddress;

public class DisplayIP{

    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        String address = ip.getHostAddress();

        System.out.println("Your IP address is: " + address);
    }
}
