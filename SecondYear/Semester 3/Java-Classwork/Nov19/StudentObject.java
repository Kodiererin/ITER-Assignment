package Nov19;


class Student
{
	private String name;
	private int age;
	private int rno;
	Student(String name , int data , int rno)
	{
		this.name = name;
		this.age = data;
		this.rno = rno;
	}
	
	public static Student[]  sorting(Student obj[])
	{
		for(int i=1 ; i<obj.length ; i++)
		{
			for(int j=i ; j>=0 ; j--)
			{
				if(obj[j].rno>obj[i].rno)
				{
					Student temp = obj[i];
					obj[i] = obj[j];
					obj[j] = temp;
				}
			}
		}
		return obj;
	}
	public static void display(Student[] obj)
	{
		System.out.println("Student Data");
		for(int i=0 ; i<obj.length ; i++)
		{
			System.out.print(obj[i].rno+"  ");
			System.out.print(obj[i].name+"  ");
			System.out.print(obj[i].age+"  ");
			System.out.println();
		}
		System.out.println("----------------");
	}
}
public class StudentObject 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter No of Students ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x = sc.nextInt();
		Student[] obj = new Student[x];
		System.out.println("Enter The Data");
		for(int i=0 ; i<x ; i++)
		{
			System.out.println("Enter "+i+" Student Data");
			System.out.println("Enter Name , Enter Age , Enter Roll No");
			obj[i] = new Student(sc.next() , sc.nextInt()  , sc.nextInt());			
		}
		Student[] temp = new Student[x];
		Student.display(Student.sorting(obj));
	}

}
