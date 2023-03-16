package Jan18;
//Create a user defined Exception and throw is if the age is less than that of 18
class myException extends Exception{
	myException(String name){
		super(name);
	}
	public String toString() {
		return "There is an Exception";
	}
}
public class userDefinedException {
	public static void main(String[] args) 
	{
		try {
		validate();}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void validate() throws myException {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter The Age");
		int x = sc.nextInt();
		throw new myException("Age Less than 18");
	}
}