package May_31;
//	Queue -> First In First Out Data Structure
//	This is Linear Queue
//	WAP to create a Queue Using Linked List
public class a_Queue {
	static Node Head = null;
	static Node Rear = null;
	static class Node{
		private Integer data;
		private Node next;
		Node(int data){
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
//	Enqueue the data
//		Insertion from First and Last
//	1 - Insertion From Last
//	0 - Insertion from first
	public static void enqueue( int data , int i) {
		Node temp = new Node(data);
		if(i==1) {
//			Insertion from Last
			if(Head==null)
			{
				Head = temp;
				Rear = Head;
			}
			else {
				Node c = Head;
				while(c.getNext()!=null) {
					c.setNext(c.getNext());
				}
				c.setNext(temp);
				Rear = c.getNext();
			}
		}
		else {
			Head = new Node(data);
			Rear = new Node(data);
			Head.setNext(Rear);
		}
	}
//	Dequeue the data 
	public static int deQueue(int i) {
		if(Head==null) {
			System.out.println("Under Flow");
			return -1;
		}
		Node c = Head;
		if(i==0) {
			Head.setNext(Head.getNext());
			return c.data;
		}else {
			while(c.getNext()!=null) {
				c.setNext(c.getNext());
			}
			Node send = c.getNext();
			c.setNext(null);
			Rear = c;
			return send.data;
		}
	}
//	Display the Data
	public static void display() {
		if(Head==null)
			return;
		else {
			Node copy = Head;
			while(copy!=null) {
				System.out.println(copy.getData());
				copy = copy.getNext();
			}
		}
	}

//	Making an isEmpty() function
	public static boolean isEmpty(Node Head) {
		return Head.getData()==(Integer)null || Head.getNext()==null ? true : false;
	}

	
	public static void main(String[] args) {

		while(true) {
			System.out.println("----------------------------------------");
			System.out.println("Welcome to the Queue");
			System.out.println("1. To Enqueue");
			System.out.println("2. To Dequeue");
			System.out.println("3. To Display");
			System.out.println("4. Checking If the List is Empty");
			System.out.println("5. Exit");
			System.out.println("Enter Your Choice ");
			int choice = new java.util.Scanner(System.in).nextInt();

			switch(choice) {
			case 1:{
				System.out.println("Enqueue");
				System.out.println("0 - Insert from First ");
				System.out.println("1 - Insert from Last");
				System.out.println("Enter The Data and the choice that You want to insert");
				enqueue(new java.util.Scanner(System.in).nextInt(), new java.util.Scanner(System.in).nextInt());
				break;
			}
			case 2 : {
				System.out.println("Qeueue");
				System.out.println("Qequeue");
				System.out.println("0 - Delete From First");
				System.out.println("1 - Delete from Last");
				System.out.println("Enter the Choice that You want to delete");
				deQueue(new java.util.Scanner(System.in).nextInt());
				break;
			}
			case 3 : {
				System.out.println("Display The Data");
				display();
				break;
			}
			case 4 : {
				System.out.println("Is the List Empty "+isEmpty(Head));
				break;
			}
			case 5 : {
				System.out.println("Exit the Data");
				System.exit(0);
			}
			default : {
				System.out.println("Enter The Correct Data");
				break;
			}
			}
		}
	}
}
