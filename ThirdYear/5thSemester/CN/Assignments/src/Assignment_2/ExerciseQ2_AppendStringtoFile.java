package Assignment_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExerciseQ2_AppendStringtoFile {
	public static void main(String[] args) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Name : Ujjwal Kumar");
			System.out.println("Registration Number : 2141011063");
			System.out.println("Section : C");
			System.out.println("Branch : Computer Science Engineering");
			System.out.println("-----------------------------------------------------------------");
			
			appendTextFile();
		}
		static void appendTextFile() {
	        String filePath = "Ujjwal.txt";
	        String contentToAppend = "I am Updating the File.";

	        appendToFile(filePath, contentToAppend);
		}
		static void appendToFile(String filePath , String content) {
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
	            writer.write(content);
	            System.out.println("String appended to file successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			
		}
}
