import java.util.Scanner;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of its Digits");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number Between 0 and 1000");
		int num = sc.nextInt();
		boolean check = (num>=0 && num <=1000)? true:false;
		
		{
			int one = num%100;
			int two = num/100;
			int three = one/10;
			int four = one%10;
			int sum = two + three + four;
			System.out.println(sum);
		}
		check = false;
		{
		System.out.println("Please Enter any Number between 0 - 1000");
	}}

}
