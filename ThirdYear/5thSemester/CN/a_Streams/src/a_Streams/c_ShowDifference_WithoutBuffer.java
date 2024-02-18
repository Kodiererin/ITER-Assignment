package a_Streams;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class c_ShowDifference_WithoutBuffer {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World");
		FileReader fr = new FileReader("myFile.txt");
		int i = fr.read();
		while(i!=-1) {
			
		}
	}
}
