package Dec_10;
//	Write A program to Create a Student Class havving member variables Name ,Age,RN,Parameterised constructor
//	and required Set and Get method.
//	Create an Another class Day Scholar having member Locality, constructor and required set and get method.
//	Create the object of Day Scholar and Print the info like Name,age,Rn and Locality

class Student
{
	private String name;
	private int age;
	private int RollNo;
	Student(String name,int r , int a)
	{
		this.name = name;
		this.RollNo = r;
		this.age = a;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getRollNo() {
		return RollNo;
	}
}
class DayScholar extends Student
{
	private String Locality;
	DayScholar(String name, int r, int a , String l) {
		super(name, r, a);
		this.Locality = l;
	}
	
	public String getLocality()
	{
		return this.Locality;
	}
	
}
public class ITER_Student 
{
	public static void main(String[] args) 
	{
		DayScholar obj = new DayScholar("Ujjwal",20,2131221,"Jaggmohan Nagar");
		System.out.println("Student Name "+obj.getName());
		System.out.println("Student Age "+obj.getAge());
		System.out.println("Student Roll No"+obj.getRollNo());
		System.out.println("Student Locality "+obj.getLocality());
	}
}
