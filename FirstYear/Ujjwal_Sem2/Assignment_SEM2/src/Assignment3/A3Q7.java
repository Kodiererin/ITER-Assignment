//BigInteger Class has been used....
package Assignment3;
import java.math.BigInteger;
import java.util.Scanner;

public class A3Q7
{
	static BigInteger factorial(BigInteger x , BigInteger y)
	{
		if(x.equals(0))
			return BigInteger.ONE;
		if(x.compareTo(y)==1)
		{
			x = x.multiply(factorial(x.subtract(BigInteger.ONE),y));
		}
		return x;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Name that You want the Factorial ");
		BigInteger x = sc.nextBigInteger();
		BigInteger y = BigInteger.ONE;
		System.out.println(factorial(x,y));
		sc.close();
	}
}
