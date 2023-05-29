package Assignment_4;

import java.util.ArrayList;
import java.util.Arrays;

//	Q4. Write a program to remove duplicate from an integer list.
public class Question_4 {
//	List me I can Use any List Datastructure either ArrayList or Linkedlist
	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList<Integer> list = new ArrayList<>();
		int max = 100;
		int min = 0;
		for (int i = 0; i < 20 ; i++) {
		    list.add((int) (Math.random() * (max - min + 1) + min));
		}
		compute(list);
	}
	public static void compute(ArrayList<Integer> list) {
		
	}
}
