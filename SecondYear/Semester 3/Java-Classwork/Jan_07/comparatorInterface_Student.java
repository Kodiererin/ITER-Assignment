package Jan_07;

import java.util.Collections;
import java.util.Comparator;

//import java.util.Comparator;

class Student
{
	String name;
	int age;
	Student(String name , int age){
		this.age = age; this.name = name;
	}
}

class StudentHelper implements Comparator<Student>{
	@Override
	public int compare(Student s1 , Student s2) {
		return s1.name.compareTo(s2.name);
	}
	
}

public class comparatorInterface_Student {
	public static void main(String[] args) {
		java.util.ArrayList<Student> obj = new java.util.ArrayList<>();
		obj.add(new Student("Ujjwal " , 21));
		obj.add(new Student("Kumar " , 22));
		obj.add(new Student("Ujjwal Kumar " , 23));
		obj.add(new Student("Shubham " , 19));
		obj.add(new Student("Ananya " , 121));
		obj.add(new Student("Joydeep " , 20));
		obj.add(new Student("Presham " , 21));
		obj.sort(new StudentHelper());
		
		System.out.println("Name								Age");
		for(Student i : obj ) {
			System.out.println(i.name+"								"+i.age);
		}
	}
}


//	Write a program to a car class having model no and name of the car then create array lisy of car object.
//	Sort it in the ascending order and search the car using model no using Binary Search
