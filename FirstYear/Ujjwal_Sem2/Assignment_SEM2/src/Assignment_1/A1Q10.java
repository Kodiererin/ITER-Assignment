package Assignment_1;

import java.util.Scanner;
class Student01
{
	String name;
	int roll;
	double mark;
	void setData(String name,int roll,double mark)
	{
		this.name = name;
		this.roll = roll;
		this.mark = mark;
	}
	void display()
	{
		System.out.println("The Student Name is "+this.name);
		System.out.println("The Student Roll is "+this.roll);
		System.out.println("The Student Mark is "+this.mark);
	}
}
public class A1Q10
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Ujjwal");
		Scanner sc = new Scanner(System.in);
		Student01 obj[] = new Student01[3];
//		student1[] obj;
//		obj = new student1[3];
		System.out.println("Enter The Student Name,Roll,Marks in order wise");
		for(int i=0 ; i<obj.length ; i++)
		{
			obj[i] = new Student01();
			obj[i].setData(sc.next() , sc.nextInt(), sc.nextInt());
		}
		sc.close();
		for(int j=0 ; j<obj.length ; j++)
		{
			obj[j].display();
		}	
	}
}