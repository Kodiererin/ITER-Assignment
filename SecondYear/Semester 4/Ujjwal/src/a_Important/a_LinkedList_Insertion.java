package May_13;

public class a_LinkedList_Insertion {
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
		
		Node getData = insertDataLast(Head , 50);
		while(getData!=null) {
//			System.out.println(getData.getData());
			getData = getData.getNext();
		}
		
		getData = insertDataFirst(Head , 0);
		while(getData!=null) {
			System.out.println(getData.getData());
			getData = getData.getNext();
		}
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
}
