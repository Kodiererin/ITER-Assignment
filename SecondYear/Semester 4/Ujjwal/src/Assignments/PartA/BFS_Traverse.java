package Assignments.PartA;

import java.util.Queue;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class BFS_Traverse {
//	We will be using ArrayList of ArrayList to represent graph.
//	I am using ArrayList to Test the graph.
	public static void addEdge(ArrayList<ArrayList<Integer>> adj , int u , int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static void main(String[] args) {
		int size = 5;
		
		java.util.ArrayList<java.util.ArrayList<Integer>> adj = new java.util.ArrayList<java.util.ArrayList<Integer>>(size);
		
		for(int i=0 ; i<size ; i++) {
			adj.add(new java.util.ArrayList<Integer>());
		}
		
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 0, 3);
		addEdge(adj, 2, 3);	
		
		breadthFirstSearch(adj , 0);
	}
	public static void breadthFirstSearch(java.util.ArrayList<java.util.ArrayList<Integer>> adj , int source) {
		java.util.Queue<Integer> queue = new java.util.LinkedList();
		boolean[] visitedArray = new boolean[adj.size()];
		queue.add(source);
		visitedArray[source] =  true;
		
		while(queue.isEmpty()==false) {
			int next = queue.poll();
			System.out.println(next);
			for(int i=0 ; i<adj.get(next).size() ; i++) {
				if(visitedArray[adj.get(source).get(i)]==false) {
					visitedArray[adj.get(source).get(i)]=true;
					queue.add(adj.get(source).get(i));
				}
			}
		}
		
		
		
	}
}
