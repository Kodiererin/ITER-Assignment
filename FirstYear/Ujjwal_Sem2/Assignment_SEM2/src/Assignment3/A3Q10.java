//	The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers, 
//	each is the sum of the preceding two. Write a recursive method in Java which, given n,
//	returns the n
//	th Fibonacci number.
package Assignment3;
public class A3Q10 
{
	public static int fibonacci(int first , int second , int count , int limit)
	{
		if(limit == 0 )
		{
			return 0;
		}
		if(count<limit)
		{
			int temp = first + second;
			first = second;
			second = temp;
			return fibonacci(first , second , count+1 , limit);
		}
		if(count>=limit)
		{
			return second;
		}
		return second;
	}
	public static void main(String[] args) 
	{
		int n = 6;
		System.out.println(fibonacci(1 , 1 , 1  , 11));
	}
}
