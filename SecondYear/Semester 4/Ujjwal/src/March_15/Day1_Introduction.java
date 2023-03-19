package March_15;

public class Day1_Introduction {
	public static void main(String[] args) {
//		System.out.println("Hello World");
//		count(10000);
//		findSum(10000);
		System.out.println(findDigitSum(123));
	}
//	Write a Program to find the Time Complexity of the 1,2,3,4,5,6.....upto n Numbers.
	public static int count(int x) {
		Long time = System.currentTimeMillis();
		int c = 0;
		int sum = 0;
		c+=1;
		for(int i=0 ; i<x ; i++) {
			c+=1;
			sum+=i;
			c+=1;
		}
		c+=1;
		c+=1;
		System.out.println("Time Complexity "+c);
		Long time2 = System.currentTimeMillis()-time;
		System.out.println("Actual time in Millisecond is "+time2);
		return sum;
	}
//	Write a Program to find the Time Complexity of the 1,3,5,7...n+2 Numbers.
	public static int findSum(int n) {
		Long time = System.currentTimeMillis();
		int c = 0;
		int sum = 2;
		c+=1;
		for(int i=2 ; i<n ; i+=0) {
			c+=1;
			sum+=i;
			c+=1;
		}
		c+=1;
		c+=1;
		System.out.println("Time Complexity "+c);
		Long time2 = System.currentTimeMillis()-time;
		System.out.println("Actual time in Millisecond is "+time2);
		return sum;
	}
//	Write a function to find the sum of digits of a Number and find the time complexity
	public static int findDigitSum(int n) {
		Long time = System.currentTimeMillis();
		int sum=0;
		int c=1;
		while(n>0) {
			c+=1;
			sum += n%10;
			c++;
			n/=10;
			c++;
		}
		c++;
		System.out.println("The Total Time Complexity is "+c);
		Long time2 = System.currentTimeMillis()-time;
		System.out.println("Actual time in Millisecond is "+time2);
		return sum;
	}
}
