package a_Important;

public class Prims_Algorithm {
	public static void main(String[] args) {
//		Creating a Graph
//		int[][] ujjwalGraph = {
//					0	1	2	3
//				{ 0, 5, 8, 0 }, { 5, 0, 10, 0 }, { 8, 10, 0, 20 }, { 0, 15, 20, 0 }, };
		int[][] ujjwalGraph = {
//					0	1	2	3
				{0,2,0,6,0},
				{2,0,3,8,5},
				{0,3,0,0,7},
				{6,8,0,0,9},
				{0,5,7,9,0}};
		primsAlgo(ujjwalGraph);
	}

	public static void primsAlgo(int[][] arr) {
//		What is the Size of the Vertex?
		int vertexSize = arr.length;
		int result = 0;
//		Initializing a Key array with VertexSize
		int[] key = new int[vertexSize];
		for (int i = 0; i < key.length; i++) {
			key[i] = Integer.MAX_VALUE;
		}
//		Creating a Boolean which tells if the vertex is included or not
		boolean[] visited = new boolean[vertexSize];				// All the elements in the vertex arrray is set to false
//		By Default all the Visited Array is Initialized to False.
		key[0] = 0;
		for (int count = 0; count < vertexSize; count++) {
			int u = -1;
			for (int i = 0; i < vertexSize; i++) {
				if (!visited[i] && (u == -1 || key[i] < key[u])) {
					u = i;
				}
			}
			visited[u] = true;
			result = result + key[u];

			for (int v = 0; v < vertexSize; v++) {
				if (arr[u][v] != 0 && !visited[v]) {
					key[v] = Math.min(key[v],arr[u][v]);
				}
			}
			
		}
		System.out.println(result);
		
//		This is the Overall Path Weights which has been computed.
		for(int i=0 ; i<key.length ; i++) {
			System.out.print(key[i]+" ");
		}
	}
}

//	Github me Stars Toh De dete