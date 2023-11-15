//	(i) Write a program to download a web page and Object

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class Question_1 {
	public static void main(String[] args) {
		intro();
		try {
			System.out.println("Enter the URL of the Page ");
			@SuppressWarnings("deprecation")
			URL url = new URL(new java.util.Scanner(System.in).next());
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			@SuppressWarnings(value = { "Depracted" })
			BufferedWriter writer = new BufferedWriter(new FileWriter("DownloadPage.html"));
			
			
			String line;
			while((line=br.readLine())!=null) {
//				System.out.println(line.toString());
				writer.write(line);
			}
			br.close();
			writer.close();
			System.out.println("Data Success");
			
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
