import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class P2PFileSharingSystem {

    private static final int PORT = 12345;
    private static final String SHARED_DIRECTORY = "shared-files/";
    private static final String DOWNLOADS_DIRECTORY = "Downloads/";

    public static void main(String[] args) {
        // Replace these IP addresses with the actual IP addresses of the peers
        String senderIpAddress = "127.0.0.1";
        String receiverIpAddress = "127.0.0.1";

        // Simulate sender and receiver
        Thread senderThread = new Thread(() -> startSender(senderIpAddress));
        Thread receiverThread = new Thread(() -> startReceiver(receiverIpAddress));

        senderThread.start();
        receiverThread.start();
    }

    private static void startSender(String receiverIpAddress) {
        try (Socket socket = new Socket(receiverIpAddress, PORT);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream())) {

            // Files to send
            String[] filesToSend = {"file1.txt", "file2.txt", "file3.txt","pexels-ihsan-adityawarman-19133309.jpg"};

            for (String fileName : filesToSend) {
                // Send the file name
                objectOutputStream.writeObject(fileName);

                // Send the file content
                try (FileInputStream fileInputStream = new FileInputStream(SHARED_DIRECTORY + fileName)) {
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                        objectOutputStream.write(buffer, 0, bytesRead);
                    }
                }

                System.out.println("File '" + fileName + "' sent successfully.");
            }

            // Send a special string to signal the end of downloads
            objectOutputStream.writeObject("exit");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void startReceiver(String senderIpAddress) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Waiting for sender to connect...");

            // Wait for the sender to connect
            Socket senderSocket = serverSocket.accept();

            File downloadsDirectory = new File(DOWNLOADS_DIRECTORY);
            downloadsDirectory.mkdirs(); // Create Downloads directory if it doesn't exist

            try (ObjectInputStream objectInputStream = new ObjectInputStream(senderSocket.getInputStream())) {

                while (true) {
                    // Read the file name
                    String fileName;
                    try {
                        fileName = (String) objectInputStream.readObject();
                    } catch (EOFException eofException) {
                        // End of stream reached, no more files
                        break;
                    }

                    // Check for the "exit" signal
                    if ("exit".equalsIgnoreCase(fileName)) {
                        break;
                    }

                    // Read the file content
                    try (FileOutputStream fileOutputStream = new FileOutputStream(DOWNLOADS_DIRECTORY + fileName)) {
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = objectInputStream.read(buffer)) != -1) {
                            fileOutputStream.write(buffer, 0, bytesRead);
                        }
                    }

                    System.out.println("File '" + fileName + "' received successfully and saved in Downloads directory.");
                }

            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
