package Assignments;
//	To Be done Later.
class Process{
	String p;
	int burstTime;
	int arrival;
	Process(String p , int burstTime , int arrival){
		this.arrival = arrival;
		this.burstTime = burstTime;
	}
	public String toString() {
		return this.p+" "+this.arrival+" "+this.burstTime;
	}
}
public class April_1_SRTN {
	public static void main(String[] args) {
		SRTN();
	}
	public static void SRTN() {
		Process[] obj = new Process[5];
		obj[0] = new Process("p1", 5, 0);
		obj[1] = new Process("p2", 7, 0);
		obj[2] = new Process("p3", 2, 0);
		obj[3] = new Process("p4", 3, 0);
		
		for(int i=0 ; i<obj.length ; i++) {
			System.out.println(obj[i]);
		}
		
		java.util.PriorityQueue<Process> queue = new java.util.PriorityQueue<>();
		
		System.out.println();
		for(int i=0 ; i<obj.length ; i++) {
			queue.add(obj[i]);
		}
		System.out.println(queue.size());
		while(queue.isEmpty()) {
			System.out.println(queue.peek());
			System.out.println(queue.poll());
		}
	}
}
