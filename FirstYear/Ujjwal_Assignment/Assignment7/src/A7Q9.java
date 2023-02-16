import java.util.*;
public class A7Q9 
{
	static double deviation(double[] x)
	{
		double sum = 0.0;
		double deviation;
		for(int i=0 ; i<x.length ; i++)
		{
			sum = sum + x[i];
		}
		double mean = sum/x.length;
		deviation = Math.pow((((x[x.length-1]-mean)*(x[x.length-1]-mean))/(x.length-1)), 0.5);
		return deviation;	
	}
	static double mean(double[] x)
	{
		double sum = 0.0;
		for(int i=0 ; i<x.length ; i++)
		{
			sum = sum + x[i];
		}
		return sum/x.length;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the length of the array");
		System.out.println("Enter the elements in the array");
		double x [] = new double[10];
		for(int i=0 ; i<10 ; i++)
		{
			x[i]= sc.nextDouble();			
		}
		System.out.println("The mean of the array is "+(mean(x)));
		System.out.println("The Deviation of the array is "+(deviation(x)));
	}
}
