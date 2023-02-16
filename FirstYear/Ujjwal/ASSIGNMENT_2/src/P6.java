import java.util.Scanner;
public class P6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Weight in Pounds");
		double wt = sc.nextDouble();
		System.out.println("Enter your Height in in metres");
		double ht = sc.nextDouble();
		System.out.println("One Pound = 0.45359237 Kilograms");
		System.out.println("One Inch = 0.0245 metres");
		double wkg = 0.45359237*wt;
		double hei = 0.0254*ht;
		double hei2 = hei*hei;
		double bms = wkg/hei2;
		System.out.println("BODY MASS INDEX = "+bms);
	}

}
