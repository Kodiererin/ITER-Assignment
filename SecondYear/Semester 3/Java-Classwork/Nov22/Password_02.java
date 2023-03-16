//	Write a program that reads name and DOB and Create Password bby takiing the first two letter from first name annd month from DOB.


package Nov22;
public class Password_02 
{	
	public static String getName(String s)
	{
		String m = "";
		String pass="";
		int i=0;
		while((int)s.charAt(i)!=32)
		{
			m+=s.charAt(i);
			i++;
		}
		return m;
	}
	public static String dob(String s)
	{
		String d,m,y;
		d="";
		m="";
		y="";
		int i=0;
		while((int)s.charAt(i)!=47 && i<s.charAt(i))
		{
			d+=s.charAt(i);
			i++;
		}
		i++;
		while((int)s.charAt(i)!=47 && i<s.charAt(i))
		{
			m+=s.charAt(i);
			i++;
		}
		i++;
//		to return month
		return m;
	}
	public static void main(String[] args) 
	{	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Name ");
		String name = sc.nextLine();
			name = getName(name);
		String x = name.charAt(0)+""+name.charAt(1)+"";
		System.out.println("Enter DOB followed by Forward Slash after Date/Month/Year");
		String DOB = sc.next();
		DOB= dob(DOB);
		System.out.println(DOB);
		System.out.println("The Password is "+x+DOB);
	}
}
