package Tree;

import Tree.BST_Traversal.Node;

public class BST_Deletion {
	public static void Creationn() {
		Node Head = new Node(40);
		Head.Left = new Node(30);
		Head.Right = new Node(50);
		Head.Left.Left = new Node(10);
		Head.Left.Right = new Node(50);

		Head.Right.Left = new Node(40);
		Head.Right.Right = new Node(60);
	}

//	Deletion of the Node
	public static void deleteNode(Node Head, int data) {
		if (Head == null) {
			System.out.println("The Tree is Empty.");
		} else {
			Node pointer = Head;
			Node PointerHead = Head;
			while (pointer.data != data) {
				if (data < pointer.data) {
					pointer = pointer.Left;
				} else if (data > pointer.data) {
					pointer = pointer.Right;
				} else {
					z
				}
			}
		}
	}
}
