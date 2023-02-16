//Write a java program to generate and print the first n terms of the Fibonacci numbers using an 
//efficient algorithm. In this case, you need to find a pair of Fibonacci terms, in each iteration and 
//display them and adjust the preceding term b and the term before the preceding term a. Your 
//program should handle all positive values of n.
// we must have the aim to decrease the loop size
//iteration ka mtlab ki apko loop ka cycle km krna h
import java.util.*;
public class A5Q14 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Fibonacci Numbers Your need! ");
		int x = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		
		{
	//		System.out.print(a+" ");
			for(int i=1 ; i<x ; i+=2)
			{
	//			System.out.print(a+" ");
	//			sum = b+a;
	//			b = a ;
	//			a = sum;
				System.out.print(a+" ");
				System.out.print(b+" ");
				a = b+a;
				b = a+b;
			}
			if(x%2!=0)
			{
				System.out.println(" "+a);
			}
			
		}
	}
}
