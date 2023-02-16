/* Name : Ujjwal Kumar
 * Registration Number : 2141011063
 * Section : 2141003
 * Branch : B.Tech (Computer Science) 
 * Program Description:Create a user-defined type Point with instance variables x, y and instance 
		methods setPoint(), showPoint(), and findDistance(). Write a Java program to create two points 
		and find distance of 2nd point from 1st point. The prototype of the instance methods of Point class 
		are as follows: 
							void setPoint(int,int) { } 
					 		void showPoint() { } 
						 	int findDistance(Point) { }
 */

import java.util.*;
class Point
{
	int x1;
	int y1;
	int x2;	// Attribute x2 represents the second number 
	int y2;
	void setPoint(int a , int b , int c , int d) // setPoint Method sets initialises the variables
	{
		this.x1 = a;
		this.y1 = b;
		this.x2 = c ; 
		this.y2 = d;
	}
	void showPoint()
	{
		System.out.println("Point 1 is "+this.x1+" , "+this.y1);
		System.out.println("Point 2 is "+this.x2+" , "+this.y2);
	}
	int findDistance() // Given that we have to find distance (x2-x1) so this method does the work
	{
		double temp = this.x2 - this.x1;
			temp = Math.pow(temp, 2);
		double temp1 = this.y2 - this.y1;
			temp1 = Math.pow(temp1, 2);
		return (int)Math.pow(temp+temp1, 0.5);
	}
}

public class PointDemo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Coordinates of  Point One ");
			int x = sc.nextInt();
			int y = sc.nextInt();
		System.out.println("Enter Coordinates of Point Two ");
			int a = sc.nextInt();
			int b = sc.nextInt();
		Point p1 = new Point();
		p1.setPoint(x , y , a , b);
		p1.showPoint();
		System.out.println("The Distance Between the two points is "+p1.findDistance());
		
	}
}

