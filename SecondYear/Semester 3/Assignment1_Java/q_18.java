package Assignment1_Java;
// Q18. Write a program to merge two sorted array to make a single sorted array
public class r_merge2SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,9,10,12};
        int[] arr2 = {1,4,5,6,7,8,9,23,47};
        int[] myArr = new int[arr.length + arr2.length];
        int i=0; int a=0; int b=0;
        while(a<arr.length && b<arr2.length)
        {
            if(arr[a]<arr2[b]){ myArr[i] = arr[a] ; a++;}
            else { myArr[i] = arr2[b] ; b++ ;}
            i++;
        }
        
        if(a<arr.length) {while(i<myArr.length && a<arr.length){ myArr[i] = arr[a];a++;i++;}}
        else {while(i<myArr.length && b<arr2.length ) { myArr[i] = arr2[b]; b++ ; i++; }}

        for(int j=0 ; j<myArr.length ; j++){ System.out.print(myArr[j]+" "); }

    }
}