/*Write a java program that randomly generates an array of 100 integers and a key. Estimate the 
execution time of invoking the linearSearch method. Sort the array and estimate the execution 
time of invoking the binarySearch method. You can use the following code template to obtain 
the execution time: 
long startTime = System.currentTimeMillis(); 
perform the task; 
.... 
.... 
long endTime = System.currentTimeMillis(); 
long executionTime = endTime - startTime; */
public class A714 
{
	static void myArrayinAscending(int[] sortmyArray)
	{
		int max;
		for(int i=0 ; i<sortmyArray.length ; i++)
		{
			for(int j=0 ; j<sortmyArray.length ; j++)
			{
				if(sortmyArray[i]>=sortmyArray[j])
				{
					max = sortmyArray[j];
					sortmyArray[j]= sortmyArray[i];
					sortmyArray[i] = max;
				}
			}
		}
		for(int k=0 ; k<sortmyArray.length ; k++)
		{
			System.out.print(sortmyArray[k]+" , ") ;
		}
	}
		static void myArrayinDescending(int[] sortmyArray)
		{
			int max;
			for(int i=0 ; i<sortmyArray.length ; i++)
			{
				for(int j=0 ; j<sortmyArray.length ; j++)
				{
					if(sortmyArray[i]<=sortmyArray[j])
					{
						max = sortmyArray[j];
						sortmyArray[j]= sortmyArray[i];
						sortmyArray[i] = max;
					}
				}
			}
			for(int k=0 ; k<sortmyArray.length ; k++)
			{
				System.out.print(sortmyArray[k]+" , ");
			}
	}
	public static void main(String[] args)
	{
		int ujjarr[] = new int[100];
		for(int i=0 ; i<100 ; i++)
		{
			double random = (int)(Math.random()*(100-1)+1);
			int ran = (int)random;
			ujjarr[i] =ran ; 
		}
		System.out.println("Array Sorted in Ascending order");
			myArrayinAscending(ujjarr);
		System.out.println("\nArray Sorted in Descending order");
			myArrayinDescending(ujjarr);
	}
}
