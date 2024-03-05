import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.time.LocalDateTime;

public class Obj2_Server {
	public static void main(String[] args) {
		System.out.println("Name : Ujjwal Kumar\r Registration Number : 2141011063");
        try {
            DatagramSocket serverSocket = new DatagramSocket(9876);
            System.out.println("Server is running...");

            while (true) {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                LocalDateTime now = LocalDateTime.now();
                String dateTimeString = now.toString();
                byte[] sendData = dateTimeString.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
                        receivePacket.getAddress(), receivePacket.getPort());

                serverSocket.send(sendPacket);
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}
