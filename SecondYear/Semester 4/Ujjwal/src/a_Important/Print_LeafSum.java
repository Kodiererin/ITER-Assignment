package a_Important;

//	2022 - Previous Year Question.

public class Print_LeafSum {static class Node{
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
		Node Root = new Node(8);
		Root.left = new Node(3);
		Root.right = new Node(10);
		
		Root.left.left = new Node(1);
		Root.left.right = new Node(6);
		
		Root.right.right = new Node(14);
		
		Root.left.right.left = new Node(4);
		Root.left.right.right = new Node(7);
		
		Root.right.right.left = new Node(13);
		
		
		System.out.println("The Sum of Leaf Nodes is "+printLeafNodeSum(Root));
	}
//	Print the Sum of the Leaf Nodes
	public static int printLeafNodeSum(Node root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null) {
			return root.data;
		}else {
			return printLeafNodeSum(root.left)+printLeafNodeSum(root.right);
		}
	}
}
