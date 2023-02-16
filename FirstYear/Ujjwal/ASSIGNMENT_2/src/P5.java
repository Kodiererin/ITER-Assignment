import java.util.Scanner;
import java.util.scanner;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Initial Velocity in metre/seconds");
		double velocity = sc.nextDouble();
		System.out.println("Enter Final Velocity metre/seconds");
		double velocity1 = sc.nextDouble();
		System.out.println("Enter Time Interval in seconds");
		double time = sc.nextDouble();
		double accleration = (velocity+velocity1)/time;
		System.out.println(" Initial Velocity = "+velocity+"\n Final Velocity = "+velocity1+"\n Time Taken ="+time);
		System.out.println("Accleration = Final Velocity - final Velocity ");
		System.out.println("              --------------------------------");
		System.out.println("                       Time Taken             ");
		System.out.println(" Accleration = "+accleration+"m/sec^2");
	}

}
