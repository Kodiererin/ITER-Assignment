import java.util.*;
import java.net.*;

public class Objective_2 {
	public static void main(String[] args) {
		try {
			InetAddress iNet = InetAddress.getLocalHost();
			System.out.println(iNet.getLocalHost().toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
