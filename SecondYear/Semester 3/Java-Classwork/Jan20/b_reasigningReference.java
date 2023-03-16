package Jan20;
//	Reassigning the reference Variable : This is another method for elegible the method of an objecyy.
/*
 * 	o1------> 10;				(a)
 * 	o1------> 20;				(b)
 * 
 * As the new data is entered in the o1 so (a) will go to the garbage collection.
 * 
 */

class Reassign{
	String str;
	Reassign(String str){
		this.str = str;
	}
	@Override
	public void finalize() {
		System.out.println("The Garbage is collected "+this.str);
	}
}
public class b_reasigningReference {
	public static void main(String[] args) {
		Reassign o1 = new Reassign("29");
		Reassign o2 = new Reassign("30");
		o1 = o2;
		System.gc();
	}
}
