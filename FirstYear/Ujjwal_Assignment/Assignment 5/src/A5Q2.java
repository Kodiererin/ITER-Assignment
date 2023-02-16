import java.util.*;
public class A5Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the students");
		int x = sc.nextInt();
		int pass=0;
		int fail = 0;
		for(int i=1 ; i<=x ; i++)
		{
			int marks = sc.nextInt();
			if(marks>=40)
			{
				pass++;
			}
			else
			{
				fail++;
			}
		}
		System.out.println("Number of Students passed = "+pass);
		System.out.println("Number of Students passed = "+fail);
	}

}
