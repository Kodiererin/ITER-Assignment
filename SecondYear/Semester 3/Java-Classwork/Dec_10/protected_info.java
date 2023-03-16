package Dec_10;

class A
{
	int x;
	A()
	{
		this.x = 10;
	}
}
class b extends A
{
	b()
	{
		System.out.println("Protected is only accessible by the current b Child Class"+x);
	}
}
class c extends b
{
	c()
	{
		System.out.println("Protected is only accessible by the current c Class "+x);
	}
}
class d extends c
{
	d()
	{
		System.out.println("This is Class D "+x);
	}
}

public class protected_info 
{
	public static void main(String[] args) {
//		b obj = new b();
//		c obj2 = new c();
		d obj3 = new d();
	}
}
