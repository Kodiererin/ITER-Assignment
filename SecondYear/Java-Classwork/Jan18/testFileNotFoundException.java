package Jan18;

import java.io.FileNotFoundException;

public class testFileNotFoundException {
	public static void main(String[] args) throws FileNotFoundException {
		checkFile();
//		try {
//			checkFile();
//		}catch(Exception e) {
//			System.out.println(e.toString());
//		}
	}
	public static void checkFile()throws FileNotFoundException  {
		java.io.FileReader f = new java.io.FileReader("Jan18/Kemcho.txt");
		java.io.BufferedReader br = new java.io.BufferedReader(f);
		throw new java.io.FileNotFoundException("File Not Found");
	}
}

//	Create a user defined Exception and throw is if the age is less than that of 18
