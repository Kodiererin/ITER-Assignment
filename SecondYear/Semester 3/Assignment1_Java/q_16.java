package Assignment1_Java;
//  Q16. Write a program to rotate an integer array.
public class q_16 
{
    public static void main(String[] args) 
    {
        System.out.println("Rotate An Array");  
        int[] arr = {1,2,3,5,6,7,8,9,10};
        display(rotate(arr));
    }   
    public static void display(int[] arr)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    public static int[] rotate(int[] arr)
    {
        for(int i=0 ; i<arr.length/2 ; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
}
