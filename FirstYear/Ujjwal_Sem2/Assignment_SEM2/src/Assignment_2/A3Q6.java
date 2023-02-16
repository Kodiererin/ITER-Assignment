package Assignment_2;

import java.util.Scanner;

abstract class shape
{
	abstract void getData(int x , int y , int z);
	abstract void showArea();
}
class circle extends shape
{
	int radius;
	@Override
	void getData(int x , int y , int z) 
	{
		this.radius = x;
		System.out.println("The Radius of circle is "+this.radius);
	}
	@Override
	void showArea() 
	{
		System.out.println("The Area of the Circle is "+Math.PI*this.radius*this.radius);		
	}
	
}
class Triangle extends shape
{
	int ab;
	int bc;
	int ac;
	@Override
	void getData(int x, int y, int z) 
	{
		this.ab = x;
		this.bc = y;
		this.ac = z;
		// TODO Auto-generated method stub		
	}

	@Override
	void showArea() 
	{
		int s = (this.ab + this.bc + this.ac)/2;
		System.out.println("The Area of a Tringle is "+(s*(s-ab)*(s-bc)*(s-ac)));
		// TODO Auto-generated method stub
		
	}
	
}
class square extends shape
{
	int side ;
	@Override
	void getData(int x , int y , int z) 
	{
		this.side= x;
	}
	@Override
	void showArea() 
	{
		System.out.println("The Area of the Square is "+(side*side));		
	}
}
public class A3Q6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Below Option ");
		System.out.print("1.   Square ");
		System.out.print("2.   Triangle");
		System.out.print("3.   Circle \n");
		
			int opt = sc.nextInt();
		if(opt== 1)
		{
			square s = new square();
			System.out.println("Enter The side of the square");
			s.getData(sc.nextInt(), 0, 0);
			s.showArea();
		}
		if(opt== 2)
		{
				Triangle s = new Triangle();
				System.out.println("Enter The sides of the triangle");
				s.getData(sc.nextInt(), sc.nextInt(), sc.nextInt());
				s.showArea();
		}
		if(opt== 3)
			{
				circle s = new circle();
				System.out.println("Enter The Radius of the Circle ");
				s.getData(sc.nextInt(), 0 , 0);
				s.showArea();
			}
		sc.close();
	}
}
