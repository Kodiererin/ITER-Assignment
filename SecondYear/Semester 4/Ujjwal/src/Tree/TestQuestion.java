package Tree;

import java.util.ArrayList;

import Tree.BST_Traversal.Node;

public class TestQuestion {
	public static void main(String[] args) {
		Node Head = new Node(40);
		Head.Left = new Node(30);
		Head.Right = new Node(50);
		Head.Left.Left = new Node(10);
		Head.Left.Right = new Node(50);
		
		Head.Right.Left = new Node(40);
		Head.Right.Right = new Node(60);
		
		find(Head, 50);
	}
	
//	Public static find Data
//	Check the Code and Redo
	public static void find(Node Head , int data) {
		java.util.Queue<Node> queue = new java.util.LinkedList();
		java.util.Queue<Node> queue2 = new java.util.LinkedList();
		queue.add(Head);
		int height=1;
		while(!queue.isEmpty()) {
			Node getData = queue.poll();
			if(getData.Left!=null) {
				queue.add(getData.Left);
			}
			if(getData.Right!=null) {
				queue.add(getData.Right);
			}
			if(queue.size()<=1) {
				height++;
			}
			System.out.println(getData.data);
		}
		System.out.println(height);
		return;
	}
	
	public static void compute(Node Head) {
		java.util.ArrayList<java.util.ArrayList<Integer>> list = new ArrayList<>();
		java.util.Queue<Node> queue = new java.util.LinkedList<>();
		queue.add(Head);
		while(!queue.isEmpty()) {
			
		}
	}
}
