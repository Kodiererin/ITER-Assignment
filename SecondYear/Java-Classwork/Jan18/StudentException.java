package Jan18;

//Write a program to create a Student class  having member name and marks which is an array of 3 subjects.
//Create the Object of the Student class handle the numberformat and array out of bound exception at the time of the enerting the marks

class ujjwalException extends ArithmeticException{
	ujjwalException(String x){
		super(x);
	}
	public String toString() {
		return "Marks must not be greater than 100";
	}
}
class myujjwalException extends ArrayIndexOutOfBoundsException{
	myujjwalException(String x){
		super(x);
	}
	public String toString() {
		return "Student Must not Be greater than 3";
	}
}
class Student{
	String name;
	int[] marks = new int[3];
	Student(String name,int[] mark) {
		this.name = name;
		this.marks = mark;
	}
}
public class StudentException {
	public static void main(String[] args) {
		Student[] s = new Student[3];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			for(int i=0 ; i<4; i++) {
				System.out.println("Enter Student Name");
				String name = sc.next();
				System.out.println("Enter Student Marks");
				int[] marks = new int[3];
				for(int j=0 ; j<marks.length ;j++) 
				{
					marks[j] = sc.nextInt();
					if(marks[j] >100) 
					{
						throw new ujjwalException("Marks Must be Less than Equal to 100");
					}
				}
				s[i] = new Student(name,marks);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		display(s);
	}
	
	public static void display(Student[] s) {
		for(int i=0 ; i<s.length ; i++) {
			System.out.println(s[i].name);
			System.out.println("Their Marks");
			for(int j=0 ; j<s[i].marks.length ; j++) {
				System.out.println(s[i].marks[j]);
			}
		}
	}
}
