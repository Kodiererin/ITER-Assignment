package Assignment1_Java;
class q_13
{
    // Q13. Write a program to countthe frequency of each digit ofa number.
    public static void main(String[] args) {
        int num = 101121;
        String number = num+"";
        countFrequency(number.toCharArray());
    }
    public static void countFrequency(char[] arr)
    {
        for(int i=1 ; i<arr.length ; i++)
        {
            char key = arr[i];
            int j=i-1;
            while(j>-1 && arr[j]>key )
            {
                arr[j+1] = arr[j];
                j--;    
            }
            arr[j+1] = key;
        } 
        display(arr);
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
    public static void display(char[] arr)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}