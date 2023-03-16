package Dec_7;

class Student
{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name , rollNo;
	private int age;
}

class Marks extends Student
{
	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}

public class Student_Marks_Inheritance {
	public static void main(String[] args) 
	{
		System.out.println("Welcome To Iter");
		Marks m = new Marks();
//		Setting Data
		m.setAge(10);
		m.setName("Kem Cho");
		m.setRollNo("2001010101");
		m.setMarks(23);
		
		System.out.println(m.getName()+" "+m.getRollNo()+" "+m.getAge()+" "+m.getMarks());
	}
	
}
