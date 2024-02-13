package Client.PAST;
import java.net.*;

public class UDPClient {

    public static void main(String[] args) throws Exception {
        int port = 5000; // Specify port number
        String message = "Hello from the client!";

        try (DatagramSocket clientSocket = new DatagramSocket()) {
            InetAddress serverAddress = InetAddress.getByName("localhost"); // Modify if server is on another machine

            byte[] data = message.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, serverAddress, port);

            clientSocket.send(packet); // Send message
            System.out.println("Sent: " + message);

            // Optional: Wait for a response
            byte[] buffer = new byte[1024];
            DatagramPacket replyPacket = new DatagramPacket(buffer, buffer.length);
            clientSocket.setSoTimeout(1000); // Set timeout for waiting
            try {
                clientSocket.receive(replyPacket);
                String reply = new String(replyPacket.getData(), 0, replyPacket.getLength());
                System.out.println("Received: " + reply);
            } catch (SocketTimeoutException e) {
                System.out.println("Timed out waiting for response.");
            }
        }
    }
}
