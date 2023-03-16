package Nov19;
//		Check the rotate function and reinitiate it!
import java.util.Scanner;

class Car
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	private int ModelNo;
	private String name;
	private String color;

	Car(int ModelNo , String nme , String clr)
	{
		this.color = clr;
		this.ModelNo = ModelNo;
		this.name = nme;
	}
	
	public static Car[] getData()
	{
//		creating an array of objects
		System.out.println("Enter The size of  the Array");
		Car[] obj = new  Car[sc.nextInt()];
		System.out.println("Entter The Data of the Car");
		for(int i=0 ; i<obj.length ;  i++)
		{
			System.out.println("Enter Model No  , Name  , Color of the Car");
			obj[i] = new Car(sc.nextInt() , sc.next() , sc.next());
		}
		return obj;		
	}
	
	public static Car[] Rotate(Car[] obj)
	{
		Car[] obj2 = new Car[obj.length];
		Car temp = obj[obj.length-1];
//		Rotating the array
		for(int i=1 ; i<obj.length ; i++)
		{
			obj2[i] = obj[i-1];
		}
		obj2[0] = temp;
		obj = obj2;
		return obj;
	}
	public static void display(Car[] obj)
	{
		for(int i=0 ; i<obj.length ; i++)
		{
			System.out.println( "Model No -> "+obj[i].ModelNo+"Color -> "+obj[i].color+" Name ->"+obj[i].name);
			 
		}
	}
}
public class myBMW 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Car.display(Car.Rotate(Car.getData()));
	}
}
