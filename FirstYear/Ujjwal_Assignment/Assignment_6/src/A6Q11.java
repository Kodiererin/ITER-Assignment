import java.util.*;
public class A6Q11 
{
	static int khojo(String name , char find , int i , int ctr)
	{
		if(i>=name.length())
		{
			return ctr;
		}
		if(name.charAt(i)==find)
		{
			return khojo(name,find,i+1,ctr+1);
		}
		else
		{
			return khojo(name,find,i+1,ctr);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Name ");
			String name = sc.nextLine();
		System.out.print("Enter The Character that you want to find ");
			char c = sc.next().charAt(0);
		int x = khojo(name,c,0,0);
		System.out.println(x);
	}
}
