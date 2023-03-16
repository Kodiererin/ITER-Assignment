package Jan_02;
//Write a program to create a Student2 class Having member Name Age and roll No. Create a array list of Student2 type.
//Add some Student2 object and display it
public class collections_ArrayList_Student2 
{
	public static void main(String[] args) {
		java.util.ArrayList<Student2> obj = new java.util.ArrayList<Student2>();
		obj.add(new Student2("ujjwal" , 21, 20));
		obj.add(new Student2("Kumar" , 21 , 11));
		
//		Without Using to String 
//		for(int i=0 ; i<obj.size() ; i++)
//		{
//			System.out.print(obj.get(i).name+" ");
//			System.out.print(obj.get(i).age+" ");
//			System.out.print(obj.get(i).rollNo+" ");
//			System.out.println();
//		}
//		With Using toString
		for(Student2 i : obj)
		{
//			System.out.print(i.name.toString()+" ");
			System.out.print(i.name+" ");
			System.out.print(i.age+" ");
			System.out.print(i.rollNo+" ");
			System.out.println();
		}
	}
}
class Student2{
	String name;
	int rollNo;
	int age;
	Student2(String name, int rollNo , int age){
		this.age = age;
		this.name = name;
		this.rollNo = rollNo;
	}
}