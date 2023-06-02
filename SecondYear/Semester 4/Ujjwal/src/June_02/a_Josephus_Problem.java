package June_02;
//	JOSEPHUS PROBLEM
//	There are N people standing in a queue waiting to be executed.
//	Counting Begins at the front off the queue. 
//	In each step K Number of people are remove and again add one by one from the queue.
//	Then the next person is executed.  The execution proceeds around the circle until only the last person remains,
//	who will be freedom. 

//	Circular Queue - 
//	Except one all will be executed
//	Design a Program such that one person at a -Particular place- is Not Executed.
//	let n = 5 and k = 3
//	k+1 will be executed.
//	Counting will update to k+2
//	Similarly and So on. The data which is left will be given the freedom.

//	K will be contantly updated and will be taken from the user.
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;;
	}
}
public class a_Josephus_Problem {
	static Node Head = null;
	static Node Rear = null;
//	Enter the Data from the user in the queue.
	static void getData() {
		System.out.println("Enter The Number of People ");
		int people = new java.util.Scanner(System.in).nextInt();
		int i=0;
		while(i<people) {
			Node temp = new Node(i);
			Node c = null;
			if(Head==null) {
				Head = temp;
				Rear = Head;
			}else {
				c = Head;
				c.next = new Node(i);
				c = c.next;
				Rear = c;
				Rear.next = Head;
			}
			i++;
		}
		System.out.println("The Number of People is "+i);
		return;
	}
	static void eleminationBegins() {
		if(Head==null) {
			System.out.println("The Queue is Empty");
		}
		while(Head!=Rear) {
			System.out.println("Enter The K that must be skipped");
			int k = new java.util.Scanner(System.in).nextInt();
			Node c  = Head;
			int i=0;
			while(i!=k) {
				c = c.next;
				i++;
			}
			Node temp = c;
//			display();
			temp.next = temp.next.next;
			Head = temp.next;
			Rear = c;
		}
		if(Head==Rear) {
			System.out.println("The Person Eleminated is "+Head.data);
		}
	}
//	Testing Data
	public static void display() {
		Node c = Head;
		while(c!=Rear) {
			System.out.print(c.data+" ");
			c = c.next;
		}
	}
	
	
//	Using the Previous Circular Queue CLass to Implement the data
	public static void letsBegin() {
		b_CircularQueue.Head = null;
		b_CircularQueue.Rear = null;
		System.out.println("Enter The Number Of Persons ");
		int n = new java.util.Scanner(System.in).nextInt();
		int i=0;
		
		b_CircularQueue object = new b_CircularQueue();
		while(i<n) {
			object.enqueue(i);
			i++;
		}
		
		while(b_CircularQueue.Head!=b_CircularQueue.Rear) {
			System.out.println("Enter The K That You Want to Delete");
			int k = new java.util.Scanner(System.in).nextInt();
			i = 0;
			June_02.b_CircularQueue.Node c = b_CircularQueue.Head;
			while(i<k) {
				c.setNext(c.getNext());
				i++;
			}
			object.deQueue();
		}
		System.out.println(b_CircularQueue.Head.getData()+" Is Eleminated.");
	}
	public static void main(String[] args) {

//		getData();
//		eleminationBegins();
//		eleminationBegins(Head, Rear);
		
//		By Using the Previous Circular Queue
		letsBegin();
	}
}
