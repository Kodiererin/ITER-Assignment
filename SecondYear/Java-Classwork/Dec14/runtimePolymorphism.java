package Dec14;

class Ujjwal
{
	public void say()
	{
		System.out.println("Hello");
	}
}

class Shubham extends Ujjwal
{
	public void say()
	{System.out.println("Hello Shubham");
	}
	public void show() {System.out.println("Hello World");}
}

public class runtimePolymorphism {
public static void main(String[] args) {
	Ujjwal obj = new Ujjwal();
	Ujjwal obj2 = new Shubham();
	Shubham obj3 = new Shubham();
	
	
	obj.say();
	obj2.say();
	obj3.say();
}
}
