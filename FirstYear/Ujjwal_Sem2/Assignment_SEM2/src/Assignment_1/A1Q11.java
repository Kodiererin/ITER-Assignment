//		Create a class Point with instance variables x, y to represent co-ordinates of point and 
//		instance method setPoint(). Write a Java program to find distance between two points using 
//		a method findDistance(Point,Point).
package Assignment_1;
import java.util.Scanner;
class test
{
	int x ; 
	int y;
	void setPoint()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X Co-Ordinates");
			this.x = sc.nextInt();
		System.out.println("Enter Y Co-Ordinates");
			this.y = sc.nextInt();
		sc.close();
	}
	int getx()
	{
		return x;
	}
	int gety()
	{
		return y;
	}
}
public class A1Q11 
{
	public static double findDistance(test a , test b)
	{
		double distance = Math.sqrt(Math.pow(a.getx()-b.gety(), 2));
		return distance;
	}
	public static void main(String[] args) 
	{
		System.out.println("Objects as Arguments");
		test a = new test();
		test b = new test();
		a.setPoint();
		b.setPoint();
		System.out.println("The Distance Between The Two Points is "+findDistance(a,b));
	}
}
