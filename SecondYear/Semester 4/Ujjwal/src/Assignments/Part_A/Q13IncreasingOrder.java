package Assignments.Part_A;

public class Q13IncreasingOrder {
    public static void main(String[] args) {
        int[] arr1  = {10,12,3,22,12,13,4};
        int[] arr2  = {1,22,33,22,20,13,40};

        show(increasingOrder(arr1, arr2));;
    }
    public static int[] increasingOrder(int[] arr1 , int[] arr2){
        if(arr1.length==0) return arr2;
        if(arr2.length==0) return arr1;
        
        int[] maxLength = new int[Math.max(arr1.length, arr2.length)];
        int sum = 0;
        int maxLengthIterator=0; 


        for(int i=0 ; i<Math.min(arr1.length, arr2.length) ; i++){
            if(arr1[i]==arr2[i]){
                sum+=arr1[i];
                // System.out.println(sum);
                maxLength[maxLengthIterator]+=sum;
            }
            else{
                if(arr1[i]>arr2[i]){
                    maxLength[maxLengthIterator] = arr1[i];
                    sum+=maxLength[maxLengthIterator];
                    maxLengthIterator+=1;
                }
                else if(arr2[i]>arr1[i]){
                    maxLength[maxLengthIterator] = arr2[i];
                    sum+=maxLength[maxLengthIterator];
                    maxLengthIterator+=1;
                }
            }
        }

        System.out.println("The Sum is "+sum);
        return maxLength;
    }
    // Displaying the Data
    public static void show(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
