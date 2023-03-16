package Nov25;
public class c_BaseConversion 
{
	public static String  compute(String num , String base)
	{
//		String num = "11011";
//		String base = "2";
		int sum=0;
		for(int i=base.length()-1 ; i>=0 ; i--)
		{
			int m = base.charAt(i)-48;
			sum = (int)Math.pow(10, base.length()-1-i)*m + sum;
		}
		int sumBase=0;
		for(int i=num.length()-1 ; i>=0 ; i--)
		{
			int m = num.charAt(i)-48;
			sumBase = m*(int)Math.pow(sum, num.length()-1-i)+sumBase;
		}
//		System.out.println(sumBase);
		return sumBase+"";
	}
	
	public static String  convert(String num , String base)
	{
//		String num = "123";
//		String base= "2";
		int sum=0;
		for(int i=base.length()-1 ; i>=0 ; i--)
		{
			int m = base.charAt(i)-48;
			sum = (int)Math.pow(10, base.length()-1-i)*m + sum;
		}
		int sumBase=0;
		for(int i=num.length()-1 ; i>=0 ; i--)
		{
			int m = num.charAt(i)-48;
			sumBase = m*(int)Math.pow(10, num.length()-1-i)+sumBase;
		}
//		System.out.println(sumBase);
		String finalM = "";
		while(sumBase!=0)
		{
			int m = sumBase%sum;
			finalM = m+finalM;
			sumBase = sumBase/sum;
		}
		return finalM+"";
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number That you want to convert");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String num = sc.next();
		System.out.println("Enter The Base of the Number ");
		String base = sc.next();
		
		System.out.println("Enter The Base of the Number that You want to convert ");
		String baseTo = sc.next();
		System.out.println(compute(num,base));
		System.out.println(convert(compute(num,base),baseTo));
	}
}
