import java.util.Scanner;

public class P11 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Investment Amount");
		double inev = sc.nextDouble();	//invested value
		System.out.println("Enter the Annual Interest Rate");
		double air = sc.nextDouble(); //annual interest rate
		
		System.out.println("Enter the Number of Years");
		double years = sc.nextDouble(); //number of years
		years = (int)years;
		double temp1 = Math.pow(air,years);	//temp. variable.....
		double fiv = (temp1*inev)/100;
		
		fiv = inev + fiv;		
		air = air-1.0;
		years = years/12.0;
		System.out.println("Investment Value ="+inev);
		System.out.println("Annual Interest Rate"+air);
		System.out.println("Number of Years ="+years);
		System.out.println("Future Investment value = "+fiv);
		
	}

}
