package a_Important;

public class Prims_Algorithm {
	public static void main(String[] args) {
//		Creating a Graph
//		int[][] ujjwalGraph = {
//					0	1	2	3
//				{ 0, 5, 8, 0 }, { 5, 0, 10, 0 }, { 8, 10, 0, 20 }, { 0, 15, 20, 0 }, };
		int[][] ujjwalGraph = {
//					0	1	2	3
				{0,2,0,6,0},{2,0,3,8,5},{0,3,0,0,7},{6,8,0,0,9},{0,5,7,9,0}};
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
		boolean[] mSet = new boolean[vertexSize];				// All the elements in the vertex arrray is set to false
		key[0] = 0;
		for (int count = 0; count < vertexSize; count++) {
			int u = -1;
			for (int i = 0; i < vertexSize; i++) {
				if (!mSet[i] && (u == -1 || key[i] < key[u])) {
					u = i;
				}
			}
			mSet[u] = true;
			result = result + key[u];

			for (int v = 0; v < vertexSize; v++) {
				if (arr[u][v] != 0 && !mSet[v]) {
					key[v] = Math.min(key[v],arr[u][v]);
				}
			}
		}
		System.out.println(result);
	}
}
