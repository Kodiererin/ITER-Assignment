package a_Important;

public class LinkedList_Insertion {
	public static void main(String[] args) {
		Node Head = new Node();
		Node one = new Node();
		Node two = new Node();
		Node three = new Node();
		
		Head.setData(10);
		Head.setNext(one);
		
		one.setData(20);
		one.setNext(two);
		
		two.setData(30);
		two.setNext(three);
		
		three.setData(40);
		three.setNext(null);
		
//		to Make a Loop from three to one
//		three.setNext(one);
		
		Node getData = insertDataLast(Head , 50);
		displayNode(getData);
		
		getData = insertDataFirst(Head , 0);
		displayNode(getData);
		
		getData = insertSortedOrder(Head, 12);
		displayNode(getData);
		
		getData =  reverseList(Head);
		displayNode(getData);
		
		
		System.out.println(detectLoop(Head));
		
		
		
	}
	public static void insertDataUsingArray(Node Head , int[] arr) {
		Node[] temp = new Node[arr.length];
		int i=0 ;
		for( ; i<arr.length-1 ; i++) {
			temp[i] = new Node();
			temp[i+1] = new Node();
			temp[i].setData(arr[i]);
			temp[i+1].setData(arr[i+1]);
			
			temp[i].setNext(temp[i+1]);
		}
		temp[arr.length-1].setNext(null);
		Node pointer = Head;
		while(pointer!=null) {
			pointer = pointer.getNext();
		}
		pointer.setNext(temp[0]);
	}
//	Insertion at Last
	public static Node insertDataLast(Node Head , int data) {
		Node temp = new Node();
		temp.setData(data);
		temp.setNext(null);
		if(Head.getNext()==null) {
			Head.setNext(temp);
		}
		else {
			Node P = Head;
			while(P.getNext()!=null) {
				P = P.getNext();
			}
			P.setNext(temp);
		}
		return Head;
	}
//	Insertion at Begining
	public static Node insertDataFirst(Node Head , int data) {
		Node temp = new Node();
		temp.setData(data);
		temp.setNext(null);
		if(Head.getNext()==null) {
			Head.setNext(temp);
		}
		else {
			temp.setNext(Head);
			Head = temp;
		}
		return Head;
	}
	
//	Method 2 Insertion using Recursion
	public static Node  insertDataRecursion(Node Head , int data) {
		if(Head.getNext()==null) {
			Node temp = new Node();
			temp.setNext(null);
			temp.setData(data);
			Head.setNext(temp);
			
			return Head;
		}
		else {
			return insertDataRecursion(Head.getNext(), data);
		}
	}
//	Insertion in the Sorted Order
	public static Node insertSortedOrder(Node Head , int data) {
//		Assuming  the LinkedList is Sorted
		Node Temp = new Node();
		Temp.setData(data);
		Temp.setNext(null);
		
//		If the Linked List is Empty
		if(Head==null) {
			return Temp;
		}else {
			if(data<Head.getData()) {
				return insertDataFirst(Head, data);
			}else if(data>Head.getNext().getData()) {
				return insertDataLast(Head, data);
			}
			else {
				Node tempHead = Head.getNext();
				Node prevTemp = Head;
				while(tempHead!=null && tempHead.getData()<data) {
					tempHead = tempHead.getNext();
					prevTemp = prevTemp.getNext();
				}
				if(tempHead.getNext()==null)
					return insertDataLast(tempHead, data);
				else {
					Temp.setNext(tempHead);
					prevTemp.setNext(Temp);
					return Head;				
				}
			}
		}
	}
//	Reversing the LinkedList Without Using Recursion
	public static Node reverseList(Node Head) {
		Node currentNode = Head;
		Node prevNode = null;
		Node nextNode = Head;
		while(nextNode.getNext()!=null) {
			nextNode = nextNode.getNext();
			currentNode.setNext(prevNode);
			prevNode = currentNode;
			currentNode = nextNode;
		}
		currentNode = nextNode;
		currentNode.setNext(prevNode);
		return currentNode;
	}
//	Reversing the LinkedList using Recursion
	
//	Detect the Loop in the LinkedList
	public static Boolean detectLoop(Node Head) {
		if(Head==null || Head.getNext()==null || Head.getNext().getNext()==null)
			return true;
		Node currNode = Head;
		Node nextNode = Head.getNext().getNext();
		while(nextNode!=null) {
			if(currNode==nextNode) {
				return true;
			}else {
				currNode = currNode.getNext();
				nextNode = nextNode.getNext().getNext();
			}
		}
		return false;
	}
//	Displaying the Node
	public static void displayNode(Node Head) {
		Node getData = Head;
		while(getData!=null) {
			System.out.print(getData.getData()+" - ");
			getData = getData.getNext();
		}
		System.out.println();
	}
}
