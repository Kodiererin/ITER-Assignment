package a_Important;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public static void main(String[] args) {
//		https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Binary_search_tree.svg/270px-Binary_search_tree.svg.png
		Node Root = new Node(8);
		Root.left = new Node(3);
		Root.right = new Node(10);
		
		Root.left.left = new Node(1);
		Root.left.right = new Node(6);
		
		Root.right.right = new Node(14);
		
		Root.left.right.left = new Node(4);
		Root.left.right.right = new Node(7);
		
		Root.right.right.left = new Node(13);
		
//		postOrder Traversal
//		postOrder(Root);
		
//		inOrder Traversal
//		inOrder(Root);
		
//		preOrder Traversal
//		preOrder(Root);
		
//		Level Order Traversal -> BFS
//		levelOrderTraversal(Root);
		
//		Deapth First Search -> DFS
//		deapthFirstSearch(Root);
		
//		Searching of Data
//		searching(Root, 14);
		
//		Find Max in BST
		System.out.println(findMax(Root));
		
	}
//	postOrder Traversal
	public static void postOrder(Node root) {
		if(root==null)
			return;
		else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
//	inOrder Traversal
	public static void inOrder(Node root) {
		if(root==null)
			return;
		else {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
//	PreFix Traversal
	public static void preOrder(Node root) {
		if(root==null)
			return;
		else {
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
//	Level Order Traversal
//	Level Order Traversal is also Called Breadth First Search.
	public static void levelOrderTraversal(Node root) {
		System.out.println("This is Level Order Traversal");
		if(root==null)
			System.out.println("The Tree is Empty");
		else {
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			while(!queue.isEmpty()) {
				Node data = queue.poll();
				System.out.print(data.data+" ");
				if(data.left!=null)
					queue.add(data.left);
				if(data.right!=null)
					queue.add(data.right);
			}
		}
	}
	
//	Deapth First Search
	public static void deapthFirstSearch(Node root) {
		if(root==null)
			return;
		else {
			System.out.println(root.data);
			deapthFirstSearch(root.left);
			deapthFirstSearch(root.right);
		}
	}
	
//	Searching of Data
	public static void searching(Node root , int data) {
		if(root==null)
			System.out.println("Data Not Found");
		else if(data == root.data)
			System.out.println("Data Found");
		else {
			if(data<root.right.data) {
				searching(root.left, data);
			}else {
				searching(root.right, data);
			}
		}
	}
	
	
//	Insertion in Binary Search Tree.
//	Write a Code to Insert the code of Insertion Function
//	Recursive Java Implementation
	public static Node insertData(Node Root, int x)
	{   // BigOh oh H extra space.
		if(Root==null) return new Node(x);
		if(Root.data>x) { Root.left = insertData(Root.left,x);}
		else if(Root.data<x) { Root.right = insertData(Root.right,x);}
		return Root;
	}
//	Iterative Insert
	public static Node iterativeInsert(Node root , int x)
	{  // BigOg(1) Extra Space.
		Node temp = new Node(x);
		Node parent = null;
		Node curr = root;
		while(curr!=null)
		{
			parent = curr;
			if(curr.data>x) curr = curr.left;
			else if(curr.data<x) curr = curr.right;
			else {return root;}
		}
		if(parent==null) return temp;
		if(parent.data>x) parent.left = temp;
		else parent.right = temp;
		return root;
	}
	
//	//	Find Min and Find Max in BST
	public static int findMax(Node root ) {
		Node curr = root;
		while(curr.right.right!=null) {
			curr = curr.right;
		}
		return curr.right.data;
	}
	public static int findMin(Node root ) {
		Node curr = root;
		while(curr.left.left!=null) {
			curr = curr.left;
		}
		return curr.left.data;
	}
}
