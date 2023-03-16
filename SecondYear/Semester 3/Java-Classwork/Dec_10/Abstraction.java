package Dec_10;
//	Data Hiding - Encapsulation
//	All Details Hiding - Abstraction
	
abstract class AA
{
//	We cannot create an Object of this Abstract Class.
//	In order to access the elements the Abstract Class Data elements and Members We have to extend it to the Another class.
	int x = 10;
	AA()
	{
		System.out.println("This is Abstract Class A "+x);
	}
	public void  display()
	{
		System.out.println("This is a Display Method");
	}
}
//	To access the elements of the Abstract class We have to extend the Data members to a new Class.
class BB extends AA
{
	BB()
	{
		System.out.println(x);
	}
}
public class Abstraction 
{
	public static void main(String[] args) {
//		AA obj = new AA();		// Not Accessible
		BB obj2 = new BB();			// inorder to access the Abstract class we have to extend the Abstract class to a New class.
		obj2.display();
	}
}
