//	Write a java program which displays an appropriate name for a person, using a combination 
//	of nested ifs and compound conditions. Ask the user for a gender, first name, last name and 
//	age. If the person is female and 20 or over, ask if she is married. If so, display "Mrs." in 
//	front of her name. If not, display "Ms." in front of her name. If the female is under 20, 
//	display her first and last name. If the person is male and 20 or over, display "Mr." in front 
//	of his name. Otherwise, display his first and last name. Note that asking a person if they 
//	are married should only be done if they are female and 20 or older, which means you will 
//	have a single if and else nested inside one of your if statements. Also, did you know that 
//	with an if statements (or else), the curly braces are optional when there is only one statement 
//	inside?
//---------------------------------------------------------------------------------------------------------------
import java.util.*;
public class A3Q18 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Gender (Male(M) or Female(F) "); 
			char gender = sc.next().charAt(0);
		System.out.print("Enter Your First Name  "); // first name
			String first = sc.nextLine();
		System.out.print("Enter Last Name  "); // last name
			String last = sc.nextLine();
		System.out.print("Enter Your Age  "); // age
			int age = sc.nextInt();
			
		if(gender == 'f' || gender == 'F') // ladies first
		{
			if(age>19)
			{
				System.out.print("Are you Married "+first+" Y/N ");
						char married = sc.next().charAt(0);    
					if(married == 'f' || married == 'F')
					{
						System.out.println("Then I shall call you Mrs. "+first+" "+last+".");
					}
					else
					{
						System.out.println("Then I shall call you Ms. "+first+" "+last+".");
					}
				}
			else 
			{
				System.out.println("Then I shall call you  "+first+" "+last+".");
			}
		}
		
		else  // men next
		{
			if(age>19)
			{
				System.out.println("Then I shall call you Mr "+first+" "+last+".");
			}
			else
			{
				System.out.println("Then I shall call you  "+first+" "+last+".");
			}
		}
	}
}
