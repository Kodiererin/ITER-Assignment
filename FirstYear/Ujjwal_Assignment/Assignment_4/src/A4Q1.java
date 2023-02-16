//	Write a java program that gets three integers from the user. Count from the first number to the second number in
//	increments of the third number. Use a for loop to do it.
//	Count from: 4
//	Count to: 13
//	Count by: 3
//	4 7 10 13
import java.util.*;
public class A4Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
		System.out.print(x+" , ");
		do
		{
			x = x+z;
			System.out.print(x+" , ");
		}while(x !=y);
	}

}
