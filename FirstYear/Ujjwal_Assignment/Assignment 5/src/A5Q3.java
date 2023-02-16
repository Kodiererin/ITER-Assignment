import java.util.*;
public class A5Q3 {

	public static void main(String[] args) 
	{
		String print = " ";
		for(int i=100 ; i<=1000 ; i++)
		{
			if(i%5==0 || i%6==0)
			{
				print = "i"+print;
				int len = print.length();
				if(len<=11)
				{
				System.out.print(i+" ");
				}
				else
				{
					System.out.println();
					print = " ";
				}
			}
		}

	}

}
