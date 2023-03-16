package Assignment1_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Q11. Write a program to revers all word of a sentence.
public class q_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Word That is to be Reversed");
        String m = br.readLine()+" ";
        String reversed="";
        int i=0;
        String word = "";
        while(i<m.length())
        {
            if(m.charAt(i)!=32)
            {
                word = m.charAt(i)+word;
            }
            else
            {
                reversed = reversed+" "+word;
                word = "";
            }
            i++;
        }
        System.out.println(reversed);
    }
}
