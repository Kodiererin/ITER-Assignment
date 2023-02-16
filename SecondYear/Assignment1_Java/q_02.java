package Assignment1_Java;
//    Q2. T parity of a binary word is 1 if the number of 1s in the word is odd; otherwise, it is 0. Write a 
//    program to compute the parity of a very large number of 64-bits.

import java.util.Scanner;

public class q_02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ctr=0;
        // System.out.println(Integer.toBinaryString(x));
        while(x!=0)
        {
            if((x&1)==1) ctr++;
            x=x>>1;
        }
        System.out.println("Number of T Parity Bit is "+ctr);
    }    
}
