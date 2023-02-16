package Assignment_2;

import java.util.Scanner;

interface test01
{
	void display();
	void count();
}
class Test implements test01
{
//	declaring an instance variable
	public String name;
	Test(String name)
	{
		this.name = name;
	}
	public static int maxcount;

	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println("The "+this.name+" has "+this.maxcount+" characters");
	}

	@Override
	public void count() 
	{
		// TODO Auto-generated method stub
		maxcount = this.name.length();
	}
	
}
public class A3Q7 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome Ujjwal how are you");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The name ");
		Test obj = new Test(sc.nextLine());
		sc.close();
		obj.count();
		obj.display();
	}
}
