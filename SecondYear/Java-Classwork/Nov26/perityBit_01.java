package Nov26;
//		Write a Program to compute the perity bit of a Word.
public class perityBit_01 
{
	public static void perityBit()
	{
//		int m =-5  ;
//		int n = -1;

		int m = 6;
		System.out.println(Integer.toBinaryString(-5));
//		System.out.println(Integer.toBinaryString(n));
		int ctr=0;
		while(m>0)
		{
			ctr = m&1;
			m = m>>1;
			ctr = ctr^1;
			System.out.println(ctr);
		}
		if(ctr==1)
			System.out.println("Odd Perity");
		else
			System.out.println("Even Perity");
	}
	
//	Optimised Code
	public static void optimise()
	{
//		Count the number of perity bit in Order K time
		System.out.println(Integer.toBinaryString(-1));
		int m = -1;
		int ctr=0;
		while(m>0)
		{
			m = m&(m-1);
			ctr = ctr^1;
		}
		if(ctr==1)
			System.out.println("Odd Perity Bit");
		else
			System.out.println("Even Perity Bit");
	}	
	public static void main(String[] args) 
	{
		perityBit();
		optimise();
	}
}
