package Assignments_2A;
/*
	Write a program to create an ArrayList of Integer type and perform
	the below operation on it.
	(a.) Display the list
	(b.) Ask the user to enter a number and search that number is it
	present in the list or not.
	(c.) Remove an element from an asked position.
	(d.) Add a condition to check the ArrayList is empty or not.
 */
public class Question_1 {
	public static void main(String[] args) {
		
	}
	public static void operation() {
		java.util.ArrayList<Integer> list = new java.util.ArrayList();
//		Adding Elements 
		list = addElements(list);
		
//		Displaying The list
		display(list);
		
//		Remove an element from the asked Position
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the Element Position that must be removed");
		list = removeElement(list, sc.nextInt());
		
//		Checking if the Array List is Empty or Not
		
	}
	public static java.util.ArrayList<Integer> addElements(java.util.ArrayList<Integer> list) {
		for(int i=0 ; i<5 ; i++) {
			list.add((int)Math.random()*10+1);
		}
		return list;
	}
	
	public static void display(java.util.ArrayList<Integer> list) {
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
	public static java.util.ArrayList<Integer> removeElement( java.util.ArrayList<Integer> list,int x){
		list.remove(x);
		return list;
	}
	public static void isEmpty(java.util.ArrayList<Integer> list) {
		if(list.isEmpty())
			System.out.println("The List Is Empty");
		else
			System.out.println("The List is Not Empty");
	}
}
