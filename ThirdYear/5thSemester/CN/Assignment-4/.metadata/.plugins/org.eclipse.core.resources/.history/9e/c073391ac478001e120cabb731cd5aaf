import java.util.*;
import java.net.*;


public class Objective_3 {
	public static void main(String[] args) {
		try {			
			checkAddress();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void checkAddress() {
		try {
			Enumeration<NetworkInterface> networkInterfaces  = NetworkInterface.getNetworkInterfaces();
			
			while (networkInterfaces.hasMoreElements()) {
	            NetworkInterface networkInterface = networkInterfaces.nextElement();
	            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();

	            while (inetAddresses.hasMoreElements()) {
	                InetAddress address = inetAddresses.nextElement();
	                if (!address.isLoopbackAddress()) {
	                    if (address instanceof java.net.Inet4Address) {
	                        System.out.println("IPv4 Address: " + address.getHostAddress());
	                    } else if (address instanceof java.net.Inet6Address) {
	                        System.out.println("IPv6 Address: " + address.getHostAddress());
	                    }
	                }
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }	}
}
