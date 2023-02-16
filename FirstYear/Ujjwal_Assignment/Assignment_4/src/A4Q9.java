//		Write a java program to print largest power of two less 
//		than or equal to N. Where, N is the input to the program.
import java.util.*;
public class A4Q9 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ");
			int x = sc.nextInt();
		int i=0;
		int power = 2;
		while(power<=x)
		{
			i++;
			power = 2*power;
		}
		System.out.println(i+" ");
	}
}