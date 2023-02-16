package Homework;

import java.util.Scanner;

public class aqHW_017 
{	
	public static double[][]sortColumns(double[][] m)
	{
		double temp = 0.0;
		for(int i=0 ; i<m.length ; i++)
		{
			for(int j=0 ; j<m[0].length-1 ; j++)
			{
				if(m[i][j]<=m[i][j+1])
				{
					temp = m[i][j];
					m[i][j] = m[i][j+1];
					m[i][j+1] = temp;
				}
			}
		}
		return m;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Order of Matrix which will be in n x n");
		double [][]matrix = new double[sc.nextInt()][sc.nextInt()];
		System.out.println("Enter The Elements of the array");
		System.out.println("There are "+matrix.length+" rows ");
		System.out.println("There are "+matrix[0].length+" columns ");
		for(int i=0 ; i<matrix.length ; i++)
		{
			for(int j=0 ; j<matrix[1].length ; j++)
			{
				matrix[i][j] = sc.nextDouble();
			}
		}
		double methodReturn[][] = aqHW_017.sortColumns(matrix);
		for(int u=0 ; u<methodReturn.length ; u++)
		{
			for(int v = 0 ; v<methodReturn[0].length ; v++)
			{
				System.out.print(methodReturn[u][v]+" ");
			}
			System.out.println();
		}
	}
}
