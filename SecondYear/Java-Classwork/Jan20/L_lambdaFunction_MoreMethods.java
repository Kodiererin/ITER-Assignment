package Jan20;
/*
 * Collections.sort(LL,comparable c = (s1)->{
 * 		// Inorder to sort using comparable we can use comparable which is easy to use and implement.				
 * })
 */

interface Calculate{
	public int add(int x,int y);
}
public class L_lambdaFunction_MoreMethods {
	public static void main(String[] args) {
		Calculate obj =(x,y)->(x+y);
		Calculate obj2 =(x,y)->{
			++x;
			y++;
			return x+y;
		};
		System.out.println(obj.add(4, 5));
		System.out.println(obj2.add(4, 5));
	}
}