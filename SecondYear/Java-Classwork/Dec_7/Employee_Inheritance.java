package Dec_7;
//	Write a Program to create an Employee class Having member variable empCode, salary and required set and get method.
//	Create another class allowance having member variable TA,DA,Percentage and member functions to calculate total salary 
//	Print 
//	Write a main method to print the Employee Details and total Salary.

class Employee
{
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	private int empCode;
	private long salary;
	
}
class Allowance extends Employee
{
	private double TA,DA;

	public double getTA() {
		return TA;
	}

	public void setTA(double tA) {
		TA = tA;
	}

	public double getDA() {
		return DA;
	}

	public void setDA(double dA) {
		DA = dA;
	}
	public long countSalary()
	{
		return (long) ((long)((getDA()*getSalary())/100)+(getTA()*(getSalary())/100)+(getSalary()));

	}
	
}

public class Employee_Inheritance 
{
	public static void main(String[] args) 
	{
		Allowance m = new Allowance();
		m.setEmpCode(110114);
		m.setSalary(1000000);
		m.setTA(10);
		m.setDA(15);
		System.out.println("Employee ID "+m.getEmpCode()+"\nEmployee Salary "+m.getSalary()+"\nTotal Salary "+m.countSalary());
	}
}
