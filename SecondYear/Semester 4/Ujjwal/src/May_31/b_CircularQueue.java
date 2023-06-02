package May_31;

public class b_CircularQueue {
	static Node Head = null;
	static Node Rear = null;

	static class Node {
		private Integer data;
		private Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

		public int getData() {
			return this.data;
		}

		public Node getNext() {
			return this.next;
		}

		public void setNext(Node data) {
			this.next = data;
		}
	}

//	Insertion Of the Queue
	public static void enqueue(int data) {
		if (Head == null && Rear == null) {
			Head = new Node(data);
			Rear = Head;
		} else {
			Node temp = new Node(data);
			Rear.setNext(temp);
			temp.setNext(Head);
			Head = temp;
		}
	}

//	Deletion of Data from Queue
	public static void deQueue() {
		System.out.println("0 - For Delete from First");
		System.out.println("1 - For Delete from Last");
		if (Head == null && Rear == null)
			System.out.println("Underflow");
		else {
			if (Head == Rear) {
				Head = null;
				Rear = null;
			} else {
				Node temp = Head;
				temp = temp.getNext();
				Rear.setNext(temp);
				Head = temp;
			}
		}
	}

//	Display the Data
	public static void display() {
		if (Head == null && Rear == null) {
			System.out.println("The List is Empty");
		} else {
			Node c = Head;
			do {
				System.out.println(c.getData());
				c = c.getNext();
			} while (c != Rear);
			System.out.println(Rear.getData());
		}
	}
//	Rotate the Circular Queue
	public static void rotateQueue() {
		if(Head==null && Rear==null)
			System.out.println("Rotation Not Possible");
		else {
//			Node temp = Head;
//				temp.setNext(temp.getNext());
//			Node temp2 = Rear;
//				temp2.setNext(temp2.getNext());
//			Head = temp;
//			Rear = temp2;
//			Head.setNext(Rear);
			Head = Head.getNext();
			Rear = Rear.getNext();
		}
	}
	
	public static void main(String[] args) {
		enqueue(10);
		enqueue(31);
		enqueue(32);
		enqueue(33);
		rotateQueue();
//		enqueue(49);
		display();
	}
}
