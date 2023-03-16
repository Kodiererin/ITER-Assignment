//	WAP to create a class named it as product having members name of the product and price of the product.
//	Create a Hashset of Products Inseret some elements into it and search a Particular elemenr into the Hashset.
package Jan11;

import java.util.*;

class Student{
	private String name;
	private int age;
	Student(String name , int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return this.name+" "+this.age;
	}
//	public boolean equals(Student obj) {
//		if(this.name.equals(obj.name) && this.age==obj.age) return true;
//		else return false;
//	}
	@Override
	public int hashCode() {
		return age*5;
	}
//	@Override
//	public int compareTo(Object o) {
//		Student s = (Student)o;
//		// TODO Auto-generated method stub
//		if(this.name.equals(s.name) && this.age==s.age) return 0;
//		if(this.name.compareTo(s.name)>0 && this.age>s.age) return 1;
//		else return -1;
	//}
	
}
public class Hashset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> student = new HashSet<Student>();
		Student s1=new Student("abs",12);
		Student s2=new Student("abs",12);
				
//		student.add(new Student("Ujjwal",12));
//		student.add(new Student("Ujjwal",12));
//		student.add(new Student("Ujjwal",12));
//		student.add(new Student("Ujjwal",12));
//		student.add(new Student("Ujjwal",12));
	
		student.add(s1);
		student.add(s2);
		Student obj = new Student("Kumar",13);
		//System.out.println(obj);
		//student.add(obj);
		//student.add(obj);
		
		for(Student myStudent : student) {
			System.out.println(myStudent);
		}
	}

}

