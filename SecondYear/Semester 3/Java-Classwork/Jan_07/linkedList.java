package Jan_07;
//Write a Program to create a linked List of String Object and Search a Particular String from the List.
public class linkedList {
	public static void main(String[] args) {
		java.util.LinkedList<String> ll = new java.util.LinkedList<>();
		ll.add("Hello");
		ll.add("World");
		ll.add("Hello World");
		ll.add("Kem Cho");
		ll.add("Namaste");
		
		System.out.println(ll.contains("Kem Cho"));
	}
}