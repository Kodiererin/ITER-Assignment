package a_Streams;
import java.io.*;
import java.util.Scanner;


public class a_FileInput {
	public static void main(String[] args) throws IOException {
    	System.out.println("--------------------------------------------------------------");
    	System.out.println("Name : Ujjwal kumar");
    	System.out.println("Registration Number : 2141011063");
    	System.out.println("Section  : C");
    	System.out.println("--------------------------------------------------------------");
		System.out.println("Enter The String ");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		File myfile = new File("myFile.txt");
		FileWriter writer = new FileWriter("myFile.txt");
		writer.write(data);
		writer.close();
	}
}
