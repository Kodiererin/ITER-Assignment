package Jan_06;
//	Write a program to create a Car class having members model no , name of the car and color of the car.
//	Create a array listy of car object and search and remove a particlular car object.
class Car 
{
	String modelNo;
	String name;
	String color;
	Car(String a , String b , String c) {
		this.modelNo = a; 
		this.name = b;
		this.color = c;
	}
//	Overriding the Equals Method for Removing the Object.
//	Isse seekho!
	public boolean equals(Object o) {
		Car c = (Car)o;
		if(name.equals(c.name)) {
			return true;
			
		}
		return false;
	}
	
}
public class myBMW {
	public static void main(String[] args) {
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.util.ArrayList<Car> obj = new java.util.ArrayList<>();
		obj.add(new Car("1101", "M5" , "red"));
		obj.add(new Car("1101a1", "M6" , "Blue"));
		obj.add(new Car("1101a2", "Evolve" , "red"));
		for(Car i : obj)
		{
			System.out.print(i.name+" ");
			System.out.print(i.modelNo+" ");
			System.out.print(i.color+" ");
			System.out.println();
		}

//		Deleting the object
//		See the equals method otherwise the object will not be deleted.
		obj.remove(new Car("1101a1", "M6" , "Blue"));
		
		System.out.println();
		for(Car i : obj)
		{
			System.out.print(i.name+" ");
			System.out.print(i.modelNo+" ");
			System.out.print(i.color+" ");
			System.out.println();
		}
	}
}
