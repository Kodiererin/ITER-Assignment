package Assignment_2;

import java.util.Scanner;
class Student
{
	int rollNo;
	String name;
	String course;
	public void input_Student(int rollNo,String name,String course)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}
	public void display_Student()
	{
		System.out.println("The Student Roll No is "+this.rollNo);
		System.out.println("The Student name is "+this.name);
		System.out.println("THe Student course is "+this.course);
	}
}
class Exam extends Student
{
	int mark1;
	int mark2;
	int mark3;
	public void input_marks(int mark1 , int mark2 , int mark3)
	{
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	public void display_result()
	{
		System.out.println("The Student has scored "+this.mark1+" , "+this.mark2+" , "+this.mark3+" consecutively");
		System.out.println("The Average of the marks is "+(this.mark1+this.mark2+this.mark3)/3);
	}
}
public class A3Q3__Doubt 
{
	public static void main(String[] args)
	{
//		array of objects
//		Exam[] s1;
//		s1 = new Exam[3];
		Exam[] s1 = new Exam[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<s1.length ; i++)
		{
//			System.out.println("Enter The Rollno,Name and course of the student Number "+i);
//			int roll = sc.nextInt();
//			String name = sc.next();
//			String course = sc.next();
			s1[i].input_Student(36, "Ujjwa", "Physics");
//			s1[i].input_Student(roll, name, course);
//				s1[i].input_Student(sc.nextInt(), sc.nextLine(), sc.nextLine());
			System.out.println("Enter The marks of the student of three subjects in order way");
				s1[i].input_marks(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		sc.close();
		for(int j=0 ; j<s1.length ; j++)
		{
			s1[j].display_result();
			s1[j].display_result();
		}
	}
}
