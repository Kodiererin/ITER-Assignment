import java.util.*;
class LenaDenaBank
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	LenaDenaBank()
	{
		this.id = 0 ;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.date = "00.00.0000";
		System.out.println("Initial Id				"+this.id);
		System.out.println("Initial Balance				"+this.balance);
		System.out.println("Initial Annua Interest Rate		"+this.annualInterestRate);
		System.out.println("Initial Date				"+this.date);
	}
	LenaDenaBank(int x , double balance)
	{
		this.id = x;
		this.balance = balance;
		System.out.println("The ID is "+this.id+" and the initial balance is "+this.balance);
	}
	static double getMonthlyInterestRate(double balance , double rate)
	{
		rate = rate/12;
		return balance*rate;
	}
	static double withdraw(double withdraw , int balance)
	{
		return balance-withdraw;		
	}
	static double deposit(double deposit , double balance)
	{
		return balanc+deposit;
	}
}
public class A9Q4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Lena Dena Bank ");
		LenaDenaBank B1 = new LenaDenaBank();
		System.out.print("Enter The ID of the Account ");
			int x = sc.nextInt();
		System.out.println("Enter the Intial Balance ");
			double y = sc.nextDouble();
		LenaDenaBank B2 = new LenaDenaBank(x,y);
	}
}