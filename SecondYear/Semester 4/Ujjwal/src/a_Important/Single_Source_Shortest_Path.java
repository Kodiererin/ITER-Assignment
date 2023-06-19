package a_Important;

import java.util.Arrays;

import javax.swing.plaf.ViewportUI;

//	Problem : Given a weighted graph and a source. Find the Shortedt Distances from source to all the Vertices.
public class Single_Source_Shortest_Path {
	public static void main(String[] args) {
		int[][] arr = {
				{0,5,10,0},{5,0,3,20},{10,3,0,2},{0,20,2,0}
		};
		Dijkstras_Algorithm(arr, 0);
	}
	
//	How to Implement?
//	1. Create a Empty Priority Queue.
//	2. Distance[vertexSize] = Infinity
//	3. distance[source] = 0;
//	4. Insert into Priority Queue.
//	5. while(pq.empty() == false){
//		u = pq.extractMin()
//		Relax all the adjacent edges of u that are not in the priority queue
//	}
	
	
//	---------------- Implementation Starts -----------------------------------
	public static void Dijkstras_Algorithm(int[][] arr , int source) {
		int graphLength = arr.length;
        int[] dist = new int[graphLength];
        boolean[] visited = new boolean[graphLength];
        
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        
        for (int count = 0; count < graphLength - 1; count++) {
            int u = -1;
            for (int i = 0; i < graphLength; i++) {
                if (!visited[i] && (u == -1 || dist[i] < dist[u])) {
                    u = i;
                }
            }
            
            visited[u] = true;
            
//            for (int v = 0; v < graphLength; v++) {
//                if (!visited[v] && arr[u][v] != 0 && dist[u] != Integer.MAX_VALUE &&
//                        dist[u] + arr[u][v] < dist[v]) {
//                    dist[v] = dist[u] + arr[u][v];
//                }
            
//         ---------- Another Method ------------   
            for(int v = 0 ; v<graphLength ; v++) {
            	if(!visited[v] && arr[u][v]!=0	) {
            		dist[v] = Math.min(dist[v], dist[u]+arr[u][v]);
            	}
            }
        }
        
        // Displaying the Distance Array
        for (int i = 0; i < dist.length; i++) {
            System.out.println("Distance from source to " + i + " : " + dist[i]);
        }
	}
}




























