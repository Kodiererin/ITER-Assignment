package testUjjwal;

import java.util.ArrayList;
import java.util.Collections;

class Process implements Comparable{
	String appProcess;
	int BurstTyme;
	int ArrivalTime;

	Process(String appProcess , int BurstTyme , int ArrivalTime){
		this.ArrivalTime = ArrivalTime;
		this.BurstTyme = BurstTyme;
		this.appProcess  = appProcess;
	}
	public int equalsTo(Process p1 , Process p2) {
		if(p1.ArrivalTime==p2.ArrivalTime)
			return 0;
		else if(p1.ArrivalTime>p2.ArrivalTime)
			return 1;
		else
			return -1;
	}
	public String toString() {
		return this.appProcess+" "+this.BurstTyme+" "+this.ArrivalTime;
	}
	@Override
	public int compareTo(Object o) {
		Process p = (Process) o;
		if(this.ArrivalTime>p.ArrivalTime) return 1;	
		else if(this.ArrivalTime<p.ArrivalTime) return -1;
		else return 0;
	}
}


public class Question3 {
	public static <T> void main(String[] args) {
//		Implement the Priority Queue.
		java.util.ArrayList<Process> myProcess = new java.util.ArrayList<>();
		Process p1 = new Process("P1",5,0);
		Process p2 = new Process("P2",7,3);
		Process p3 = new Process("P3",2,2);
		Process p4 = new Process("P4",3,1);
		
		myProcess.add(p1);
		myProcess.add(p2);
		myProcess.add(p3);
		myProcess.add(p4);
		
		Collections.sort(myProcess);
		secondStep(myProcess);
		
//		Second Step
	}
	public static void secondStep(ArrayList<Process> myProcess) {
		java.util.PriorityQueue<Process> pQueue = new java.util.PriorityQueue<>();
		java.util.ArrayList<Process> processOccured= new java.util.ArrayList<>();
		
		for(int i=0 ; i<myProcess.size() ; i++) {
			if(pQueue.size()==0) {
				pQueue.add(myProcess.get(i));
			}else {
				Process p = pQueue.poll();
				p = new Process(p.appProcess, p.BurstTyme-1, p.ArrivalTime);
				pQueue.add(p);
				
				
				
				pQueue.add(myProcess.get(i));			// Adding a new Process			
				
				if(pQueue.peek().BurstTyme<=0) {
					System.out.println(pQueue.peek());
					pQueue.poll();
				}
			}
		}
		
		while(pQueue.size()>0) {
			System.out.println(pQueue.poll());
		}
		
		for(int i=0 ; i<processOccured.size() ; i++) {
			System.out.println(processOccured.get(i));
		}
		
		
	}
}
