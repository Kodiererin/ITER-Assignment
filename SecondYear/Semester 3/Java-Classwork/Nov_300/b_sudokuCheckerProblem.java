package Nov_300;
//	Check the Code and Retry!
public class b_sudokuCheckerProblem 
{
	public static boolean check(int[][] arr , int length1 , int length2)
	{		
		for(int a=0 ; a<length1 ;a++)
		{
			for(int b=0 ; b<length2 ;b++)
			{
				int compare = arr[a][b];
				int ctr=0;
				for(int i=0 ; i<length1 ; i++)
				{
					for(int j=0 ; j<length2 ; j++)
					{
						if(compare==arr[i][j])
							ctr++;
						if(ctr>1)
							return false;
					}
				}
			}
		}
		return true;
	}
	public static void checkSudoku(int[][] arr)
	{
		for(int i=0 ; i<arr.length ; i+=3)
		{
			for(int j=0 ; j<arr[i].length ; j+=3)
			{
				if(check(arr,i,j)==false) {
					System.out.println("Sudoku Not Formed");
					return;
				}
			}
		}
		System.out.println("Sudoku Formed");
	}
	
	
	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{1,2,3},{4,5,6},{7,8,9},{1,2,3},{4,5,6},{7,8,9}};
		checkSudoku(arr);
	}
}
