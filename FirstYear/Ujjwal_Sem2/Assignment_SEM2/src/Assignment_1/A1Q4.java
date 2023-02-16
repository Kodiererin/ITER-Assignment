package Assignment_1;
import java.io.*;
public class A1Q4 
{
	public static void main(String[] args) throws Exception
	{
//		By using buffered Reader I am proceeding
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter The lines that you want to reverse");
		String words = br.readLine();
		for(int i=words.length()-1 ; i>=0 ; i--)
		{
			System.out.print(words.charAt(i));
		}
//		second method which is simple
		
//		String line = sc.nextLine();
//		sc.close();
//		int i = line.length() - 1;
//		do {
//			System.out.print(line.charAt(i) + "");
//			i--;
//		} while (i >= 0);
	}
}
