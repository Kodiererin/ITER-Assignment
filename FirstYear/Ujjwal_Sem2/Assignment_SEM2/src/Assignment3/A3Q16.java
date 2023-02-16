//	Write a recursive Java method that determines if a string s is a palindrome, that is, it is 
//	equal to its reverse. Examples of palindromes include 'racecar' and 
//	'gohangasalamiimalasagnahog'.

package Assignment3;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A3Q16 
{
	static void checkPalindromeString(String s , int i)
	{
		int x = i;
		int y = s.length()-1-i;
//		System.out.println(y);
		if(s.charAt(x)==s.charAt(y))
		{
			if(s.charAt(x)==s.charAt(y))
			{
				System.out.println("The String is a Palindrome String");
				return;
			}
			checkPalindromeString(s,i+1);			
		}
//		if(s.length()%2==0)
//		{
//			if(s.charAt(x)==s.charAt(y))
//			{
//				System.out.println("The String is a Palindrome String");
//				return;
//			}
//			checkPalindromeString(s,i+1);
//		}
		else
		{
			System.out.println("The String is not a Palindrome String");
		}
	}
	public static void main(String[] args) throws Exception 
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter the word that you want to check if it is palindrome or not");
		String check = br.readLine();
		checkPalindromeString(check , 0);
	}
}