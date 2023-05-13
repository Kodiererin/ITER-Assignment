package May_10;

//	Write a Program to create two NodeList for single linked list. Put the address of 2nd NodeList in the next of 1st NodeList and display the NodeList.

class NodeList{
	private int data;
	NodeList next;
	NodeList(int data){
		this.data = data;
		this.next = null;
	}
	public int getData() {
		return this.data;
	}
	public String toString() {
		return this.getData()+"";
	}
}

public class c__TwoNodeLists {
	public static void main(String[] args) {
		NodeList Head = new NodeList(10);
		Head.next = new NodeList(20);
		Head.next.next = new NodeList(30);
		Head.next.next.next = new NodeList(40);
		Head.next.next.next.next = new NodeList(50);
		display(Head);
		
		NodeList Head2 = new NodeList(0);
		int i=0;
		NodeList p = Head2;
		while(i<5) {
//			p.next = new NodeList((int)Math.random()*101 );
			p.next = new NodeList(new java.util.Scanner(System.in).nextInt());
			p = p.next;
			i++;
		}
		display(Head2);
		
	}
	public static void display(NodeList Head) {
		if(Head!=null) {
			System.out.println(Head);
			display(Head.next);
		}
	}
}



