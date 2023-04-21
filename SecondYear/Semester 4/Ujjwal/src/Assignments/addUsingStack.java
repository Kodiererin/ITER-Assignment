package testUjjwal;

import java.util.Scanner;

public class addUsingStack {
	public static void main(String[] args) {
		expression();
	}
	public static void expression() {
		java.util.Stack<Integer> myStack= new java.util.Stack<>();	
		String x = "25+47+-";
		int myIndex = 0;
		
		for(int i=0 ; i<x.length() ; i++) {
			if(x.charAt(i)=='+' || x.charAt(i)=='-') {
				myIndex = i;
				break;
			}else
			myStack.push(Integer.valueOf(String.valueOf(x.charAt(i))));
		}
		int mySum;
		switch(x.charAt(myIndex)) {
			case '+' : {
					mySum = myStack.pop()+myStack.pop();
					myStack.push(mySum);
					break;
				}
			case '-' : {
				mySum = myStack.pop()+myStack.pop();
				myStack.push(mySum);
				break;
			}
		}
	}
	
	
	public static void postFixSum(String s) {
		java.util.Stack<String> obj = new java.util.
	}
}
