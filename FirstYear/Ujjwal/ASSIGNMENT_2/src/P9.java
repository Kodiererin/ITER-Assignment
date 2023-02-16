import java.util.Scanner;
public class P9 
{
	public static void main(String[] args)
	{
		System.out.println("Enter two Points Coordinates");
		System.out.println("Enter The Coordinates of the first Point");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter The Coordinates of the first Point");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println(x1+","+y1+".---------------------------------------."+x2+","+y2);
		int a = x2-x1;
		a = a*a;
		int b = y2-y1;
		b = b*b;
		double sum = b+a;
		double dis1 = Math.sqrt(sum);
		System.out.println("Distance Between Two Point = "+dis1);
	}
}
