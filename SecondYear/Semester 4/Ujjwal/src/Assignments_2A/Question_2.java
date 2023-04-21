package Assignments_2A;

import java.util.Comparator;

class Student implements Comparator{
	String name;
	int age;
	int mark;
	Student(String name , int age , int mark){
		this.name  = name;
		this.age = age;
		this.mark = mark;
	}
	public String toString() {
		return this.name+" "+this.age+" "+this.mark;
	}
	@Override
	public int compare(Object o1, Object o2) {
		Student a = (Student)o1;
		Student b = (Student)o2;
		if(a.name.equals(b.name) && a.age == b.age && a.mark == b.mark) return -1;
		else return -1;
	}
}

public class Question_2 {
	public static void main(String[] args) {
		addStudent();
		display();
		count();
		remove();
	}
	static java.util.ArrayList<Student> list = new java.util.ArrayList();
	public static void addStudent() {
		list.add(new Student("Ujjwal",21,0));
		list.add(new Student("Ananya",20,95));
		list.add(new Student("Shubham",21,92));
		list.add(new Student("Prerna",21,98));		
	}
//	Displaying the Data
	public static void display() {
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
//	Removing an Specific Object
	public static void remove() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		int mark = sc.nextInt();
		
		list.remove(new Student(name,age,mark));
	}
//	Count the Number of Object present in the list
	public static void count() {
		System.out.println(list.size());
	}
	
	
}
