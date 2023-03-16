package Dec_10;

class Mark extends Student {
	private int Mark1;
	private int Mark2;
	private int Mark3;

	Mark(String name, int r, int a, int Mark1, int mark2, int mark3) {
		super(name, r, a);
		this.Mark1 = Mark1;
		this.Mark2 = mark2;
		this.Mark3 = mark3;
	}

	public int getMark1() {
		return this.Mark1;
	}

	public int getMark2() {
		return this.Mark2;
	}

	public int getMark3() {
		return this.Mark3;
	}
}

public class markSheet {
	public static void main(String[] args) {
		Mark obj = new Mark("Ujjwal", 200101, 20, 19, 21, 29);
		System.out.println("Student Name " + obj.getName());
		System.out.println("Student Age " + obj.getAge());
		System.out.println("Student Roll No " + obj.getRollNo());
		System.out.println("Total Marks " + (obj.getMark1() + obj.getMark2() + obj.getMark3()));
	}
}
