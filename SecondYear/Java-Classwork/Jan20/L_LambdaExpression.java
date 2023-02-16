package Jan20;
/*=================LAMBDA EXPRESSION===============
 * 
 * Lambda Function - New feature added in JAVA 8.
 * It is a concise way of writing a function by which we create an object
 * It is a very powerful function/expression. 
 * 
 * ========The parts of the Lambda Function===========
 * 1. Argument List.
 * 2. Arrow token.
 * 3. Body
 * 
 * () - This is Argument List
 * {} - This is Body.
 * ( ) ->{
 * 			Enter Your Code Here.
 * }
 * 
 * 
 */

interface Drawable{
	public void draw();
//	public void calculate(int x);	One interface for one Method
}
interface Join{
	public void joinWord(String x , String y);
}
interface Hello{
	public String hiii(String Name);
}

public class L_LambdaExpression{
	public static void main(String[] args) {
		int width = 10;
//		This is a Normal Function
//		Drawable d = new Drawable() {public void draw() {System.out.println("Hello World"+width);}};
//		d.draw();
//		--------------------------------------------------------------------------------------------	
//	=========== Using Lambda Function =============
		
		Drawable dj = ()-> {System.out.println("Hello World"+width);};
		dj.draw();
		
//		============= Lambda Function having parameters ================
//		Join dt = (String x , String y)->{
		Join dt = (x , y)->{
			System.out.println(x+" & "+y);
		};
		
		dt.joinWord("Shubham", "Swain");
		
//		Third Interface
		Hello obj = (Name)->("Hello "+Name);
		
		System.out.println(obj.hiii("Ujjwal"));
		
	}
}
