package Dec_03;

//	Failed Test
public class test
{
	public static  void findPath(int[][] arr , int empty[][], int start1  , int start2 , int end1 , int end2)
	{
		if(start1<arr.length && start2<arr[0].length && start1>-1 && start2>-1)
		{
			if(start1==end1 && start2==end2)
			{
				System.out.println("Path Found");
			}
			if(arr[start1-1][start2]==1 && empty[start1-1][start2]==0)
			{
				empty[start1-1][start2]=1;
				findPath(arr,empty,start1-1,start2, end1, end2);
			}
			else if(arr[start1+1][start2]==1 && empty[start1+1][start2]==0) 
			{
				empty[start1+1][start2]=1;
				findPath(arr,empty,start1+1,start2, end1, end2);
			}
			else if(arr[start1][start2+1]==1 && empty[start1][start2+1]==0)
			{
				empty[start1][start2+1]=1;
				findPath(arr,empty,start1,start2+1, end1, end2);
			}
			else if(arr[start1][start2-1]==1 && empty[start1][start2-1]==0)
			{
				empty[start1][start2-1]=1;
				findPath(arr,empty,start1,start2-1, end1, end2);
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
				{1,0,1,1,1}
		};
		int[][] empty=new int[4][4];
		findPath(arr,empty,3,2,4,4);
	}
}
