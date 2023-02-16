package Assignment3;
public class A3Q12 
{
	static void arrayKarrange(int[] arr , int search ) // int u is to be kept for further reference
	{
		if(arr[arr.length]<=search)
		{
			int [] design = new int[(arr.length)/2];
			for(int i=0 ; i<((arr.length-1)/2) ; i++)
			{
				design[i] = arr[((arr.length)/2)+i];
			}
			if(design[1] == search)
			{
				System.out.println("The Array has been found");
			}
			if(design[2] == search)
			{
				System.out.println("The Array has been found");
			}
		}
		else if(arr[arr.length]>=search)
		{
			int[] design2 = new int[(arr.length)/2];
			for(int j=0 ; j<((arr.length-1)/2) ; j++)
			{
				design2[j] = arr[(arr.length/2)+j];
			}
			if(design2[1] == search)
			{
				System.out.println("The Array has been found");
			}
			if(design2[2] == search)
			{
				System.out.println("The Array has been found");
			}
		}
	}
	public static void main(String[] args) 
	{
		int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10 ,11};
		int search = 7;
		A3Q12.arrayKarrange(arr,search);
//		System.out.println(arrayKarrange(arr , search));
	}
}