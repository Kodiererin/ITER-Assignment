import java.util.Scanner;
public class P8 {
// power function hamesha double me hota h toh ya toh usko type casting kro ya usko double me declare kro
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		int c = (int)Math.pow(a, b);
		System.out.println("a          b          pow(a,b)");
		System.out.println(a+"          "+b+"          "+c);
		a = ++a;
		b = ++b;
		 c =(int)Math.pow(a, b);		
		System.out.println(a+"          "+b+"          "+c);
		a = ++a;
		b = ++b;
		 c =(int)Math.pow(a, b);		
		System.out.println(a+"          "+b+"          "+c);
		c =(int)Math.pow(a, b);
		a = ++a;
		b = ++b;
		System.out.println(a+"          "+b+"          "+c);
		a = ++a;
		b = ++b;
		 c =(int)Math.pow(a, b);

		System.out.println(a+"          "+b+"          "+c);
		  
	}

}
