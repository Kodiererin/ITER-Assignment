package Tree;

public class DeleteMyNode {
public static void main(String[] args) {
	Creationn();
}
	public static void Creationn() {
		Node Head = new Node(40);
		Head.Left = new Node(30);
		Head.Right = new Node(50);
		Head.Left.Left = new Node(10);
		Head.Left.Right = new Node(50);

		Head.Right.Left = new Node(40);
		Head.Right.Right = new Node(60);
		
		deletiioNode(Head, 50);
		preOrderTraversal(Head);
	}

//	Deletion of the Node
	public static void deleteNode(Node Head, int data) {
		if (Head == null) {
			System.out.println("The Tree is Empty.");
		} else {
			Node pointer = Head;
			Node PointerHead = Head;
			while ((PointerHead.Left==pointer || PointerHead.Right==pointer) &&  pointer.data != data) {
				int TRACK=0;
				if (data < pointer.data) {
					TRACK = pointer.Left.data;
					pointer = pointer.Left;
				} else {
					TRACK = pointer.Right.data;
					pointer = pointer.Right;
				}
				PointerHead = data==pointer.Left.data?PointerHead.Left:PointerHead.Right;
			}
			
		}
//		Will be  Inititated Later.
	}
	
//	Deletion
	public static void deletiioNode(Node Head , int data) {
		if(Head.data==data) {
			Heapify(Head , data);
			while(Head.Right!=null) {
				Head = Head.Right;
			}
			Head.Right = null;
		}else {
			deleteNode(Head.Left, data);
			deleteNode(Head.Right, data);
		}
	}
	
	public static void Heapify(Node Head , int data) {
		if(Head!=null) {
			swap(Head, Head.Right);
			Heapify(Head.Right, data);
		}
	}
	public static void swap(Node a , Node b) {
		Node temp = a;
		a = b;
		b = temp;
	}
	
	
	
	
//	Test Display
	PreOrder Traversal
	public static void preOrderTraversal(Node Head) {
		if(Head==null)
			return;
		else {
			System.out.println(Head.data);
			preOrderTraversal(Head.Left);
			preOrderTraversal(Head.Right);
		}
	}

}
