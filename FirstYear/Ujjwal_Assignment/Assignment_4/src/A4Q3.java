ki98//	Write a java program to print the following output using loop. Where, input is the number of rows in output pattern.
//	For input, N = 5.
//	1
//	121
//	1213121
//	121312141213121
//	1213121412131215121312141213121
public class A4Q3 {

	public static void main(String[] args) 
	{
		String m = "";
		for(int i = 1; i<=4 ; i++)
		{
			m = m+i+m;
			System.out.println(m);
		}
	}

}
