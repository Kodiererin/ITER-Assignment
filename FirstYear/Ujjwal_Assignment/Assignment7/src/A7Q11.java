import java.util.Scanner;

// bubble sort and method
import java.util.*;
public class A7Q11 
{
	public static void sort(int[] ujj)
	{
		int max;
		for(int i=0 ; i<ujj.length ; i++)
		{
			for(int j=0 ; j<ujj.length ; j++)
			{
				if(ujj[i]>=ujj[j])
				{
					max = ujj[j];
					ujj[j]= ujj[i];
					ujj[i] = max;
				}
			}
		}
		for(int k=0 ; k<ujj.length ; k++)
		{
			System.out.println(ujj[k]);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int m = sc.nextInt();
		int sortarray [] = new int[m];
		System.out.println("Enter the array");
		for(int i=0 ; i<sortarray.length ; i++)
		{
			sortarray[i] = sc.nextInt(); 
		}
		sort(sortarray);
//		System.out.println(sort(sortarray));
	}
}
