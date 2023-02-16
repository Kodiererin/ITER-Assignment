package Assignment_1;

import java.util.Scanner;
class test
{
	int real;
	int img;
	test(int real,int img)
	{
		this.real = real;
		this.img = img;
	}
	test(test var)
	{
		this.real = var.real;
		this.img = var.img;
	}
	void show()
	{
		System.out.println("Imaginary Number is "+this.real);
		System.out.println("Real Number is "+this.img);
	}
}
public class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Recap of the Program");
		test obj = new test(20,30);
		test obj2 = obj;
//		this creates a copy of the object
		obj.show();
		obj2.show();
	}
}