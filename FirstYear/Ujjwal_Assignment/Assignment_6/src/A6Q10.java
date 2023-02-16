import java.util.*;
class A6Q10
{
	static void printChars(char c1 , char c2 , int numberPerLine)
	{
		if(c1<=c2)
		{
			if(numberPerLine<=10)
			{
				System.out.print(c1+" ");
			}
			else
			{
				System.out.println();
				numberPerLine = 0;
			}
			int x = (int)c1;
			x = x+1;
			c1 = (char)x;
			printChars(c1,c2,numberPerLine+1);
		}
		else
		{
			return;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character 1 ");
			char c = sc.next().charAt(0);
		System.out.print("Enter Character 2 ");
			char d = sc.next().charAt(0);
		printChars(c , d , 0);
	}
}