package Client.PAST;
import java.net.*;

public class UDPServer {

    public static void main(String[] args) throws Exception {
        int port = 5000; // Specify port number

        try (DatagramSocket serverSocket = new DatagramSocket(port)) {
            System.out.println("Server started on port " + port);

            while (true) {
                byte[] buffer = new byte[1024]; // Buffer for receiving data
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

                serverSocket.receive(packet); // Wait for message

                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received from " + packet.getAddress() + ":" + packet.getPort() + ": " + message);

                // Optional: Reply to the client
                byte[] reply = "Received your message!".getBytes();
                DatagramPacket replyPacket = new DatagramPacket(reply, reply.length, packet.getAddress(), packet.getPort());
                serverSocket.send(replyPacket);
            }
        }
    }
}
