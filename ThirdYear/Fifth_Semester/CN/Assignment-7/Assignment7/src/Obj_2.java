import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Obj_2 {
	public static void main(String[] args) throws Exception {
		show();
		String serverAddress = "time.nist.gov";
		int port = 13;
		
		Socket socket = new Socket(serverAddress , port);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("Server Response ");
		String data;
		while((data=br.readLine())!=null) {
			System.out.print(data+"");
		}
		socket.close();
	}
	public static void show() {
		System.out.println("Registration No : 2141011063");
		System.out.println("Name : Ujjwal Kumar");
	}
}