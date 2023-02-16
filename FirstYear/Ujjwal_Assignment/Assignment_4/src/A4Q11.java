import java.util.*;
public class A4Q11 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Option ");
			int x = sc.nextInt();
		switch(x) //Switch case has been used
		{
		case 1:
		{   	// first Pattern
			for(int i=0 ; i<=5 ; i++)
			{
				for(int k=5 ; k>=i; k--)
				{
					System.out.print(" ");			
				}
				for(int j=1 ; j<=i ; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			break;
		}
		case 2:
		{			// second pattern
			for(int i=0 ; i<=5 ; i++)
			{
				for(int k=5 ; k>=i; k--)
				{
					System.out.print(" ");			
				}
				for(int j=1 ; j<=i ; j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			break;
		}
		case 3 :
		{			// Third Pattern
			for(int i=0 ; i<=5 ; i++)
			{
				for(int k=5 ; k>=i; k--)
				{
					System.out.print(" ");			
				}
				for(int j=1 ; j<=i ; j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
				
			}
			break;
		}
		case 4:
		{		// fourth pattern
			int ctr =0;
			for(int i=0 ; i<=5 ; i++)
			{
				
				for(int k=5 ; k>=i; k--)
				{
					System.out.print(" ");			
				}
				for(int j=1 ; j<=i ; j++)
				{
//				yha se doubt h toh yhi se continue krna
					ctr = ctr+1;
					System.out.print(ctr+" ");
				}
				System.out.println();
				
			}
			break;
		}
		default : // by default if any other input rather than 1-4 is done then
		{
			System.out.println("Invalid Input");
			break;
		}
		}
		}
	}
