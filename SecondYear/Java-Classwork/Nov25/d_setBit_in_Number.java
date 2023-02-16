package Nov25;

public class d_setBit_in_Number 
{
	public static int compute()
	{
		int m = 123;
//		System.out.println(Integer.toBinaryString(m));
		
		int count = 0;
		while(m>0)
		{
			count +=m &1;
			m>>=1;
		}
		return count;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(compute());
	}
}
