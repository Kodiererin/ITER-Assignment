package May_100;

import Tree.Node;

public class DeletionNodeTree {

	static class Node {
		int data;
		Node Left;
		Node Right;

		Node(int data) {
			this.Left = this.Right = null;
			this.data = data;
		}

		public static void main(String[] args) {
			Creationn();
		}

		static Node Head;

		public static void Creationn() {
			
//			The Tree Has been formed from this link
//			https://www.gatevidyalay.com/binary-search-trees-data-structures/
			
			Node Head = new Node(25);
			Head.Left = new Node(20);
			Head.Right = new Node(36);
			Head.Left.Left = new Node(10);
			Head.Left.Right = new Node(22);
			Head.Left.Left.Left = new Node(5);
			Head.Left.Left.Right = new Node(12);

			Head.Right.Left = new Node(30);
			Head.Right.Left.Left = new Node(28);
			
			
			Head.Right.Right = new Node(40);
			Head.Right.Right.Left = new Node(38);
			Head.Right.Right.Right= new Node(48);

//			preOrderTraversal(Head);
//				System.out.println();
//			getData(Head , 60);
//			preOrderTraversal(Head);
//			System.out.println();\

			preOrderTraversal(Head);
			System.out.println();
			DeletNode(Head, Head, 25);
			System.out.println();
			preOrderTraversal(Head);
		}

		

//		Test Display
//		PreOrder Traversal
		public static void preOrderTraversal(Node Head) {
			if (Head == null)
				return;
			else {
				System.out.print(Head.data + " ");
				preOrderTraversal(Head.Left);
				preOrderTraversal(Head.Right);
			}
		}

	}

	public static void  DeletNode(Node Head, Node Parent, int data) {
//		Using A Level Order Traversal
		Node temp = Head;
		Node prev = Head;
		while(temp!=null) {
			if(data>temp.data) {
				prev = temp;
				temp = temp.Right;
			}else if(data<temp.data) {
				prev = temp;
				temp = temp.Left;
			}else {
				break;
			}
		}
		System.out.println("Parent = "+prev.data);
		System.out.println("Child = "+temp.data);
		if(prev.data>temp.data && temp.Left!=null) {
			Node c = temp;
			while(c.Left.Left!=null) {
				c = c.Left;
			}
			Node myTemp = c;
			c.data = c.Left.data;
			c.Left.data = myTemp.data;
			c.Left = null;
		}
		else if(prev.data<temp.data && temp.Right!=null) {
			Node c = temp;
			while(c.Right.Right!=null) {
				c = c.Right;
			}
			Node myTemp = c;
			c.data = c.Right.data;
			c.Right.data = myTemp.data;
			c.Right = null;
		}
		else if(prev==temp) {
//			Proceed and  Fix This code.
			Node c = temp.Left;
			Node myTemp = c;
			c.data = prev.data;
			prev.data = c.data;
			
			Node pointer = prev.left;
			while(pointer.Left.Left!=null) {
				Node mytemp = pointer.Left;
				pointer.Left = 
			}
		}
		else {
//			Proceed From Here.
			System.out.println("Proceding With the Data");
			if(prev.Left==temp) {
				prev.Left = null;
			}else {
				prev.Right = null;
			}
		}
	}
}
