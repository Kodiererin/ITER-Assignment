import java.util.Scanner;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of the Cylinder");
		double radius = sc.nextDouble();
		System.out.println("Enter Length of the Cylinder");
		double length = sc.nextDouble();
		double pi = 3.14;
		double area = radius*radius*pi;
		double volume = area*length;
		System.out.println("Area ="+area);
		System.out.println("Volume ="+volume);
	}

}
