
//Write a Program to create Arraylist of String type and add some element and display some list.
package Jan_02;
import java.util.ArrayList;
public class collections_arrayList {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Ujjwal");
		obj.add("Kumar");
		
		for(int i=0 ; i<obj.size() ; i++)
			System.out.println(obj.get(i));
//		System.out.println(obj.toString());
	}
}

