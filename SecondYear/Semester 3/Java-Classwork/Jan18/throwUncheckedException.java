package Jan18;
//	Throw Unchecked Exception
public class throwUncheckedException {
	public static void main(String[] args) {
		try {
//			System.out.println(checkAge(20));
			System.out.println(checkAge(17));
		}catch(Exception e) {
			System.out.println("Age Less than 18");
		}finally {
			System.out.println("Hello World");
		}
	}
	
	public static String checkAge(int age) {
		if(age<18)
			throw new java.lang.ArithmeticException("Not Elegible For Voting");
		else
			return "Elegible for Voting";
	}
}	
