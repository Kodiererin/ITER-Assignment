package Jan_06;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import java.util.ArrayList;
// Mission Successful!
class Term implements Comparable{
	int coefficient;
	int exponent;
	Term(int a , int b){
		this.coefficient = a;
		this.exponent = b;
	}
	public boolean equal(Term t) {
		return (this.exponent==t.exponent);
	}
    @Override
    public int compareTo(Object o) {
        Term t = (Term)o;
        if(this.exponent>t.exponent)
        return 1;
    else if(this.exponent<t.exponent)
        return -1;
    else
        return 0;
    }
}
public class polynomialAddn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Term> s = new ArrayList<>();
        ArrayList<Term> t = new ArrayList<>();
		// Taking Input from the User.
        System.out.println("Enter The Input For the First Polynomial, for Exit press -1 and -1");
        int x=0 ; int y=0;
        while(x!=-1 && y!=-1)
        {
            System.out.println("Enter The Coefficient and the Exponenet");
            x = sc.nextInt();
            y = sc.nextInt();
            if(y!=-1){
                s.add(new Term(x, y));
            }
        }
        System.out.println("Enter The Input For the Second Polynomial, for Exit press -1 and -1");
        x=0 ; y=0;
        while(x!=-1 && y!=-1)
        {
            System.out.println("Enter The Coefficient and the Exponenet");
            x = sc.nextInt();
            y = sc.nextInt();
            if(y!=-1){
                t.add(new Term(x, y));
            }
        }
        new polynomialAddn().compute(t, s);
        sc.close();
    }
    public void compute(ArrayList<Term> t , ArrayList<Term> s)
    {
        ArrayList<Term> sum = new ArrayList<>();
        if(t.size()==0) sum = s;
        if(s.size()==0) sum = t;
        else
        {
            Collections.sort(t); Collections.sort(s);
            int i=0 ; int j=0;
            while(i<s.size() && j<t.size())
            {
                if(s.get(i).exponent==t.get(j).exponent)
                {
                    sum.add(new Term(s.get(i).coefficient + t.get(j).coefficient, s.get(i).exponent));
                    s.remove(i);
                    t.remove(j);
                    i=0;
                    j=0;
                }
                else
                    j++;
            }
            i=0;j=0;
            {
                while(i<s.size())
                {
                    sum.add(new Term(s.get(i).coefficient, s.get(i).exponent));
                    i++;    
                }
                while(j<t.size())
                {
                    sum.add(new Term(t.get(j).coefficient, t.get(j).exponent));
                    j++;
                }
            }

            for(i=0 ; i<sum.size() ; i++)
            {
                System.out.print(sum.get(i).coefficient+"x"+sum.get(i).exponent+" +   ");
            }System.out.println("0");
        }
    }
}
