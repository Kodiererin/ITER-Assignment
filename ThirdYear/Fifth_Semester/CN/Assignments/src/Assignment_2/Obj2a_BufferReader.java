package Assignment_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * 2. Illustration of filter stream using Buffered Stream
		a. WAP to show time efficiency using Buffered stream (I/O) using the buffer.
 */

public class Obj2a_BufferReader {
	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Name : Ujjwal Kumar");
		System.out.println("Registration Number : 2141011063");
		System.out.println("Section : C");
		System.out.println("Branch : Computer Science Engineering");
		System.out.println("-----------------------------------------------------------------");
		
		writeFile();
	}
	public static void writeFile() {
		System.out.println("Hello User , Enter the Text that you want to write into the File \n");
		Scanner sc = new java.util.Scanner(System.in);
		String text = sc.nextLine();
		
		File yourFile = new File("Objective2a.txt");
		try {
			yourFile.createNewFile();
			FileOutputStream fis = new FileOutputStream(yourFile);
			BufferedOutputStream bos = new BufferedOutputStream(fis);
			bos.write(text.getBytes());
			System.out.println("File Write Completed");
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
