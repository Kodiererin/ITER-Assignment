package Assignment1_Java;

public class q_17 {
    // Q17. Write a program to delete all duplicate present in a sorted array.
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,4,5,5,5,5,6,6,6,6,7};
        deleteDuplicate(arr);
    }
    public static int[] deleteDuplicate(int[] arr)
    {
        // Check if thr Array is Empty Or Not
        if(arr.length==0 || arr.length==1)
        {
            return arr;
        }


        // Sorting the Array In the Ascending Order.
        for(int i=1 ; i<arr.length ; i++)
        {
            int key = arr[i];
            int j=i-1;
            while(j>-1 && arr[j]>key )
            {
                arr[j+1] = arr[j];
                j--;    
            }
            arr[j+1] = key;
        }
        // Deleting all the Duplicates.
        int j=0;
        int[] newArr = new int[arr.length];
        for(int i=0 ; i<arr.length-1 ; i++)
        {
            if(arr[i]!=arr[i+1])
            {
                j++;
                newArr[j] = arr[i];
            }
        }
        j++;
        newArr[j] = arr[arr.length-1];

        return newArr;
    }
}
