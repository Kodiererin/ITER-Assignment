package Assignment_1;

import java.util.Scanner;
class student01
{
	String name;
	int roll;
	int mark;
	void setData()
	{
		Scanner sc = new Scanner(System.in);
		this.name = sc.next();
		this.roll = sc.nextInt();
		this.mark = sc.nextInt();
	}
	void display()
	{
		System.out.println("Student Name is "+this.name);
		System.out.println("Student Roll is "+this.roll);
		System.out.println("Student Mark is "+this.mark);
	}
}
public class A1Q9
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome ");
		student01 obj[] = new student01[3];
		for(int i=0 ; i<3 ; i++)
		{
			obj[i] = new student01();
			obj[i].setData();
		}
		for(int j=0 ; j<obj.length ; j++)
		{
			obj[j].display();
		}
	}
}