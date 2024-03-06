import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Obj1 {
    public static void main(String[] args) {
        System.out.println("Name: Ujjwal Kumar");
        System.out.println("Registration No: 2141011063");

        final int portNumber = 5555; // Choose any available port

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            System.out.println("Echo Server is listening on port " + portNumber);

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {

                    System.out.println("Accepted connection from client");

                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println("Received from client: " + line);
                        writer.println("Server Echo: " + line);
                    }
                } catch (IOException e) {
                    System.err.println("Error handling client connection: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Error creating server socket: " + e.getMessage());
        }
    }
}
