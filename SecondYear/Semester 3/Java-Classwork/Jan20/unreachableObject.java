package Jan20;


public class unreachableObject {
	String str;
	public unreachableObject(String str) {
		this.str = str;
	}
	public void test1() {
		unreachableObject obj = new unreachableObject("Ujjwal");		// this is unreachable so this cannot be overrided. and So this will be removed.
		test2();
//		Locale scope is reachable within function.
	}
	public void test2() {
		unreachableObject obj = new unreachableObject("Ujjwal Kumar");
	}
	@Override
	public void finalize() {
		System.out.println("Garbage Collection Successful "+this.str);
	}
	public static void main(String[] args) {
		unreachableObject obj = new unreachableObject("Shubham");			// This is reachable so this is overrided and Grabage collection not worked
		obj.test1();
		System.gc();
	}
}
//	Destroy hamesha ulta hota h! issi kaaran Ujjwal Kumar se -> Ujjwal jaaa rha h!
//	So creation top to down and deletion bottom to up.
//	Constructor  and Destructor :
//	Destructur : It remove the allocation of thhe memoryy eg In c languuage we have to dynamically de-allocate the memory