public class P14 {

	public static void main(String[] args) 
	{
		int a ;
		int b ;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		boolean ans = ((a%b==0)||(b%a==0));
		System.out.println("ANSWER ="+ans);		
	}

}
