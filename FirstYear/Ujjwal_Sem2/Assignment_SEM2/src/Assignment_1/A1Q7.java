//Write a Java method that takes an array of int values and determines if there is a pair of 
//distinct elements of the array whose product is odd.
package Assignment_1;
import java.util.*;
public class A1Q7 
{
	public static void isOdd(int...is)
	{
		for(int i=0 ; i<is.length ; i++)
		{
			for(int j=0 ; j<is.length ; j++)
			{
				if((is[i]*is[j])%2!=0)
				{
					System.out.println(is[i]+" , "+is[j]);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome Ujjwal Kem cho");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of the array");
		int [] array  = new int[sc.nextInt()];
		System.out.println("Enter The Data In the Array of Integer Datatype");
		for(int i=0 ;i<array.length ; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("................................................");
		isOdd(array);
		sc.close();
	}
}
