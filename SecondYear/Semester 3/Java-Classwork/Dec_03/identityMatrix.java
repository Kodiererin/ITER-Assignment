package Dec_03;
//	Write a program to check if the Matrix is an Identity Matrix or Not.
public class identityMatrix 
{
	public static boolean check(int[][] arr)
	{
		if(arr.length!=arr[0].length)
		{
			return false;
		}
		else
		{
			for(int i=0 ; i<arr.length ; i++)
			{
				for(int j=0 ; j<arr.length ; j++)
				{
					if(arr[i][j]!=0 && arr[i][i]!=1)
					{
						return false;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int[][] arr = {{1,0,0},{0,1,0},{0,0,1}};
		int[][] arr2 = {{1,1,1},{1,2,4},{1,1,1}};
		
		System.out.println(check(arr));
		System.out.println(check(arr2));
	}
}
