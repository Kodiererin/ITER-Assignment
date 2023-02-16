package Assignment_2;

import java.util.Scanner;

class Commission
{
	int sales;
	Commission(int x)
	{
		this.sales = x;
	}
	public int getCommission(int x)
	{
		if(this.sales<501)
			return 2*this.sales/100;
		if(this.sales>500 && this.sales<5001)
			return 5*this.sales/100;
		if(this.sales>5000)
			return 8*this.sales/100;
		else
			return 0;
	}
}
public class A2Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Sales ");
		 	int x = sc.nextInt();
		 if(x<0) {
			 System.out.println("Invalid Input");
		 }
		 else {
		 Commission obj = new Commission(x);
		 System.out.println("The Commission Value is "+obj.getCommission(x));;
		 }
	}
}
