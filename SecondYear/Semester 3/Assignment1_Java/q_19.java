package Assignment1_Java;
// Q19. Write programto insert an element in an array at specifiedposition

public class q_19 {
    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter The Size of the Array");
        int size = sc.nextInt();
        System.out.println("Enter The Elements Of the Array");
        int[] arr = new int[size];
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Position and Element that You want to Insert");
        int pos = sc.nextInt();
        int element = sc.nextInt();
        addElementArray(arr, pos, element);
        
    }

    public static void addElementArray(int[] arr , int pos , int element)
    {
        if(pos<=arr.length)
        {
            int[] newArr = new int[arr.length+1];
            for(int i=0 ; i<newArr.length ; i++)
            {
                if(i<pos-1)
                {
                    newArr[i] = arr[i];
                    System.out.print(newArr[i]+" ");
                }
                else if(i==pos-1)
                {
                    newArr[i] = element;
                    System.out.print(newArr[i]+" ");
                }
                else
                {
                    newArr[i] = arr[i-1];    
                    System.out.print(newArr[i]+" ");
                }
            }
        }
        else
        {
            System.out.println("Position is Beyond The Array Length");
        }
    }

    public static void display(int[] arr)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}