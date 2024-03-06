import java.net.InetAddress;
import java.net.UnknownHostException;

public class Objective_3 {
    public static void main(String[] args) {
    	System.out.println("--------------------------------------------------------------");
    	System.out.println("Name : Ujjwal Kumar");
    	System.out.println("Registration Number : 2141011063");
    	System.out.println("Section  : C");
    	System.out.println("--------------------------------------------------------------");
        try {
            String ipAddress = "192.168.1.1";

            InetAddress inetAddress = InetAddress.getByName(ipAddress);

            if (inetAddress instanceof java.net.Inet4Address) {
                System.out.println(ipAddress + " is an IPv4 address.");
            } else if (inetAddress instanceof java.net.Inet6Address) {
                System.out.println(ipAddress + " is an IPv6 address.");
            } else {
                System.out.println(ipAddress + " is not a valid IP address.");
            }
        } catch (UnknownHostException e) {
            System.err.println("Invalid IP address: " + e.getMessage());
        }
    }
}
