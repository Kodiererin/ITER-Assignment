package Nov25;

import java.util.Scanner;

//	Compute the spreadsheet using enccoding.
public class test_a 	
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String ");
		String m = sc.next();
		m = m.toUpperCase();
		int res=0;
		for(int i=m.length()-1 ; i>=0 ; i--)
		{
			char ch = m.charAt(i);
			res = res*26+ch-'A' +1;
		}
		System.out.println("The Output  "+res);
		
	}
}
