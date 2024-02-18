package Assignment_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Obj2b_WithoutBufferedReader {
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
		
		System.out.println("Time Efficiency Using Buffered Stream (Without Buffer)");

        // Get text input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text that you want to write into the file: ");
        String text = scanner.nextLine();

        // Write to file using buffered stream without buffer
        long startTimeBufferedWithoutBuffer = System.nanoTime();
        writeFileBufferedWithoutBuffer(text);
        long endTimeBufferedWithoutBuffer = System.nanoTime();

        // Calculate and display time taken for buffered stream without buffer
        long timeBufferedWithoutBuffer = endTimeBufferedWithoutBuffer - startTimeBufferedWithoutBuffer;
        System.out.println("Time taken using buffered stream (without buffer): " + timeBufferedWithoutBuffer + " nanoseconds");
	}
	
	static void writeFileBufferedWithoutBuffer(String text) {
		 try {
	            File file = new File("Objective2a_BufferedWithoutBuffer.txt");
	            file.createNewFile();
	            FileOutputStream fos = new FileOutputStream(file);
	            fos.write(text.getBytes());
	            fos.close();
	            System.out.println("File Write Completed (Buffered without buffer)");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
