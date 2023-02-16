package Homework;

import java.util.Scanner;

public class aqHW_01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of the Array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("The Size of the Array is "+arr.length);
		int findMax = 0;
		int findMin = 0;
		System.out.println("Enter the Numbers in the array ");
		for(int element = 0 ; element<arr.length ; element++)
		{
			arr[element] = sc.nextInt();
		}
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			findMax = arr[i];
			findMin= arr[i];
			if(arr[i+1]>=findMax)
			{
				findMax = arr[i+1];
			}
			if(findMin>arr[i+1])
			{
				findMin = arr[i+1];
			}
		}
		System.out.println("Maximum array Element is "+findMax);
		System.out.println("Minimum array Element is "+findMin);
		int ctr = 0;
		for(int find = 0 ; find<arr.length ; find++)
		{
			if(arr[find]==findMax)
				ctr++;
		}
		System.out.println(findMax+" is "+ctr+" time in the array");
		ctr=0;
		for(int find1 = 0 ; find1<arr.length ; find1++)
		{
			if(arr[find1]==findMin)
				ctr++;
		}
		System.out.println(findMin+" is "+ctr+" time in the array");
	}
}
