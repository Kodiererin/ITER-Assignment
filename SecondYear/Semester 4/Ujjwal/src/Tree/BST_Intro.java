package Tree;

public class BST_Intro {
		static class Node {
			int data;
			Node left;
			Node right;

			Node(int data) {
				this.left = this.right = null;
				this.data = data;
			}
		}

//		WAP to Create a BST and Display/Traverse the Tree.
		public static void insertion(Node Head, int data) {
			if (Head == null) {
				Head = new Node(data);
			} else {
				if (Head.left == null && data < Head.data) {
					Head.left = new Node(data);
				} else if (Head.right == null && data > Head.data) {
					Head.right = new Node(data);
				} else {
					if (data < Head.data) {
						insertion(Head.left, data);
					} else {
						insertion(Head.right, data);
					}
				}
			}
		}

//		----------------------- SEARCHING------------------------------------
		public static void Searching(Node Head , int data) {
			if(Head==null) {
				System.out.println("Data Not Found");
			}else if(data<Head.data) {
				Searching(Head.left, data);
			}else if(data>Head.data){
				Searching(Head.right, data);
			}else {
				System.out.println("Element Found");
			}
		}
		
//		----------------------- SEARCHING------------------------------------	
		public static void displsyTree(Node Head) {
			if (Head == null) {
				return;
			}
			System.out.println(Head.data);
			displsyTree(Head.left);
			displsyTree(Head.right);
		}
		
//		----------------------- DELETING ---------------------------------------
		public static void deletion(Node Head , int data) {
			if(Head.data==data) {
				while(Head.left.left!=null) {
					swapData(Head, Head.left);
					Head = Head.left;
				}
				swapData(Head, Head.left);
				Head.left=null;
				System.out.println("Deletion Completed");
			}else {
				if(data<Head.data) {
					deletion(Head.left, data);
				}else {
					deletion(Head.right, data);
				}
			}
		}	
		public static void swapData(Node A ,  Node B) {
			Node temp = A;
			A.data = B.data;
			B.data = temp.data;
		}

		public static void reArrange(Node Head) {
			if(Head.data<Head.left.data) {
				swapData(Head, Head.left);
			}else if(Head.data>Head.right.data) {
				swapData(Head, Head.right);
			}else {
				reArrange(Head.left);
				reArrange(Head.left);
			}
		}
		
		
		public static void main(String[] args) {
			Node Head = new Node(10);
			insertion(Head, 20);
			insertion(Head, 9);
			insertion(Head, 21);
			insertion(Head, 87);
			insertion(Head, 12);
			insertion(Head, 13);
			insertion(Head, 5);
			insertion(Head, 6);

			displsyTree(Head);
			System.out.println("---------------------------------------------");
			
			System.out.println("Searchig Request ");
				Searching(Head, 999);
				
			System.out.println("---------------------------------------------");
//			Chhecking If the Deletion i sPossible or Not
			deletion(Head, 12);
//			reArrange(Head);
//			displsyTree(Head);
			
			
			
			
		}

	}
