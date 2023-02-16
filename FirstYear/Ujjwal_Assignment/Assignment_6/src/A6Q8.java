import java.util.*;
public class A6Q8 
{
	static double area(int n , double side)
	{
		return (n*side*side)/(4*Math.tan((Math.PI)/n));
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Sides");
		int n = sc.nextInt();
		System.out.println("Enter the Side of the Polygon");
		double x = sc.nextDouble();
		System.out.println("The Area of the polygon ="+(area(n,x)));
	}
}
