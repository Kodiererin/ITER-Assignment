package Assignment_2;

import java.util.Scanner;

class PointType
{
	int x;
	int y;
	PointType(int p1 , int p2)
	{
		this.x = p1;
		this.y = p2;
	}
	public void display()
	{
		System.out.println("The Points are "+this.x);
		System.out.println("The Point 2 are "+this.y);;
	}
	public void getCoordinates(int x , int y)
	{
		this.x = x;
		this.y = y;
	}
	public int showCoordinates01()
	{
		System.out.println("The Coordinates of the point are = "+this.x);
		System.out.println("The Coordinates of the Point are = "+this.y);
		return this.x;
//		return this.y;
	}
	public int showCoordinates02()
	{
		System.out.println("The Coordinates of the point are = "+this.x);
//		System.out.println("The Coordinates of the Point are = "+this.y);
//		return this.x;
		return this.y;
	}
	
}
class CircleType extends PointType
{
	CircleType(int p1, int p2) 
	{
		super(p1, p2);
		// TODO Auto-generated constructor stub
	}
	int radius;
	int centre_x;
	int centre_y;
	public void storeRadius(int x)
	{
		this.radius = x;
		System.out.println("The Radius of the circle is "+this.radius);
	}
	public void setCentre()
	{
		this.centre_x = x;
		this.centre_y = y;
	}
	public void area()
	{
		System.out.println("The Area of the circle is "+Math.PI*this.radius*this.radius);
	}
	public void circumference()
	{
		System.out.println("The Circumference of the Circle is "+2*Math.PI*this.radius);
		
	}
}
public class A3Q4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener The CoOrdinates of the Circle ");
		CircleType ct = new CircleType(sc.nextInt(), sc.nextInt());
			ct.showCoordinates01();
			ct.showCoordinates01();
		System.out.println("Enter The Radius of the circle ");
			ct.storeRadius(sc.nextInt());
		System.out.println("The area and circumference of the circle are ");
		 	ct.area();
		 	ct.circumference();
	}
}
