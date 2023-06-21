package a_Important;

public class Heap_DataStructure {
	static class Heap{
		int arr[];
		int size;
		int capacity;
		Heap(int capacity){
			this.arr = new int[capacity];
			this.capacity = capacity;
			this.size = 0;
		}
//		It has Been Assumed that the Heap is an Array
		public int getLeft(int i) {
			return (2*i)+1;
		}
		public int getRight(int i){
			return (2*i)+2;
		}
		public int getParent(int i) {
			return (int)Math.floor((i-1)/2);
		}
		
		public void insertHeap(int data	) {
			if(this.size==this.capacity)
				System.out.println("Overflow");
			else {
				this.size++;
				this.arr[this.size-1] = data;
				for(int i=this.size-1 ; i!=0 && getParent(i)>this.arr[i] ;) {
//					Swap until the Condition is Dissatisfied
					swap(arr,i, getParent(i));
					i = getParent(i);
				}
			}
		}
		
//		min Heapify function 
		public void minHeapify(int i) {
			int leftNode = getLeft(i);
			int rightNode = getRight(i);
			int smallest = i;
			if(leftNode<this.size && arr[leftNode]<arr[i]) {
				smallest = leftNode;
			}
			if(rightNode<this.size && arr[rightNode]<arr[leftNode]) {
				smallest = rightNode;
			}
			if(smallest!=i) {
				swap(arr,smallest,i);
				minHeapify(smallest);
			}
		}
//		It has a Time Complexity is : O(Height) h-> Log(n) -> O(log(n))    and Auxillary Space : O(Log(n))
		
//		getMinimum Function
		public int extractMinimum() {
//			Time Complexity is O(n)
//			but We have to remove the Minimum from the queue
			
			if(this.size==1)
				return Integer.MAX_VALUE;
			if(this.size==1)
			{
				this.size--;
				return arr[0];
			}
			
//			From here this is the Main condition
			int minimum = this.arr[0];
			swap(arr,0,this.size);
			this.size = this.size-1;
			minHeapify(0);				// O(Log(n)) 		
			return minimum;					
//			Overall Time Complexity is O(C + Log(n))
		}
//		Decrease Key
		public void decreaseKey(int[] arr , int index , int dataToBeSwapped) {
			this.arr[index] = dataToBeSwapped;
			minHeapify(index);
		}
		
//		Creating a Swap Function
		public void swap(int arr[], int i , int j) {
			int temp = this.arr[i];
			this.arr[i] = this.arr[j];
			this.arr[j] = temp;
		}
//		Display the Heap
		public void displayHeap() {
			for(int i=0 ; i<this.size ; i++	) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
	
	
	
}
