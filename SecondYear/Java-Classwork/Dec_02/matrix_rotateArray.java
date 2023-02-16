package Dec_02;

public class matrix_rotateArray 
{
	public static int[][] compute(int[][] arr)
	{
		int[][] temp = new int[arr.length][arr[0].length];
		for(int i=arr.length-1 ; i>=0 ; i--)
		{
			int a=0;
			for(int j=arr.length-1 ; j>=0 ; j--)
			{
				temp[i][a] = arr[j][i];
				a++;
			}
			a=0;
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] xyz = compute(arr);				// 270
		

		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr[i].length ; j++)
			{
				System.out.print(xyz[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
