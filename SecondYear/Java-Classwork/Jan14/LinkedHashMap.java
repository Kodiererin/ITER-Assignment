package Jan14;

import java.util.Map.Entry;

class Student{
	int age;
	String name;
	Student(String name , int age){
		this.age = age;
		this.name = name;
	}
}

public class LinkedHashMap {
	public static void main(String[] args) {
		java.util.LinkedHashMap<Student, Integer> obj = new java.util.LinkedHashMap<>();
		obj.put(new Student("Ujjwal",12), 63);
		obj.put(new Student("Ujjwal Kumar",13), 64);
		obj.put(new Student("Ananya Sen",20), 65);
		obj.put(new Student("Shubham Swain",23), 66);
		obj.put(new Student("Joydeep",25), 67);
//		obj.put(null, 68);
		
		
		for(Entry<Student, Integer> m : obj.entrySet() ) {
			System.out.println(m.getKey().name+" "+m.getKey().age+"			Registration Number : ->"+m.getValue());
		}
		
		obj.put(null, null);
		System.out.println();
	}
}
