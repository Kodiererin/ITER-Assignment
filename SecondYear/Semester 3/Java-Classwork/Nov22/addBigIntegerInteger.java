package Nov22;

public class addBigIntegerInteger
{
	public static void main(String[] args) 
	{
		String m = "863";
		String n = "3";
		
		if(m.length()<n.length())
		{
			while(m.length()!=n.length())
			{
				m="0"+m;
			}
		}
		else
		{
			while(m.length()!=n.length())
			{
				n="0"+n;
			}
		}
		
		int carry = 0;
		int summetation=0;
		String sum = "";
		for(int i = m.length()-1 ; i>=0 ; i--)
		{
			int a = Integer.parseInt(m.charAt(i)+"");
			int b = Integer.parseInt(n.charAt(i)+"");
			summetation = (a+b+carry)%10;
			carry = (a+b+carry)/10;
			sum= summetation+sum;
		}
		System.out.println(sum);
	}

}
