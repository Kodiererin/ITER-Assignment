import java.util.Scanner;
public class P7 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Sides a HEXAGON");
		int side = sc.nextInt();
		{
			double area = ((3*1.73205080757)/2)*(side * side);
			System.out.println("Area of Hexagon = "+area);
		}
	}
}
