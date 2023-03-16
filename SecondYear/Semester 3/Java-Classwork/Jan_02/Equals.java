package Jan_02;
//	toEquals : Compares Objects
public class Equals {
	public static void main(String[] args) {
		Student obj1 = new Student("Ujjwal" , 001, 21);
		Student obj2 = new Student("Ujjwal " , 002 , 22);
		Student obj3 =  new Student("Ujjwal" , 001 , 21);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
//		The object Memory location is being Compared so the output is getting false.
//		But in String two String can have the Same memory location if they have the same Data.
		System.out.println("-----------------------------------------------");
		
//		If we Do with the Strings
		String m = "Ujjwal";
		String n = "Kumar";
		String o = "Ujjwal";
		System.out.println(m.equals(n));
		System.out.println(m.equals(o));
	}
}
