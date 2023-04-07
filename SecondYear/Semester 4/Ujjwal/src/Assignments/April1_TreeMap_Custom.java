package Assignments;

class Address{
	int plotNo;
	String At;
	int post;
	Address(int plotNo,String At,int post){
		this.At = At;
		this.plotNo = plotNo;
		this.post = post;
	}
	public String toString() {
		return this.At+" "+this.plotNo+" "+this.post+" ";
	}
}

public class April1_TreeMap_Custom {
	public static void main(String[] args) {
		TreeMap();
	}
	public static void TreeMap() {
		java.util.TreeMap<Integer, Address> obj = new java.util.TreeMap<>();
		obj.put(1, new Address(12,"Krishna Nagar",826005));
		obj.put(1, new Address(12,"Krishna Nagar",826005));
		obj.put(1, new Address(12,"Krishna Nagar",826005));
		obj.put(1, new Address(12,"Krishna Nagar",826005));
		
		for (java.util.Map.Entry<Integer, Address> entry : obj.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
}
