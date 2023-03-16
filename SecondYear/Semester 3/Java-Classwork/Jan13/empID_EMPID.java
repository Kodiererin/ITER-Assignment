package Jan13;
//	Write a program to create a hashMap() with keys is empId and value as EmpId as EmpDetails.
//	Insert some records,display and search as particular record according to EmpId.

//	EmpID consists of -> yearjoin organisation and random number 
//	Emo Details -> name,salary,add
import java.util.Map;
import java.util.Map.Entry;

class details{
	String name;
	double salary;
	String address;
	details(String name,double salary,String address){
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
}
//	This  is the Key
class Employee implements Comparable{
	int empId;
	details s;
	Employee(int  empId,details s){
		this.empId = empId;
		this.s = s;
	}
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		if(this.empId>e.empId)
			return 1;
		else if(this.empId<e.empId)
			return -1;
		else
			return 0;		
	}
	public boolean equalsTo(Object o) {
		Employee e = (Employee)o;
		return this.empId==e.empId;
	}
	public int hashCode() {
		return this.empId;
	}
	public boolean equals(Object o) {
		Employee e = (Employee)o;
		return this.empId==e.empId;
	}
}
//	This is the Value
class EmpId{
	int yearOfJoin;
	String organisation;
	int randomNo;
	EmpId(int yearOfJoin , String organisation , int randomNo){
		this.organisation = organisation;
		this.yearOfJoin = yearOfJoin;
		this.randomNo = randomNo;
	}
}

public class empID_EMPID {
	public static void main(String[] args) {
		java.util.HashMap<Employee, EmpId> obj = new java.util.HashMap<Employee, EmpId>();
		
//		Inserting Some Elements
		obj.put(new Employee(1121,new details("Ujjwal",11213,"Dhanabd")), new EmpId(2000,"TCS",12));
		obj.put(new Employee(1122,new details("Shubham",100000,"Behrampur")), new EmpId(2001,"Google",13));
		obj.put(new Employee(1123,new details("Joydeep",200000,"Jamshedpur")), new EmpId(2000,"Microsooft",14));
		obj.put(new Employee(1124,new details("Prerna",1010101,"Bhubaneshwar")), new EmpId(2000,"Qualcomn",15));
		obj.put(new Employee(1125,new details("Ananaya",20000000,"Bokaro")), new EmpId(2000,"Google",16));
		
//		Displaying the Data
		for(Entry<Employee, EmpId> m : obj.entrySet()) {
			System.out.println(m.getKey().empId+" "+m.getKey().s.name+" "+m.getKey().s.salary+" "+m.getKey().s.address+"  ---->  "+m.getValue().yearOfJoin+" "+m.getValue().organisation+" "+m.getValue().randomNo);
		}
		System.out.println("The Size of the Hashmap "+obj.size());
		
//		Searching the Employee
		System.out.println("Searching the Employee"+obj.containsKey(new Employee(1125,new details("Ananaya",20000000,"Bokaro"))));
		
//		Adding Duplicates and Checking
		System.out.println("\nAdding Duplicates and Checking");
		obj.put(new Employee(1123,new details("Joydeep",200000,"Jamshedpur")), new EmpId(2000,"Microsooft",14));
//		Displaying the Data
		for(Entry<Employee, EmpId> m : obj.entrySet()) {
			System.out.println(m.getKey().empId+" "+m.getKey().s.name+" "+m.getKey().s.salary+" "+m.getKey().s.address+"  ---->  "+m.getValue().yearOfJoin+" "+m.getValue().organisation+" "+m.getValue().randomNo);
		}
		System.out.println("The Size of the Hashmap after adding Duplicate "+obj.size());
	}
}
