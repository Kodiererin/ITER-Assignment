//	Write a java program to print the below given pattern using while loop as well as for loop in two different programs.
//	For input, N = 5.
//	*
//	* *
//	* * *
//	* * * *
//	* * * * *
public class A4Q10 {

	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		int j=1;
		while(j<=5)
		{
			int k=1 ; 
			while(k<=j)
			{
				System.out.print("* ");
				k++;
			}
			System.out.println();
			j++;
		}
	}

}
