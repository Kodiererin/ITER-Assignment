package Assignment1_Java;

import java.util.Scanner;
// Q21. Create a class Num having an integer array as its member and required set, get and constructor.Add a method to Num class which find the reverse of the array
class Num
{
    private int[] arr;
    public int[] getArr() {
        return arr;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public int size()
    {
        return size;
    }
    private int size;
    Num(int size)
    {
        this.size = size;
        this.arr = new int[size];
    }

    public  int[] reverseArray(int[] arr)
    {
        for(int i=0 ; i<arr.length/2 ; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
    // Display the Array
    public void display(int[] arr)
    {
        for(int i=0 ; i<size ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}


public class q_21
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        Num obj = new Num(size);
        System.out.println("Enter The Elements of The Array");
        int[] arr = new int[size];
        for(int i=0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        obj.display(obj.reverseArray(obj.getArr()));
        
    }
}