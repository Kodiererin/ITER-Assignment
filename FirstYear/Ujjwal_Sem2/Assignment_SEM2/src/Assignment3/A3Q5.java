package Assignment3;

import java.util.Scanner;

class GenericArray
{
	public static <T> int count(T[] array , T item)
	{
//		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<array.length ; i++)
		{
			System.out.println(array[i]);
		}
		return 0;
	}
}
public class A3Q5 
{
	public static void main(String[] args) 
	{
		GenericArray g1 = new GenericArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The size of the array ");
		 	int size = sc.nextInt();
		 String [] array = new String[size];
		 System.out.println("Enter The Elements of The Array ");
		 for(int i=0 ; i<array.length ; i++)
		 {
			 array[i] = sc.next(); 
		 }
		 sc.close();
		 GenericArray.count(array, size);
	}
}
