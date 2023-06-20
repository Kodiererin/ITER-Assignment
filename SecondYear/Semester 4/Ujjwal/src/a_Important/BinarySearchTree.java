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
		searching(Root, 14);
		
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
}
