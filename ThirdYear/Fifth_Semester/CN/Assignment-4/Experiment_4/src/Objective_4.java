import java.io.*;
import java.net.*;
import java.util.*;
import static java.lang.System.out;

public class Objective_4 {

    public static void main(String args[]) throws SocketException {
    	System.out.println("--------------------------------------------------------------");
    	System.out.println("Name : Ujjwal Kumar");
    	System.out.println("Registration Number : 2141011063");
    	System.out.println("Section  : C");
    	System.out.println("--------------------------------------------------------------");
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets))
            displayInterfaceInformation(netint);
    }

    static void displayInterfaceInformation(NetworkInterface netint) throws SocketException {
        System.out.printf("Display name: %s\n", netint.getDisplayName());
        System.out.printf("Name: %s\n", netint.getName());
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
            System.out.printf("InetAddress: %s\n", inetAddress);
        }
        System.out.printf("\n");
     }
}  