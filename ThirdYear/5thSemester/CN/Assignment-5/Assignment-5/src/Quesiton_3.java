//Write a program to split URIs entered on the command line into their component 
//parts.

import java.net.URL;

public class Quesiton_3 {
	public static void main(String[] args) {
		intro();
		try {
			System.out.println("Enter the URL ");
			URL url = new URL(new java.util.Scanner(System.in).next());
			System.out.println("The Host of URL : "+url.toString()+" is : "+url.getHost());
			System.out.println("The Path  of URL : "+url.toString()+" is : "+url.getPath());
			System.out.println("The Port of URL : "+url.toString()+" is : "+url.getPort());
			System.out.println("The Authority  of URL : "+url.toString()+" is : "+url.getAuthority());
			System.out.println("The Protocol of URL : "+url.getProtocol()+" is : "+url.getProtocol());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void intro() {
		System.out.println("Name : Rohit Kumar");
		System.out.println("Registration Number : 2141011062");
		System.out.println("Section : C");
	
	}
}
