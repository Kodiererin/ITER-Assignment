package Assignments_2A;

public class DFS_traverse {
	public static void addLink(java.util.ArrayList<java.util.ArrayList<Integer>> adj , int u , int v) {
		adj.get(v).add(u);
		adj.get(u).add(v);
	}
	public static void creatingArray() {
		int size = 7;
		java.util.ArrayList<java.util.ArrayList<Integer>> adj = new java.util.ArrayList<java.util.ArrayList<Integer>>(size);
		
		for(int i=0 ; i<size ; i++) {
			adj.add(new java.util.ArrayList<Integer>());
		}
		
		addLink(adj, 0, 1);
		addLink(adj, 1, 2);
		addLink(adj, 2, 3);
		addLink(adj, 0, 4);
		addLink(adj, 4, 5);
		addLink(adj, 4, 6);
		addLink(adj, 5, 6); 
		
		deapthFirstSearch(adj);
	}
	public static void deapthFirstSearch(java.util.ArrayList<java.util.ArrayList<Integer>> adj) {
		boolean[] visited = new boolean[adj.size()];
		for(int i=0 ; i<adj.size() ; i++) {
			if(visited[i]==false) {
				DFS(adj,visited , i);
			}
		}
	}
	
	public static void DFS(java.util.ArrayList<java.util.ArrayList<Integer>> adj , boolean[] visited , int source) {
		visited[source]= true;
		System.out.println(source+" ");
		for(int i = source ; i<adj.size() ; i++) {
			if(visited[i]==false) {
				DFS(adj,visited,i);
			}
		}
	}

	
	public static void main(String[] args) {
		creatingArray();
	}
}
