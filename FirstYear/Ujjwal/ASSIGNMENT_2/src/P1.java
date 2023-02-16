import java.util.Scanner;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Celcius Degree=");
		double degree = sc.nextInt();
		double x =(9.0/5.0)*degree;
		double farenheit = x +32;
		System.out.println("Farenheit ="+farenheit);
	}

}