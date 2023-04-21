package Assignments.Part_A;

public class Q17BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int search = 1;
        BinarySearch(arr, 0, arr.length-1, search);
    }
    public static void  BinarySearch(int[] arr , int i , int j , int search){
        if(i<=j){
            int mid = (i+j)/2;
            if(arr[i]==mid){
                System.out.println("Element Found");
                return;
            }
            else if(search>arr[mid]){
                BinarySearch(arr, mid+1, j, search);
            }
            else if(search<arr[mid]){
                BinarySearch(arr, i, mid, search);
            }
        }
    }       
}
