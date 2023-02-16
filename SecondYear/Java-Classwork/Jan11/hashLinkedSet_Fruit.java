//WAP to create a class named it as Fruit having members name of the Fruit and color of the Fruit.
//Create a Hashset of Fruits Insert some elements into it and search a Particular elemenr into the Hashset.


package Jan11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Fruit implements Comparator{
	String Fruit;
	String color;
	Fruit(String Fruit , String color){
		this.color = color;
		this.Fruit = Fruit;
	}
	public boolean equals(Object obj) {
		Fruit p = (Fruit)obj;
		if(this == obj) {
			return true;
		}
		if(obj==null || obj.getClass()!=this.getClass())
			return false;
		
		return (p.Fruit.equals(this.Fruit) && p.color == this.color);
	}
	public int hashCode() {
		return this.color.hashCode();
	}
	public int compare(Object o1, Object o2) {
		Fruit f1 = (Fruit)o1;
		Fruit f2 = (Fruit)o2;
		if(f1.Fruit.equals(f2.Fruit)) return 0;
		else if(f1.Fruit.compareTo(f2.Fruit)>0) return 1;
		else return -1;
	}	
	public int compare(Fruit f1 , Fruit f2)
	{
		return f1.Fruit.compareTo(f2.Fruit);
	}
	
	public String toString() {
		return this.Fruit+" "+this.color;
	}
}

class myHelper implements Comparator
{
	public int compare(Object o1, Object o2) {
		Fruit f1 = (Fruit)o1;
		Fruit f2 = (Fruit)o2;
		if(f1.Fruit.equals(f2.Fruit)) return 0;
		else if(f1.Fruit.compareTo(f2.Fruit)>0) return 1;
		else return -1;
	}	
//	public int compare(Fruit f1 , Fruit f2)
//	{
//		return f1.Fruit.compareTo(f2.Fruit);
//	}
}
public class hashLinkedSet_Fruit{
	public static void main(String[] args) {
		java.util.HashSet<Fruit> obj = new java.util.LinkedHashSet<>();
		obj.add(new Fruit("Banana","Yellow"));
		obj.add(new Fruit("Apple","Red"));
		obj.add(new Fruit("Guava","Green"));
		obj.add(new Fruit("Stawberry","Red"));
		obj.add(new Fruit("Banana","Red"));
		
		System.out.println(obj.contains(new Fruit("Apple","Red")));
		java.util.List<Fruit> f = new java.util.ArrayList<Fruit>(obj);
		f.sort(new myHelper());
		
		for(Fruit mF : f) {
			System.out.println(mF);
		}
		
//		System.out.println(obj.hashCode());
		System.out.println("Element Found At Index ->"+Collections.binarySearch(f, new Fruit("Guava","Green"), new myHelper()));
		
	}
}