package Assignment_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
 * Objective : 1 
 * 1. Illustration of Input and Output Streams
		a. WAP to create a text file and write data into it.
 */

public class Obj1_WriteData {
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
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String text = sc.nextLine();
		
		File yourFile = new File("User.txt");
		try {
			yourFile.createNewFile();
			FileOutputStream oFile = new FileOutputStream(yourFile, false); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		Path filePath = Paths.get("","","User.txt");
		System.out.println(filePath.toString());
		
		try {
			Files.writeString(filePath, text, StandardOpenOption.APPEND);
			
			String content = Files.readString(filePath);
			System.out.println("Output in the File : ");
			System.out.println(content);
		}catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
		
	}
}
