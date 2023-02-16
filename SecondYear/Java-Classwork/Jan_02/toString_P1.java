package Jan_02;
//Write a Program to create a Student class havving member name , age , roll No.
//Ovverride toString Method to print the Object
public class toString_P1 {
	public static void main(String[] args) {
		Student obj = new Student("Ujjwal " , 003 , 21);
		System.out.println(obj);
		System.out.println(obj.toString());
	}
}
class Student{
	String name;
	int rollNo;
	int age;
	Student(String name, int rollNo , int age){
		this.age = age;
		this.name = name;
		this.rollNo = rollNo;
	}
	public boolean equals(Student obj)
	{
		Student obj2 = (Student)obj;
		if(name == obj2.name && age == obj2.age && rollNo == obj2.rollNo)
			return true;
		return false;
		
	}
}
