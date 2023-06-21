package a_Important;



public class b_LinkedList_Deletion {
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
		Node getData = deleteAny(Head, 20);
		displayData(getData);
		
	}
//	Display The Data
	public static void displayData(Node getData) {
		while(getData!=null) {
			System.out.println(getData.getData());
			getData = getData.getNext();
		}
	}
	
	public static Node deleteFirst(Node Head ) {
		Node Pointer = Head;
		Pointer = Pointer.getNext();
		return Pointer;
	}
	public static Node deleteLast(Node Head){
		Node pointer = Head;
		while(pointer.getNext().getNext()!=null) {
			pointer = pointer.getNext();
		}
		pointer.setNext(null);
		return Head;
	}
	public static Node deleteAny(Node Head , int data) {
		if(Head.getNext().getData()==data) {
			Head.setNext(Head.getNext().getNext());
			return Head;
		}else {
			return deleteAny(Head.getNext() , data);
		}
	}
}
