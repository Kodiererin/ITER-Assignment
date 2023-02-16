package Assignment1_Java;
// Q5. Write a program to find the reverse of a string
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class q_05 {
    public static void main(String[] args) throws IOException 
    {
        System.out.println("Enter String ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i=s.length()-1;
        String reverse = "";
        while(i>-1)
        {
            reverse+=s.charAt(i);
            i--;
        }
        System.out.println(reverse);
    }
}
