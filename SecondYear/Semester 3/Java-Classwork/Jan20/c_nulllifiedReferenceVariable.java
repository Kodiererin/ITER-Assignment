package Jan20;

/*
 * 	Obj1 -> 1267;
 * 	obj2 -> null;
 * 
 * Then the reference of 1267 will be deleted.
 * 
 * 	
 */
//	Write a Program to create a nullified object  and collect it as a garbage.

public class c_nulllifiedReferenceVariable {
	String str;
	 c_nulllifiedReferenceVariable(String str)
	{
		this.str = str;
	}
	public void update(String str) {
		this.str = null;
	}
	@Override
	public void finalize() {
		System.out.println("Garbage Collected "+this.str);
	}
	public static void main(String[] args) {
//		System.out.println("Garbage Collection ");
		 c_nulllifiedReferenceVariable obj = new  c_nulllifiedReferenceVariable("Kumar");
//		obj.getData("Ujjjwal");
		obj = null;
		System.gc();
//		This can also work in different class also.
	}
}
