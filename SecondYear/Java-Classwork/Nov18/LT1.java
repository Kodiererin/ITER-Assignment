package Nov18;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class LT1 
{public static Node merge(Node h1 , Node h2)
{
	Node myHead=null;
	Node myPointer=null;
	if(h1==null)
		return h2;
	else if(h2==null)
		return h1;
	else
	{
		if(h1.data<=h2.data)
		{
			myHead = h1;
			myPointer = h1;
			h1 = h1.next;
//			System.out.println(h1.data);
		}
		else
		{
			myHead = h2;
			myPointer = h2;
			h2 = h2.next;
//			System.out.println(h2.data);
		}
//		1 4 7
//		2 3 5
		while(h1.next!=null && h2.next!=null)
		{
//			Write your code here
			if(h1.data<h2.data && h2.data<h1.next.data)
			{
				myPointer.next = h1;
			}
			else if(h2.data<h1.data && h1.data<h2.data)
			{
				myPointer.next = h2;
			}
			else if(h1.data<h2.data && h2.data>h1.next.data)
			{
				myPointer.next = h1.next;
			}
			else
			{
				myPointer.next = h2.next;
			}
		}
		if(h1==null)
			myPointer.next = h2;
		else
			myPointer.next = h1;
	}
	return myHead;
}
	public static void main(String[] args) 
	{
		Node head = new Node(1);
		head.next = new Node(4);
		head.next.next = new Node(5);
		
		Node head2 = new Node(9);
		head2.next = new Node(11);
		head2.next.next = new Node(17);
		
		Node myHeadClass = merge(head,head2);
		while(myHeadClass!=null)
		{
			System.out.println(myHeadClass.data);
			myHeadClass = myHeadClass.next;
		}
	}
}
