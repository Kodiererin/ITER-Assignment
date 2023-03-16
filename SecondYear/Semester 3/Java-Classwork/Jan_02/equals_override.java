package Jan_02;
//	Write a Program that Takes name, age and rollNo as input and compares two objects!
public class equals_override {
	public static void main(String[] args) {
		Student1 obj1 = new Student1("Ujjwal" , 12, 21);
		Student1 obj2 = new Student1("Ujjwal" , 22 , 22);
		Student1 obj3 =  new Student1("Ujjwal" , 12, 21);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
	} 
	
}
class Student1{
	String name;
	int rollNo;
	int age;
	Student1(String name, int rollNo , int age){
		this.age = age;
		this.name = name;
		this.rollNo = rollNo;
	}
	// overriding the equals method
	public boolean equals(Student1 obj)
	{
		Student1 obj2 = (Student1)obj;			// TYPECASTING the object to Student1 and then comparison will be done.
		if(name == obj2.name && age == obj2.age && rollNo == obj2.rollNo)
			return true;
		return false;
		
	}
}


