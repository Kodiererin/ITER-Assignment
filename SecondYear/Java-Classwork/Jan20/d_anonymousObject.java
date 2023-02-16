package Jan20;
//	Object that is without name is called Anonymous Object.



//	Create a class Student having member name, age.
//	Create anynymous object of the student i and collect t by the help of the garbage collection.
public class d_anonymousObject {
	int x;
	public d_anonymousObject(int x) {
		this.x = x;
	}
	@Override
	public void finalize() {
		System.out.println("Garbage Collector Invoked "+this.x);
	}
	public static void main(String[] args) {
		System.out.println(new d_anonymousObject(20));		// this is Unreachable and it is a anobymmous object
		System.gc();
	}
}

