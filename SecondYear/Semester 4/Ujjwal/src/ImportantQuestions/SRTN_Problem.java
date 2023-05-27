package ImportantQuestions;

import java.util.Collections;
import java.util.Comparator;

import a_Important.Process;

//	Shortest Remaining Time next(SRTN) is a scheduling algorithm which serve first the process
//	Write a JAVA program which take N process burst time and print the scheduling sequence using SRTN.

class Process implements Comparator<Process>{
	String Process;
	int BurstIn;
	int ArrivalTime;
	Process(String process , int BurstIn , int ArrivalTime){
		this.ArrivalTime = ArrivalTime;
		this.BurstIn = BurstIn;
	}
	@Override
	public int compare(Process o1, Process o2) {
		if(o1.ArrivalTime==o2.ArrivalTime) return 0;
		else if (o1.ArrivalTime>o2.ArrivalTime) return 1;
		else return -1;
	}
}

public class SRTN_Problem {
	public static void main(String[] args) {
		
	}
	public static void SRTN() {
//		Process[] obj = new Process[5];
//		obj[0] = new Process("p1", 5, 0);
//		obj[1] = new Process("p2", 7, 0);
//		obj[2] = new Process("p3", 2, 0);
//		obj[3] = new Process("p4", 3, 0);
		
		java.util.ArrayList<Process> obj = new java.util.ArrayList<>();
		obj.add(new Process("p1", 5, 0));
		obj.add(new Process("p2", 7, 0));
		obj.add(new Process("p3", 2, 0));
		obj.add(new Process("p4", 3, 0));
		
		Collections.sort(obj);
		
		
		
	}
}
