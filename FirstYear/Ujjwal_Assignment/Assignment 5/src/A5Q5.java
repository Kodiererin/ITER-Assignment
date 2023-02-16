import java.util.*;
public class A5Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int x = 0;
		 int sum = 0;
		 int ctr=0;
		 System.out.println("Enter The Numbers ");
		 while(x>=0)
		 {
			 x = sc.nextInt();
			 sum = sum+x;
			 ctr++;
		 }
		 System.out.println("Resultant Sum = "+sum);
		 System.out.println("Average sum ="+(sum/ctr));
	}

}
