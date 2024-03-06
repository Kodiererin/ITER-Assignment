

//(ii) Write a program to create URL objects for http://www.ibiblio.org/ and 
//http://ibiblio.org/ and tells you if they’re the same using the equals () method.

import java.net.URI;

public class Question_2 {
	public static void main(String[] args) {
		intro();
		try {
			System.out.println("Is the URL Same ? "+new java.net.URL("http://www.ibiblio.org/").equals(new URI("http://ibiblio.org/")));				
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
