import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Obj1 {

    public static void main(String[] args) {
    	System.out.println("Name : Ujjwal Kumar \nRegistration Number : 2141011063");
        String hostname = "www.google.com"; // Replace with your desired hostname or IP address
        int port = 80; // Replace with your desired port number

        try {
            Socket socket = new Socket(hostname, port);
            System.out.println("Local Address: " + socket.getLocalAddress());
            System.out.println("Local Port: " + socket.getLocalPort());
            System.out.println("Inet Address: " + socket.getInetAddress());
            System.out.println("Port: " + socket.getPort());
            socket.close(); // Close the socket when done
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
