package Assignment3;

class Box<T1 , T2>
{
	T1 var1;
	T2 var2;
	Box(T1 var1 , T2 var2)
	{
		this.var1 = var1;
		this.var2 = var2;
	}
	public void show()
	{
		System.out.println("The Box of Variables "+var1+" , "+var2+" has been created");
	}
	public void showClass()
	{
		System.out.println("The class of the Variable 1 is ");
		System.out.println(var1.getClass());
		System.out.println("The class of the Variable 2 is ");
		System.out.println(var2.getClass());
	}
}
public class A3Q4
{
	public static void main(String[] args) 
	{
		String x = "Ujjwal";
		int y = 45;
		Box<String , Integer > b1 = new Box<String , Integer >(x , y);
		b1.show();
		b1.showClass();
		System.out.println("--------------------------------------");		
		int a = 45;
		int b = 99;
		Box<Integer , Integer > b2 = new Box<Integer , Integer >(a , b);
		b1.show();
		b1.showClass();
	}
}