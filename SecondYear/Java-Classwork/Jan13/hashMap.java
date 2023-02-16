//	Create a HashMap with key name and rn and value name and insert data and display the data.
package Jan13;

import java.util.Map;

class Student implements Comparable{
	int rn;
	String name;
	Student(String name, int rn){
		this.name = name;
		this.rn = rn;
	}
	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		if(this.rn>s.rn) {
			return 1;
		}
		else if(this.rn<s.rn) {
			return -1;
		}
		else
			return 0;
	}
	
	public int hashCode() {
		return this.rn;
	}
	public boolean equals(Object o) {
		Student s = (Student)o;
		return this.name.compareTo(s.name)==0 && this.rn==s.rn;
	}
}

public class hashMap {

	public static void main(String[] args) {
		java.util.HashMap<Student, Integer> obj = new java.util.HashMap<>();
		obj.put(new Student("Ujjwal",1063), 1063);
		obj.put(new Student("Ujjwal",1063), 1063);					// adding duplicate
//		obj.put(new Student(null,), 1064);
		obj.put(new Student("Ananya",1000), 1000);
		obj.put(new Student("Ananya Pandey",0063), 0063);
		obj.put(new Student("Shubham",1063), 1063);
		obj.put(new Student("Shubham Swain",1064), 1064);
		obj.put(new Student("Joydeep",1065), 1065);
		obj.put(new Student("Devjeet",1066), 1066);
		
		System.out.println(obj.size());
		
		for(Map.Entry<Student, Integer> m : obj.entrySet()) {
			System.out.println(m.getKey().name+" "+m.getKey().rn+" ---> "+m.getValue());
		}
		
//		Removing Key along with the Value
		System.out.println(obj.remove(new Student("Ananya Pandey",0063 ),0063));
		
//		Removing by with the Key
		System.out.println(obj.remove(new Student("Joydeep",1065)));
		
//		Contains Key
		System.out.println(obj.containsKey(new Student("Ananya",1000)));
		
		

	}

}
