package a_Important;

public class Heap_DataStructure {
	
	static class Heap {
		int arr[];
		int size;
		int capacity;

		Heap(int capacity) {
			this.arr = new int[capacity];
			this.capacity = capacity;
			this.size = 0;
		}

//		It has Been Assumed that the Heap is an Array
		public int getLeft(int i) {
			return (2 * i) + 1;
		}

		public int getRight(int i) {
			return (2 * i) + 2;
		}

		public int getParent(int i) {
			return (int) Math.floor((i - 1) / 2);
		}

		public void insertHeap(int data) {
			if (this.size == this.capacity)
				System.out.println("Overflow");
			else {
				this.size++;
				this.arr[this.size - 1] = data;
				for (int i = this.size - 1; i != 0 && this.arr[getParent(i)]> this.arr[i];) {
//					Swap until the Condition is Dissatisfied
					swap(arr, i, getParent(i));
					i = getParent(i);
				}
			}
			minHeapify(0);
		}

//		min Heapify function 
		public void minHeapify(int i) {
			int leftNode = getLeft(i);
			int rightNode = getRight(i);
			int smallest = i;
			if (leftNode < this.size && arr[leftNode] < arr[i]) {
				smallest = leftNode;
			}
			if (rightNode < this.size && arr[rightNode] < arr[leftNode]) {
				smallest = rightNode;
			}
			if (smallest != i) {
				swap(arr, smallest, i);
				minHeapify(smallest);
			}
		}
//		It has a Time Complexity is : O(Height) h-> Log(n) -> O(log(n))    and Auxillary Space : O(Log(n))

//		getMinimum Function
		public int extractMinimum() {
//			Time Complexity is O(n)
//			but We have to remove the Minimum from the queue

			if (this.size == 1)
				return Integer.MAX_VALUE;
			if (this.size == 1) {
				this.size--;
				return arr[0];
			}

//			From here this is the Main condition
			int minimum = this.arr[0];
			swap(arr, 0, this.size);
			this.size = this.size - 1;
			minHeapify(0); // O(Log(n))
			return minimum;
//			Overall Time Complexity is O(C + Log(n))
		}

//		Decrease Key
		public void decreaseKey(int[] arr, int index, int dataToBeSwapped) {
			this.arr[index] = dataToBeSwapped;
			minHeapify(index);
//			while(index!=0 && arr[getParent(index)]>arr[index]) {
//				swap(arr,index,getParent(index));/
//				index = getParent(index);
//			}
		}

//		Delete The Element from the Heap
		public int deleteElement(int data) {
			int index = 0;
			for (int i = 0; i < this.arr.length; i++) {
				if (data == arr[i])
				{
					index = i;
					break;
				}
			}
			swap(arr, index, this.size);
			this.size--;
			minHeapify(index);
			return this.arr[index];
		}

//		Build Heapify 
		public void buildHeap() {
			for (int i = ((this.size - 1) - 1) / 2; i >= 0; i--) {
//				minHeapify(i);				// for MinHeap 
				maxHeapify(i); // for MaxHeap
			}
		}

		public void heapSort() {
//			First Build the Heap
			buildHeap();
			for (int i = (this.size - 1) - 1; i > 0; i--) {
				maxHeapify(i);
			}
		}

//		Code for Build a Max Heap
		public void maxHeapify(int i) {
			int largest = i;
			int leftNode = getLeft(i);
			int rightNode = getLeft(i);

			if (leftNode < this.size && arr[leftNode] > arr[i]) {
				largest = leftNode;
			}
			if (rightNode < this.size && arr[rightNode] > arr[leftNode]) {
				largest = rightNode;
			}
			if (largest != i) {
				swap(arr, largest, i);
				maxHeapify(largest);
			}
		}

//		Creating a Swap Function
		public void swap(int arr[], int i, int j) {
			int temp = this.arr[i];
			this.arr[i] = this.arr[j];
			this.arr[j] = temp;
		}

//		Display the Heap
		public void displayHeap() {
			for (int i = 0; i < this.size; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}

	public static void main(String[] args) {
//		Hi This is Ujjwal.
//		Lets start the Heap
		int size = 10;
		Heap myHeap = new Heap(size);
		myHeap.insertHeap(40);
		myHeap.insertHeap(50);
		myHeap.insertHeap(3);		
		myHeap.insertHeap(20);
		myHeap.insertHeap(30);
		
//		Heapsort Operation
		myHeap.heapSort();
		
		
		myHeap.displayHeap();
	}

}
