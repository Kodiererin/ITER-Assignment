package Nov26;
//	Write a program to swap the ith and jth bit of a number
public class swap_02 
{
	/*
	 * 	x = 5 -: 00000101
	 * 				i j
	 * 	Swap i and j so the o/p becomes 000010001
	 * 
	 */
	public static void main(String[] args)
	{
		int x = 1112;
		int shiftFrom = 3;
		int shiftTo  =6;
		if(((x>>>(shiftFrom-1)))!=((x>>>(shiftTo-1))))
		{
			int bitMask = (1<<(shiftFrom-1) | 1<<(shiftTo-1));
			x^=bitMask;
		}
		System.out.println(x);
	}
}
