import java.util.Scanner; 
/* Warning : Iam using the formula 1/2*base*height to calculate the area of the Triangle
 * 
 */
public class P10 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("AREA OF A TRIGNGLE");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Co-ordinate First Side of a Triangle");
		double a = sc.nextInt();
		double b = sc.nextInt();
		System.out.println("Enter the Co-ordinate Second Side of a Triangle");
		double c = sc.nextInt();
		double d = sc.nextInt();
		System.out.println("Enter the Co-ordinate Third Side of a Triangle");
		double e = sc.nextInt();
		double f = sc.nextInt();
		//calculating distance
		double ce = e-c;
			double mid1 = ce/2;
		ce = ce*ce;
		double df = f-d;
			double mid2 = df/2;		
		df = df*df;
		double sum = ce + df;
		double length = Math.sqrt(sum); //length nikal gya
		//calculating height length
		double h1 = mid2 -a;
		double h2 = mid2 -b;
		h1 = h1*h1;
		h2 = h2*h2;
		double sumh = h1+h2;
		double base = Math.sqrt(sumh); //height nikal gya
		//now area
		double a1 = (length*base)/2;
		a1 = a1/2;
	//	area = area/2.0;
		System.out.println("Base of the Triangle"+length); //base
		System.out.println("Height of the triangle"+base); //height
		System.out.println("Area = "+a1);
		a1 =(int) a1;
		System.out.println("Area = "+a1);
		
	}

}
