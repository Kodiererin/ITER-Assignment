package Assignment1_Java;

import java.util.Scanner;

// Write a program to count how many prime numberspresent in an array
public class q_15 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        System.out.println("Check Prime Numbers");
        System.out.println("Enter The Size of the Array");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the Elements in the Array");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        // checking Prime Numbers
        int ctr=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(checkPrime(arr[i]))
                ctr++;
        }
        System.out.println("The Number of Prime Numbers in The Array is "+ctr);
    }    
    public static boolean checkPrime(int num)
    {
        for(int i=2 ; i<num/2 ; i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
