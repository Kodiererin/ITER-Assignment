import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Obj_1 {

	public static void main(String[] args) throws Exception, IOException {
		show();
		String Hostname="www.google.com";
		int port=80;
//		int IPAddress="";
		Socket socket = new Socket(Hostname,port);
		System.out.println(socket.getLocalAddress());
		System.out.println(socket.getLocalPort());
		System.out.println(socket.getInetAddress());
		System.out.println(socket.getPort());
		socket.close();
		 
	}
	public static void show() {
		System.out.println("Registration No : 2141011063");
		System.out.println("Name : Ujjwal Kumar");
	}
}
