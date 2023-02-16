//	An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your program to determine
//	whether or not the number is divisible by 9. Test it on the following numbers:
//	n = 123456
//	n = 154368
//	n = 621594
//	Hint: Use the % operator to get each digit; then use / operator to remove the digit.
import java.util.*;
public class A4Q8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number that you want to find = ");
			int x = sc.nextInt();
// we have to find the length of the integer 
		int product;
		int prod = 0;
		int ctr = 0;
		int remainder = x;
		while(remainder!=0)
		{
			prod = remainder/10;
			remainder = prod;
			ctr++;
		}
		System.out.println("The Integer Length is = "+ctr); 
//		We now know the length of the integer 
//	jai mata di lets rockz
		int sum = 0;
		for(int i=ctr ; i>=1 ; i--)
			{
				int poweroften = (int)Math.pow(10, (i-1));
				int quotient = x/poweroften; // poweroften = power of 10
				sum =  sum+quotient;
				x = x%poweroften;
			}
		if(sum%9==0)
		{
			System.out.println("The Number is Divisible By 9 ");
		}
		else
		{
			System.out.println("The Number is Not Divisible By 9");
		}
	}
}
