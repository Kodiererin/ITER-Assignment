//Write a java program that reads an integer and displays all its smallest factors in increasin
import java.util.*;
public class A5Q20 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int x = sc.nextInt();
		int m = 0;
		int n=0;
		String showme = " ";
		for(int i=1 ; i<=x ; i++)
		{
			for(int j=2 ; j<=x ; )
				 {
					 if(x%j==0)
					 {
						 showme = showme+j;						 
						 x = x/j;					 
					 }
					 else
					 {
						 j +=1;
					 }
				 }
		}
		System.out.println(showme);			
	}
}
