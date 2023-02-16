import java.util.Scanner;
public class P3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers in Feet");
		int feet = sc.nextInt();
		System.out.println("One Foot = 0.305 metre");
		double metre = 0.305*feet;
		System.out.println("So "+feet+" foot = "+metre+" metre");
		
	}

}
