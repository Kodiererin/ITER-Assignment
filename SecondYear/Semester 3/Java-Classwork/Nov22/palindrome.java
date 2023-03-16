package Nov22;

public class palindrome 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter String ");
		String m = sc.nextLine();
		String n = "";
		for(int i=m.length()-1 ; i>=0 ;  i--)
		{
			n+=m.charAt(i);
		}
		if(m.compareTo(n)==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
