package Nov19;


class myArray
{
	public int[] arr;
	int maxSize;
	
	myArray(int size)
	{
		this.maxSize = size;
		this.arr = new int[maxSize];
	}
	public void getData()
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter The Data");
		for(int i=0 ; i<this.arr.length ; i++)
		{
			System.out.println("Enter Data for Arr "+i);
			arr[i] = sc.nextInt();
		}
	}
	public void findFrequency()
	{
//		lets sort the array	
		for(int i=1 ; i<this.arr.length;  i++)
		{
			for(int j=i ; j>=0 ; j--)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i=0 ; i<arr.length ; i++)
		{
			int ctr=0;
			for(int j=0 ; j<arr.length ; j++)
			{
				if(arr[i] == arr[j])
				{
					ctr++;
				}
			}
			System.out.println(arr[i]+" is "+ctr+" timees ");
			ctr=0;
		}		
	}
//	lets search
	public void search(int search , int i , int j, int search)
	{
//		will be doing binary searchh
		if(arr[(i+j)/2]==search)
			System.out.println("Element Found");
		else if(arr[(i+j)/2]<=search)
		{
			search(search,i,i+j/2,search);
		}
		else
			search(search,i+j/2 , j , search);
	}
//	Show Data
	public  void showData()
	{
		for(int i=0 ;  i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
public class ArrayConstructor 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter The Size of the array");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int size = sc.nextInt();
		
		myArray obj = new myArray(size);
		obj.getData();
		obj.showData();
		obj.findFrequency();
		obj.search(0, size, size, search);
		
	}
}
