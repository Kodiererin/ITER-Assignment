package Assignment_2;

import java.util.Scanner;

class complex
{
	int real;
	int imag;
	int r1;
	int r2;
	int i1;
	int i2;
	void setData(int a , int b , int c , int d)
	{
		this.r1 = a;
		this.i1 = b;
		this.r2 = c;
		this.i2 = d;
	}
	public void complexadd()
	{
		this.real = this.r1 + this.r2;
		this.imag = this.i1 + this.i2;
	}
	void display ()
	{
		System.out.println("The Sum of the Complex Number is "+real+" + "+imag+"i");
	}
}
public class A2Q2__Doubt {
	public static void main(String[] args) {
		System.out.println("Adding of Complex Numbers ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Complex Number ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the Second Complex Number ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		
		complex obj = new complex();
		obj.setData(a, b, c, d);
		obj.complexadd();
		obj.display();
	}
}
