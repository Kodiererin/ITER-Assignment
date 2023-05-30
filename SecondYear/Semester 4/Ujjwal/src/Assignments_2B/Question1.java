package Assignments_2B;

import java.util.TreeSet;

public class Question1 {
    public static void main(String[] args) {
        compute();
    }
    public static void compute(){
        java.util.TreeSet<Integer> tree = new java.util.TreeSet<>();
        tree.add(12);
        tree.add(13);
        tree.add(12);
        tree.add(123);
        tree.add(12);
        
        display(tree);
        System.out.println(isBoolean(tree));
    }
//    Display The data
    public static void display(TreeSet<Integer> tree) {
    	for (Integer data : tree) {
			System.out.println(data);
		}
    }
//  Check if the Data is present or not
    public static boolean isBoolean(TreeSet<Integer> tree) {
    	System.out.println("Enter The Number");
    	return tree.contains(new java.util.Scanner(System.in).nextInt());   
    }
//    Remove an Element from tree
    public static void removeElement(java.util.TreeSet<Integer> tree) {
    	System.out.println("Enter The Number");
    	int num = new java.util.Scanner(System.in).nextInt();
    	if(tree.contains(num)){
    		tree.remove(num);
    	}else {
    		System.out.println("The Number Does Not Exist");
    	}
    }
}
