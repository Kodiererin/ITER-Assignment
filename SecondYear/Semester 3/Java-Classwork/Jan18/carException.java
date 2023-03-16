package Jan18;
//	Write a program to create a Class Car having modelNo,and Name of the Car.

//	IF THE model no is more than 3 digit it throw a user defined exception exceed no of digits.
//	And name of the Car  is more than one word then it throw user defined exception 

class Car{
	String modelNo;
	String name;
	Car(String name,String  modelNo){
		this.name = name;
		this.modelNo = modelNo;
	}
}
class noOfDigits extends Exception{
	noOfDigits(String s){
		super(s);
	}
	public String toString() {
		return "No of Digits must not exceed 3";
	}
}
class moreThanThree extends Exception{
	moreThanThree(String s){
		super(s);
	}
	public String toString() {
		return "No of Digits must not exceed 3";
	}
}
public class carException {
	public static void main(String[] args) throws moreThanThree,noOfDigits {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter The Data");
		Car[] c= new Car[2];
		for(int i=0 ; i<c.length ; i++) {
			String name = sc.next();
			if(name.length()>3) throw new moreThanThree("Car name cannot be more than 3");
			String model = sc.next();
			if(model.length()>3) throw new noOfDigits("Model No cannot be more than 3");
			c[i] = new Car(name,model);
		}
	}
	public static void display(Car[] c) {
		for(int i=0 ; i<c.length ; i++) {
			System.out.println(c[i].name+" "+c[i].modelNo);
		}
	}	
}
