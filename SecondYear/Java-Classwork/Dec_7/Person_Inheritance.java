package Dec_7;
//	Write a Program to create A person class Having member Variable name,age add required member function.

//	Create another class employee having member variablee empcode,salary and required Member function.
//	Create the object of employee class to print the name,age and employCode, Salary.

//	Inheritance : IS A Relationship

class Address {
	private int plotNo;
	private String Lane;
	private String city;
	private String State;
	private int pinCode;

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public String getLane() {
		return Lane;
	}

	public void setLane(String lane) {
		Lane = lane;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

}

class Person {
	private String name;
	private int age;
	private Address obj;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getObj() {
		return obj;
	}

	public void setObj(String Lane, String city, String State, int pincode, int plotNo) {
		this.obj = new Address();
		this.obj.setLane(Lane);
		this.obj.setCity(city);
		this.obj.setPinCode(pincode);
		this.obj.setState(State);
		this.obj.setPlotNo(plotNo);

	}
}

class Emp extends Person {
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

class Allow extends Emp {
	private double TA, DA;

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

	public long countSalary() {
		return (long) ((long) ((getDA() * getSalary()) / 100) + (getTA() * (getSalary()) / 100) + (getSalary()));

	}

}

public class Person_Inheritance {
	public static void main(String[] args) {
		Allow p = new Allow();
		p.setName("A Pandey");
		p.setEmpCode(10110);
		p.setSalary(12417);
		p.setDA(12);
		p.setTA(10);
		p.setAge(19);
		p.setObj("Krishna Nagar", "Dhanbad", "Jhaarkhand", 828111, 124);

		System.out.println("Person Name " + p.getName());
		System.out.println("Person Employee ID " + p.getEmpCode());
		System.out.println("Employee Salary " + p.getSalary());
		System.out.println("Employee Total Salary " + p.countSalary());
		System.out.println("Person Age " + p.getAge());
		System.out.println("Person Plot No " + p.getObj().getPlotNo());
		System.out.println("Person Lane No " + p.getObj().getLane());
		System.out.println("Person City No " + p.getObj().getCity());
		System.out.println("Person State No " + p.getObj().getState());
		System.out.println("Person Pincode No " + p.getObj().getPinCode());
	}
}
