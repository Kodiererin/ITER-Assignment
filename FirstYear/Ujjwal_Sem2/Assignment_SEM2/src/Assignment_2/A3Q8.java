package Assignment_2;

import java.util.Scanner;

interface EmpInterface1
{
	void displayEmp();
	void giveBonus(double amount) throws Exception;
}
abstract class Employee1
{
	int empId;
	String fName;
	String iName;
	int salary;
}
class Manager1 extends Employee1 implements EmpInterface1
{
	Manager1(int empId,String fName,String iname,int salary)
	{
		this.empId = empId;
		this.fName = fName;
		this.iName = iname;
		this.salary = salary;
	}
	@Override
	public void displayEmp() 
	{
		// TODO Auto-generated method stub
		System.out.println("THe Employee id is "+this.empId);
		System.out.println("THe Employee name is "+this.fName);
		System.out.println("THe Employee IdName is "+this.iName);
		System.out.println("THe Employee Salaray is "+this.salary);
	}

	@Override
	public void giveBonus(double amount) throws Exception
	{
		// TODO Auto-generated method stub
		try
		{
			if(amount <=0)
			{
				throw new Exception();
			}
			System.out.println("The Employee Bonus is "+amount);
		}
		catch(Exception e)
		{
			System.out.println("THe Bonus can neither be zero or negative");
		}
	}
	
}
public class A3Q8 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Playing with implements and abstract class ");
		Manager1[] obj = new Manager1[1];
		for(int i=0 ; i<obj.length ; i++)
		{
			System.out.println("Enter The Employee id,name,idname,salary");
			obj[i] = new Manager1(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
		}
		for(int j=0 ; j<obj.length ; j++)
		{
			obj[j].displayEmp();
		}
		System.out.println("Bonus of the Employees");
		for(int k=0 ; k<obj.length ; k++)
		{
			System.out.println("Enter The Bonus of the Respective Employee no "+k+" is");
			obj[k].giveBonus(sc.nextDouble());
		}
		sc.close();
	}
}
