package Assignments_2A;

//	Write a java program to evaluate a postfix expression using Stack.

public class Question_4 {
	public static void main(String[] args) {
		solvePostfix("231*+9-");
	}
	public static void solvePostfix(String x) {
		java.util.Stack<Integer> stack = new java.util.Stack();
		int i=0;
		while(i<x.length()) {
			char c = x.charAt(i);
			if(c>=48 && c<=57) {
				int number = c-48;
				stack.push(number);
			}
			else {
				int a = stack.pop();
				int b = stack.pop();
				switch(c)
				{
					case '+':
						stack.push(b+a);
						break;
					case '-':
						stack.push(b-a);
						break;
					case '/':
						stack.push(b/a);
						break;
					case '*':
						stack.push(b*a);
						break;
					case '%':
						stack.push(b%a);
						break;
				}
			}
			displayStack(stack);
			i++;
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	public static void displayStack(java.util.Stack<Integer> stack) {
		while(stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
