package Assignment_2;
interface EmpInterface
{
	void displayEmp();	
	void giveBonus(double amount)  throws Exception;
}
class Employee
{
	int empId;
	String fName;
	String IName;
	int Salary;
}
class Manager extends Employee implements EmpInterface
{
	Manager()
	{
		
	}

	@Override
	public void giveBonus(double amount)
	{
		double bonus = amount;
		// TODO Auto-generated method stub
		try
		{
			if(bonus<0)
			{
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			System.out.println("The Bonus Cannot be nagative");
		}
	}
//			A doubt has been occured so the program has been paused.
//	c. Create an array of interface reference variables and populate with manager objects. 

	@Override
	public void displayEmp() {
		// TODO Auto-generated method stub
		
	}
	
}
public class A2Q8 {

}
