package Client.PAST;
import java.net.*;
import java.util.*;
public class PopUpMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("a. Print out all the IP addresses associated with netflix.com");
            System.out.println("b. Display the local host address");
            System.out.println("c. Print the loopback address");
            System.out.println("d. Exit");

            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    printNetflixIPAddresses();
                    break;
                case 'b':
                    displayLocalHostAddress();
                    break;
                case 'c':
                    printLoopbackAddress();
                    break;
                case 'd':
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    // Task a: Print out all the IP addresses associated with netflix.com
    private static void printNetflixIPAddresses() {
        try {
            InetAddress[] addresses = InetAddress.getAllByName("netflix.com");
            System.out.println("IP Addresses associated with netflix.com:");
            for (InetAddress address : addresses) {
                System.out.println(address);
            }
        } catch (UnknownHostException e) {
            System.out.println("Error: Unknown host.");
        }
    }
    // Task b: Display the local host address
    private static void displayLocalHostAddress() {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Address: " + localHost);
        } catch (UnknownHostException e) {
            System.out.println("Error: Unknown host.");
        }
    }
    // Task c: Print the loopback address
    private static void printLoopbackAddress() {
        InetAddress loopback = InetAddress.getLoopbackAddress();
        System.out.println("Loopback Address: " + loopback);
    }
}
