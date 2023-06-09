package Tree;

import March_24.maxTominFORM;
import Tree.BST_Intro.Node;

public class BST_Traversal {
	static class Node {
		int data;
		Node Left;
		Node Right;
		Node(int data){
			this.Left = this.Right = null;
			this.data = data;
		}
	}
	
	static Node Head = null;
	
//	Creating a Tree
	public static void CreateTree() {
		Node Head = new Node(40);
		Head.Left = new Node(30);
		Head.Right = new Node(50);
		Head.Left.Left = new Node(10);
		Head.Left.Right = new Node(50);
		
		Head.Right.Left = new Node(40);
		Head.Right.Right = new Node(60);
		inOrderTraversal(Head);
		System.out.println("==================================================");
		postOrderTraversal(Head);
		System.out.println("==================================================");
		preOrderTraversal(Head);
		System.out.println("==================================================");
		System.out.println("Finding The Maximum");
		System.out.println("Maximum value");
		System.out.println(maximum(Head));
		System.out.println(minimum(Head));
		
	}
	public static void insertion(Node Head, int data) {
		if (Head == null) {
			Head = new Node(data);
		} else {
			if (Head.Left == null && data < Head.data) {
				Head.Left = new Node(data);
			} else if (Head.Right == null && data > Head.data) {
				Head.Right = new Node(data);
			} else {
				if (data < Head.data) {
					insertion(Head.Left, data);
				} else {
					insertion(Head.Right, data);
				}
			}
		}
	}
	
	
//	PreOrder Traversal
	public static void preOrderTraversal(Node Head) {
		if(Head==null)
			return;
		else {
			System.out.println(Head.data);
			preOrderTraversal(Head.Left);
			preOrderTraversal(Head.Right);
		}
	}
//	PostOrder Traversal
	public static void postOrderTraversal(Node Head) {
		if(Head==null)
			return;
		else {
			System.out.println(Head.data);
			preOrderTraversal(Head.Right);
			preOrderTraversal(Head.Left);
		}
	}
//	InOrder Traversal
	public static void inOrderTraversal(Node Head) {
		if(Head==null)
			return;
		else {
			System.out.println(Head.data);
			preOrderTraversal(Head.Left);
			preOrderTraversal(Head.Right);
		}
	}
	
	
//	Maximum From BST
	public static int maximum(Node Head ) {
		if(Head!=null) {
			return Math.max(maximum(Head.Right)	, Head.data);
		}
		return Integer.MIN_VALUE;
	}
//	Maximum From BST
	public static int minimum(Node Head ) {
		if(Head==null) {
			return Integer.MAX_VALUE;
		}else {
			return (int)Math.min(Head.data, minimum(Head.Left));
		}
	}
	
	public static void main(String[] args) {
		CreateTree();
	}
}
