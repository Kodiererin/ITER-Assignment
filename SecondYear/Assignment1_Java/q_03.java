package Assignment1_Java;
// Q3. Write a program to swap the ith bit with jth bit of a 64-bits integer number
public class q_03 
{
    public static void main(String[] args) 
    {
        int x = 102;
        System.out.println(Integer.toBinaryString(x));
        int a = 1;
        int b = 3;
        // System.out.println(Integer.toBinaryString((x>>a)&1));
        // System.out.println(Integer.toBinaryString((b>>b)&1));
        if(((x>>a)&1) == ((x>>b)&1))
         System.out.println(x);
        int sum = (1<<a) | (1<<b);
        x = x^sum;
        System.out.println(Integer.toBinaryString(x));
    }    
}
