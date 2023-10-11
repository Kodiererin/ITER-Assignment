package Assignment_2;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * Write a code to read the data from a file in byte and character format. (Specify the 
		method(s) and the operation(s) to extract the data from a text file.)
 */

public class ExerciseQ1_ReadFromFile {
	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Name : Ujjwal Kumar");
		System.out.println("Registration Number : 2141011063");
		System.out.println("Section : C");
		System.out.println("Branch : Computer Science Engineering");
		System.out.println("-----------------------------------------------------------------");
		
		readFromFile();
	}
	
	public static void readFromFile() {
		 String filePath = "Ujjwal.txt";
	        readBytesFromFile(filePath);
	        readCharactersFromFile(filePath);
	}

	public static void readBytesFromFile(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;
            System.out.println("Reading data from file in byte format:");
            while ((byteData = fis.read()) != -1) {
                System.out.print(byteData + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readCharactersFromFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            int charData;
            System.out.println("\n\nReading data from file in character format:");
            while ((charData = reader.read()) != -1) {
                System.out.print((char) charData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
