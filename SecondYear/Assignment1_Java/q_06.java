package Assignment1_Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Q6. Write a program to count number of word present in a string.
public class q_06 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter String ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String [] arr = s.split(" ");
        int ctr=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            ctr++;
            System.out.println(arr[i]);
        }
        System.out.println(ctr);
    }
   
}
