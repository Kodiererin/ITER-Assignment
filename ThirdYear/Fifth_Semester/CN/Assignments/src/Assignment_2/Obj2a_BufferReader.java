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
	static void writeFile() {
		System.out.println("Time Efficiency Using Buffered Stream (With Buffer)");

		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		 long startTimeBuffered = System.nanoTime();
        writeFileBuffered(text);
        long endTimeBuffered = System.nanoTime();
        long timeBuffered = endTimeBuffered - startTimeBuffered;
        System.out.println("Time taken using buffered stream (with buffer): " + timeBuffered + " nanoseconds");
        sc.close();
		
	}
	public static void writeFileBuffered(String text) {
        try {
            File file = new File("Objective2a_BufferedWithBuffer.txt");
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(text.getBytes());
            bos.close();
            System.out.println("File Write Completed (Buffered with buffer)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
