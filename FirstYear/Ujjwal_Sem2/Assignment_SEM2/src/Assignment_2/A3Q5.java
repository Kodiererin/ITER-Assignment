package Assignment_2;

import java.util.Scanner;

class Person
{
	String name;
	int age;
	Person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
}
class StudentA3Q5 extends Person
{
	String course;
	int RollNo;
	int marks;
	StudentA3Q5(String name, int age) 
	{
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		System.out.println("The Name of the Student is "+name);
		System.out.println("THe Age of the Student is "+age);
		System.out.println("THe Course of the Student is "+this.course);
		System.out.println("THe RollNo of the Student is "+this.RollNo);
		System.out.println("THe marks of the Student is "+this.marks);
	}
	
}
class Teacher extends Person
{

	Teacher(String name, int age) 
	{
		super(name, age);		// TODO Auto-generated constructor stub
	}
	String subject_assigned;
	int contact_hour;
	public void display()
	{
		System.out.println("The Name of the Teacher is "+name);
		System.out.println("THe Age of the Teacher is "+age);
		System.out.println("THe  Subject Assigned to the Teacher is "+this.subject_assigned);
		System.out.println("THe contact_hour of the Teacher is "+this.contact_hour);
	}
}
public class A3Q5 
{
	public static void main(String[] args) 
	{
		System.out.println("If the Person is Teacher press 1 else press 2");
		Scanner sc = new Scanner(System.in);
		if(sc.nextInt() == 1)
		{
			System.out.println("Enter The Name and Age of the Teacher");
			Teacher t = new Teacher(sc.next() , sc.nextInt());
			System.out.print("The Subject Assigned to the teacher is ");
				t.subject_assigned = sc.next();
			System.out.print("The Contact Hour is");
				t.contact_hour = sc.nextInt();
			t.display();
		}
		else
		{
			System.out.println("Enter the name and age of the StudentA3Q5 ");
			StudentA3Q5 s = new StudentA3Q5(sc.next() , sc.nextInt());
			System.out.print("The Course of the Student  is ");
			s.course = sc.next();
			System.out.print("The Roll Number of the Student  is ");
			s.RollNo = sc.nextInt();
			System.out.println("Enter The Marks of the Student ");
			s.marks = sc.nextInt();
			s.display();
		}
	}
}
