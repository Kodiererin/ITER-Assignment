import java.util.*;
public class A5Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int x = sc.nextInt();
		for(int i=1 ; i<=x ; i++)
		{
			int power = (int)Math.pow(x, i);
			System.out.println(i+"  "+power);
		}
	}

}
