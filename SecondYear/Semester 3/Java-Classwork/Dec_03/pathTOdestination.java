package Dec_03;


public class pathTOdestination
{
	public static  void findPath(int[][] arr , int start1 , int start2 , int end1 , int end2)
	{
		if(start1<arr.length && start2<arr[0].length && start1>-1&& start2>-1)
		{
			if(start1==end1 && start2==end2)
			{
				System.out.println("Path Found");
				
			}
			if(arr[start1-1][start2]==1)
			{
				findPath(arr,start1-1,start2, end1, end2);
			}
			else if(arr[start1+1][start2]==1)
			{
				findPath(arr,start1+1,start2, end1, end2);
			}
			else if(arr[start1][start2+1]==1)
			{
				findPath(arr,start1,start2+1, end1, end2);
			}
			else if(arr[start1][start2-1]==1)
			{
				findPath(arr,start1,start2-1, end1, end2);
			}
			else
			{
				System.out.println("There is No Path");
			}
		}
		else
			System.out.println("Path Not Found");
	}
	public static void main(String[] args) 
	{
		int arr[][]= 
		{
				{1,0,0,0,0},
				{0,1,1,1,1},
				{0,0,0,1,0},
				{1,0,1,1,1},
				{1,0,1,0,1}
		};
		findPath(arr,1,1,2,3);
	}
}
