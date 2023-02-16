//	Write a program to find the difference between the sum of the squares of the first one hundred natural numbers and
//	the square of the sum.
//	The sum of the squares of the first ten natural numbers is,
//	1
//	2 + 22 + . . . + 102 = 385
//	The square of the sum of the first ten natural numbers is,
//	(1 + 2 + . . . + 10)2 = 3025
//	Hence the difference between the sum of the squares of the first ten natural numbers
//	and the squares of the sum is 3025 - 385 = 2640.

public class A4Q7 {

	public static void main(String[] args) {
		int sum = 0;
		int productsum = 0;
		int finalproduct;
		long finalpro;
		for(int i=1 ; i<=100 ; i++)
		{
			sum = sum+(i*i);
			productsum = productsum+i;
		}
		finalpro = productsum*productsum	;
		long differ = (productsum*productsum) - sum; 
		System.out.println("The sum of the squares of the first ten natural numbers is "+sum);
		System.out.println("The square of the sum of the first ten natural numbers is "+finalpro);
		System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers\r\n"
				+ "and the squares of the sum is "+sum+" - "+finalpro+" = "+differ);
	}

}
