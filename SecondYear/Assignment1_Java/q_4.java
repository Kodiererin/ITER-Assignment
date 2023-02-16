package Assignment1_Java;

import java.util.Scanner;

// Q4. Compute xXy without arithmetic operator
public class q_4 {
    public static void main(String[] args) 
    {       
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res=0;
        while(y>0)
        {
            if((y&1)==1)
            {
                res = res|x;
            }
            x =   x<<1;
            y = y>>1;
        }
        System.out.println(res);
    }
}
