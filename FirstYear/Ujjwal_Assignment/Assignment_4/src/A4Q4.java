//	If we list all the natural numbers below 10 that are multiple of 3 or 5, we get 3, 5, 6 and 9. The sum of these
//	multiples is 23. Write a program to find the sum of all the multiples of 3 or 5 below 1000
public class A4Q4 {

	public static void main(String[] args) 
	{
		int x = 3;
		int y = 5;
		int i=1;
		int sum = 0;
		while(i<1000)
		{
			if(i%3==0 || i%5==0)
			{
				sum = sum+i;
			}
			i = i+1;
		}
		System.out.println(sum);
	}

}
