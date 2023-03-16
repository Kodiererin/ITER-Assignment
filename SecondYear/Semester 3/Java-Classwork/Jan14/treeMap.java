package Jan14;
//	Write a Program  to create a Class StudRn and StudeDetails.
//	Create a TreeMap insert some records and search a particular record according to the particular record.
//	StudentRNClass it as follows.
//	Year of Admission , Branch Code , Random No.


//	Student Details as Follows :
//	Name, age,marks
class iStudent implements Comparable{
	int YOA;
	String branch;
	int rn;
	iStudent(int YOA, String branch , int rn){
		this.branch= branch;
		this.rn = rn;
		this.YOA = YOA;
	}
	@Override
	public int hashCode() {
		return this.rn;
	}
	public boolean equals(Object o) {
		iStudent m = (iStudent)o;
		return (this.rn==m.rn);
	}
	public String toString() {
		return this.branch+" "+this.rn+" "+this.YOA;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		iStudent m = (iStudent)o;
		if(this.rn==m.rn) {
			return 0;
		}
		else if(this.rn>m.rn) {
			return 1;
		}
		else {
			return -1;
		}
	}
}

class StudDetails{
	String Name;
	int age;
	int marks;
	StudDetails(int age, int marks , String name){
		this.age = age;
		this.marks = marks;
		this.Name = name;
	}
	public String toString() {
		return this.Name+" "+this.age+" "+this.marks;
	}
}

public class treeMap {
	public static void main(String[] args) {
		java.util.TreeMap<iStudent, StudDetails> obj = new java.util.TreeMap<>();
//		obj.put(new iStudent("CSE" , ), null)
		obj.put(new iStudent(2001,"CSE",1230), new StudDetails(10,21,"Ujjwal"));
		obj.put(new iStudent(2002,"CSE",1234), new StudDetails(10,21,"Ujjwal"));
		obj.put(new iStudent(2003,"CSE",1235), new StudDetails(10,21,"Ujjwal"));
		obj.put(new iStudent(2004,"CSE",1236), new StudDetails(10,21,"Ujjwal"));
		obj.put(new iStudent(2005,"CSE",1237), new StudDetails(10,21,"Ujjwal"));
		obj.put(new iStudent(2006,"CSE",1238), new StudDetails(10,21,"Ujjwal"));
		obj.put(new iStudent(2007,"CSE",1239), new StudDetails(10,21,"Ujjwal"));
		
		for(java.util.Map.Entry<iStudent, StudDetails> m : obj.entrySet()) {
			System.out.println(m.getKey()+"			"+m.getValue());
		}
	}
}
