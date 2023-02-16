package Dec_02;
//		Print the Spiral Order of the Matrix.
public class matrix_01_DisplaySpiral 
{
	public static void spiralMatrix(int[][] arr)
	{
		int initial=0;		// for row
		int end = 0;		// for column
		int column = arr.length-1;
		int row = arr[column].length-1;
//		System.out.println(initial+" "+end+" "+column+" "+row);
		
//		System.out.println(row+" "+column);
		for(int a=initial ; a<=row ; a++)
		{
			for(int i=initial ; i<=row-1 ; i++)
			{
				System.out.print(arr[initial][i]+" ");
			}
			for(int k=end ; k<=column ; k++)
			{
				System.out.print(arr[k][row]+" ");
//				row=k;
			}
			for(int l=row-1 ; l>initial ; l--)
			{
				System.out.print(arr[column][l]+" ");
//				column = l;
			}
			for(int m = column ; m>end ; m--)
			{
				System.out.print(arr[m][end]+" ");
			}
//			System.out.println(initial+" "+end+" "+column+" "+row);
			initial+=1;
			end+=1;
			column-=1;
			row-=1;
//			System.out.println(initial+" "+end+" "+column+" "+row);
		}
	}
	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3,91},{4,5,6,90},{7,8,9,92},{11,12,13,14},{23,24,25,26}};
//		int[][] arr = {{1,2,3},{4,5,6,},{7,8,9}};
////		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9},{1,2,3},{4,5,6},{7,8,9}};
		spiralMatrix(arr);
////		System.out.println();
////		spiralMatrix(arr2);
	}
}
