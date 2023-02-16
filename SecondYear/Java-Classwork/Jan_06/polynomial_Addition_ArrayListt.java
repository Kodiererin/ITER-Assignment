package Jan_06;
//	WAP to create a class Named it as Term having member coefficient exponent of a polynomial equation.
//	Create a Array list to represent the Polynomial of  degree n.
//	Then create another polynomial of degree m. And findout the addition of these two polynomoial.
import java.util.ArrayList;
import java.util.Scanner;
// class Term implements Comparable{
// 	int coefficient;
// 	int exponent;
// 	Term(int a , int b){
// 		this.coefficient = a;
// 		this.exponent = b;
// 	}
// 	public boolean equal(Term t) {
// 		return (this.exponent==t.exponent);
// 	}
// 	public int compareTo(Term t)
// 	{
// 		if(this.exponent>t.exponent)
// 			return 1;
// 		else if(this.exponent<t.exponent)
// 			return -1;
// 		else
// 			return 0;
// 	}
// }
public class polynomial_Addition_ArrayListt {

	public static void main(String[] args) {
		takeInputFromUser();
// 		ArrayList<Term> t = new ArrayList<>();
		// t.add(new Term(3,3));
		// t.add(new Term(5,2));
		// t.add(new Term(10,1));
		// t.add(new Term(91,0));
		
// //		Modify the Code after Sorting Proceed
		
		
		
// 		ArrayList<Term> s = new ArrayList<>();
		// s.add(new Term(9,3));
		// s.add(new Term(10,2));
		// s.add(new Term(12,1));
		// s.add(new Term(11,0));
		
// 		ArrayList<Term> sum = new ArrayList<>();
// //		int size;
// //		if(t.size()>s.size()) {
// //			size = t.size();
// //		}
// //		else
// //			size = s.size();
		
// 		for(int i=0 ; i<t.size() ; i++)
// 		{
// 			if(t.get(i).exponent == s.get(i).exponent)
// 			{
// 				int a = s.get(i).coefficient;
// 				int b = t.get(i).coefficient;
// 				int mySum = a+b;
// 				int expo = t.get(i).exponent;
// 				sum.add(new Term(mySum , expo));
// 			}
// 		}
		
// 		for(int i=0 ; i<t.size() ; i++)
// 		{
// 			System.out.print(sum.get(i).coefficient+"x"+sum.get(i).exponent+" + ");
// 		}
// 		System.out.println(0);
	}
	public static void takeInputFromUser()
	{
		ArrayList<Term> t = new ArrayList<>();
		ArrayList<Term> s = new ArrayList<>();
		System.out.println("Enter The First Polynomial and Put Coeff 0 and Expo 0 for Exit");
		int x=-1 ; int y = -1;
		Scanner sc = new Scanner(System.in);
		t.add(new Term(3,4));
		t.add(new Term(5,2));
		t.add(new Term(10,1));
		t.add(new Term(91,0));
		// while((x!=0)&&(y!=0))
		// {
		// 	x = sc.nextInt();
		// 	y = sc.nextInt();
		// 	t.add(new Term(x, y));
		// }
		System.out.println("Enter The Second Polynomial and Put Coeff 0 and Expo 0 for Exit");
		s.add(new Term(10,2));
		s.add(new Term(12,1));
		s.add(new Term(11,0));
		// int a=-1 ; int b = -1;
		// while((a!=0)&&(b!=0))
		// {
		// 	a = sc.nextInt();
		// 	b = sc.nextInt();
		// 	s.add(new Term(a, b));
		// }

		int size = (int)Math.max(t.size(), s.size());
		ArrayList<Term> sum = new ArrayList<>();
		for(int i=0 ; i<size ; i++)
		{
			if(t.get(i).exponent == s.get(i).exponent)
			{
				int m = s.get(i).coefficient;
				int n = t.get(i).coefficient;
				int mySum = m+n;
				int expo = t.get(i).exponent;
				sum.add(new Term(mySum , expo));
			}
			else if(t.get(i).exponent!=0)
				sum.add(new Term(t.get(i).coefficient, t.get(i).exponent));
			else 
				sum.add(new Term(s.get(i).coefficient, s.get(i).exponent));
		}

		for(int i=0 ; i<t.size() ; i++)
		{
			System.out.print(sum.get(i).coefficient+"	x	"+sum.get(i).exponent+" + ");
		}
		System.out.println(0);
		}
	}
