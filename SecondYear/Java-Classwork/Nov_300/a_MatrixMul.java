package Nov_300;

public class a_MatrixMul 
{
	public static void multiply()			// int[][] arr , int[][] arr2
	{
//		int product[][] = new int[arr[0].length][arr2.length];
		
		int[][] arr = {{1,2},{2,3}};
		int[][] arr2 = {{6,7},{1,2}};
		int[][] product = new int[arr.length][arr2[0].length];
		
		int i=0;
		int j=0;
		
		int k=0;
		int sum=0;
		while(i<arr.length)
		{
			while(j<arr[i].length)
			{
				while(k<arr2.length)
				{
					sum+= arr[i][k]*arr2[k][j];
					k++;
				}
				System.out.println(sum);
				product[i][j] = sum;
//				System.out.println(product[i][j]);
				sum=0;
				j++;
				
			}
			i++;
		}

		for(int m=0 ; m<product.length ; m++)
		{
			for(int n=0 ; n<product.length ; n++)
			{
				System.out.print(product[m][n]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		multiply();
	}
}
