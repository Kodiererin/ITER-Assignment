

/*
 * 1. Define a class Employee with two instance variables:
● name, salary and age
and two member methods:
● setData(): set the details of the person.
● displayData(): display the details of the person.
Now, create two objects of class Employee and initialize one object value
directly (by using the dot(.) operator name: “Joseph”, salary: 65784.50 and
age: 25 ). Accept your name and age through the keyboard and set them to
another object using the setData() method.
Now display both the member variables using the displayData() method.
Also, check who is older.
 */

import java.util.Scanner;

class Employee{
	String name;
	double salary;
	int age;
	
	public void setData(String name , double salary , int age) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public void displayData() {
		System.out.println(this.name+"\n"+this.age+"\n"+this.salary);
	}
	
}

public class A1Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e  = new Employee();
		System.out.println("Enter your Name , Salary and Age");
		e.setData(sc.next(), sc.nextDouble(), sc.nextInt());
		
		Employee f  = new Employee();
		System.out.println("Enter your Name , Salary and Age");
		f.setData(sc.next(), sc.nextDouble(), sc.nextInt());
		
		if(e.age>f.age) {
			System.out.println(e.name+" is older than "+f.name);
		}
		else if(e.age<f.age) {
			System.out.println(f.name+" is older than "+e.name);
		}else {
			System.out.println("Both are of Same age.");
		}
	}
}
