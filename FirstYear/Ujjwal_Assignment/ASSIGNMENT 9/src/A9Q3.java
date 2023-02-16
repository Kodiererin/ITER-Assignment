import java.util.*;
class A9Q3 // Quadratic Equation
{
	private int a;
	private int b;
	private int c;
		public int getA() {
			return a;
		}
		public void setA(int a) {
		this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		public int getC() {
			return c;
		}
		public void setC(int c) {
			this.c = c;
		}
	A9Q3(int a , int b , int c)
	{
		this.a = a;
		System.out.println();
		this.b = b;
		this.c = c;
	}
	static int getDiscriminant(int x , int y , int z)
	{
		return y*y-4*x*y;		
	}
	static double getRoot1(int a , int b , int c)
	{
		if(getDiscriminant(a,b,c)<0)
		{
			return -1*(b+Math.pow((b*b-4*a*c), 0.5)/2*a);
		}
		else
		{
			return 0;
		}
	}
	static double getRoot2(int a , int b , int c)
	{
		if(getDiscriminant(a,b,c)<0)
		{
			return -1*(b+Math.pow((b*b-4*a*c), 0.5)/2*a);
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Numbers ");
		System.out.println("**********************************");
		System.out.print("Enter the Number 1 ");
			int x = sc.nextInt();
		System.out.print("Enter The Number 2");		
			int y = sc.nextInt();
		System.out.print("Enter the Number 3");
			int z = sc.nextInt();
		A9Q3 Q1 = new A9Q3(34,45,56);
		System.out.println("The First Root is "+(Q1.getRoot1(x,y,z)));
		System.out.println("The Second Root is "+(Q1.getRoot2(x,y,z)));
	}
}
