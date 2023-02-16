import java.util.*;
public class A5Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N ");
			int n = sc.nextInt();
		double sum = 0.0;
		System.out.println("Enter the Elements till the elements n");
		for(int i=1 ; i<=n ; i++)
		{
			double num = sc.nextInt();
			double divide = 1/num;
			sum = sum+divide;
		}
		System.out.println("The Harmonic mean is "+(n/sum));
	}

}
