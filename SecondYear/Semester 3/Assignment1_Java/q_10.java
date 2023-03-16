package Assignment1_Java;
// Assignmenton JavaQ1. Write a program to count number of bits of an integer number.Note: Use bit wise operator.Q2. T parity of a binary word is 1 if the number of 1s in the word is odd; otherwise, it is 0. Write a program to compute the parity of a very large numberof 64-bits.Q3. Write a program to swap the ith bit with jth bit of a 64-bits integer number.Q4. Compute xXy without arithmetic operator.Note: Use bitwise operator.Q5. Write a program to find the reverse of a string.Note: Use StringBuffer classQ6. Write a program to count number of word present in a string.Note: Use split functionQ7. Write a programwhich read a name and date of birth(DOB)create a password which consist of the first two latter of the name and month from DOB.Q8. Write a program which reads two integer number of any length from user and find it sum.Note: Don’tuse bigintegerclass.Q9. Write a program which encode the spreadsheet column.Example:A is encoded to 1B is encoded to 2.....Z is encoded to 26ZA is encoded to 27Q10. Write a program which read a number and base1 and base2and convert the number of base1 to base2
public class q_10 {
    public static void main(String[] args) 
    {
        int num = base1(10011, 2);
        System.out.println(base2(num, 12));
    }

    public static int base1(int num , int base)
    {
        int send=0;
        int i=0;
        while(num>0)
        {
            send = send+  (int)((num%10)*Math.pow(base, i));
            i++;
            num = num/10;
        }
        return send;
    }
    public static int base2(int num , int base)
    {
        int sum=0;
        int i=0;
        while(num>0)
        {
            sum = sum+ num%base*(int)(Math.pow(10, i));
            i++ ; num = num/12;
        }
        return sum;
    }
}
