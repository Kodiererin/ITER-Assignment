package Dec14;
//WAP named Complex , two member variable having real and imaginary and methods sum to find the two complex number and three complex number
// Create a main class to find the sum of the  complex number

class Complex{
	int x;
	int y;
	Complex()
	{this.x = 0;this.y = 0;}
	Complex(int x , int y)
	{this.x = x ; this.y = y;}
}

class findSum{
	public Complex twoSum(Complex a , Complex b)
	{
		Complex m = new Complex();
		m.x = a.x + b.x;
		m.y = b.y + b.y;
		return m;
	}
	public Complex twoSum(Complex a , Complex b , Complex c)
	{
		Complex m = new Complex();
		m.x = a.x + b.x + c.x;
		m.y = a.y + b.y + c.y;
		return m;
	}
}

public class sumComplex 
{
	public static void main(String[] args) {
		Complex a = new Complex(10,20);
		Complex b = new Complex(5,10);
		Complex c = new Complex(4,5);
		findSum  f = new findSum();
		System.out.println(f.twoSum(a, b).x+"   "+f.twoSum(a, b).y);
		System.out.println(f.twoSum(a, b , c).x+"   "+f.twoSum(a, b , c).y);
	}
}
