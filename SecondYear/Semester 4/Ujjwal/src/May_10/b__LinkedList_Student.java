package May_10;

//WAP to create a Node for a single Linked list which store a student object as information part of the node
//The studet object contains name age and rollno of the student.
class Student{
	private int RollNo;
	private String name;
	private int age;
	Student(int r, String s , int A){
		this.age = A;
		this.name = s;
		this.RollNo = r;
	}
	public int getRoll() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String toString() {
		return this.getRoll()+" "+this.getName()+" "+this.getAge();
	}
}

//	 

class Node{
	Node next;
	private Student data;
	Node(){
		this.data = null;
		this.next = null;
	}
	Node(int roll , String name , int age){
		this.data = new Student(roll , name , age);
		this.next = null;
	}
	public Student getData() {
		return this.data;
	}
}

public class b__LinkedList_Student {
public static void main(String[] args) {
	Node Head = new Node(1 , "Ujjwal",12);
	Head.next = new Node(2,"Ujjwal Kumar " , 21);
	Head.next.next= new Node(3,"Ujjwal Kumar " , 23);
	Head.next.next.next = new Node(4,"Ujjwal Kumar " , 25);
	display(Head);
}
	
	public static void display(Node Head) {
		if(Head!=null) {
			System.out.println(Head.getData().getAge()+" "+Head.getData().getName()+" "+Head.getData().getRoll());
			display(Head.next);
		}
	}	
} 

