/* Name : Ujjwal Kumar
 * Registration Number : 2141011063
 * Section : 2141003
 * Branch : B.Tech (Computer Science) 
 * Program Description: Let’s consider a d digit number n. The number n is called a perfect number if sum 
			of each digit to the power d is equals to n. 
			For example: The number n=153 is a perfect number. Because 
			1d+5d+3d = 13+53+33 = 1+125+27 = 153 = n 
			Write a Java method to check if the number n is a perfect number or not. The method prototype is 
			given below: 
			
			public static boolean isPerfectNumber(int n) 
			Use this method in main method to print and count all the perfect numbers between 1 and 
			1000000.
 */


class Project1
{
	public static boolean isArmstrongNumber(int x)
	{
		int copy = x;
		String var = x+"";
		int varLength = var.length();
		int sum = 0;
//		System.out.println("Variable Length = "+varLength);
		for(int i=varLength-1 ; i>=0 ; i--)
		{
			int pow = (int)Math.pow(10, i);
//				System.out.println(pow);
			int m = copy/pow;
//				System.out.println(m);
			copy = copy%pow;
//				System.out.println(copy);
//			System.out.println(m);
//				System.out.println((int)Math.pow(m, varLength));
			sum = sum + (int)Math.pow(m, varLength);
//				System.out.println(sum);
//				System.out.println("......................");
//			sum = sum + (int)Math.pow(m, (varLength-1-i));
//			System.out.println(sum);
		}
		if(x==sum)
		{
			return true;
		}
		if(x==0)
		{
			return false;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
//		isPerfectNumber(153);
		 int ctr = 0;
		for(int i=1 ; i<=1000000 ;  i++)
		{
			if(isArmstrongNumber(i)== true)
			{
				System.out.print(i+" ");
				ctr++;
			}
		}
		System.out.println("\nNo of Perfect Numbers is "+ctr);
	}
}