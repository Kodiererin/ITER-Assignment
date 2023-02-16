package Jan_07;

import java.util.Iterator;

public class iterator {
	public static void main(String[] args) {
		java.util.ArrayList<Integer> obj = new java.util.ArrayList<>();
		obj.add(12);
		obj.add(13);
		obj.add(14);
		obj.add(15);
		obj.add(17);
		
//		Using Iterator 
		Iterator<Integer> s = obj.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		System.out.println("Using the Advanced Iterator");
//		Using the Advanced Iterator
		for(Integer i : obj) {
			System.out.println(i);
		}
	}
}


