import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Obj2_Client {
	public static void main(String[] args) {
		System.out.println("Name : Ujjwal Kumar\r Registration Number : 2141011063");
        try {
            InetAddress serverAddress = InetAddress.getByName("localhost");
            DatagramSocket clientSocket = new DatagramSocket();

            byte[] sendData = new byte[1];
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9876);
            clientSocket.send(sendPacket);

            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);

            String serverTime = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server's Current Time: " + serverTime);

            clientSocket.close();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}
