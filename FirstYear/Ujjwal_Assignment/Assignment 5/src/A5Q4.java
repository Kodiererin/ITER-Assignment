import java.util.*;
public class A5Q4 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int positive = 0;
		int negative = 0;
		float total = 0f;
		float average = 0f;
		int ctr= 0;
		int num;
		System.out.println("Enter the Numbers ");
		do
		{
			num = sc.nextInt();
			if(num>0)
			{
				positive++;
			}
			else if(num<0)
			{
				negative++;
			}
			total = num+total;	
			ctr++;
		}while(num!=0);
		average = total/ctr;
		System.out.println("The number of Positives ="+positive);
		System.out.println("The number of negatives ="+negative);
		System.out.println("The total = "+total);
		System.out.println("The number of Positives ="+average);
	}

}
