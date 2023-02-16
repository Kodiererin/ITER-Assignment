package Assignment1_Java;
// Q14. Write a program to count the frequency of each number present in an array.
public class q_14 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,2,2,4,5,5,1,3}; 
        // Sorting the Array
        // Do the Sorting operation and then Proceed.

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
        } display(arr);
        System.out.println();
        int i=0;
        while(i<arr.length)
        {
            int j=i;
            int ctr=0;
            while(j<arr.length && arr[j]==arr[i])
            {
                ctr++;
                j++;
            }
            System.out.println(arr[i]+"is "+(ctr)+" times in the Array");
            i=j-1;
            i++;
        }
    }

    public static void display(int[] arr)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
