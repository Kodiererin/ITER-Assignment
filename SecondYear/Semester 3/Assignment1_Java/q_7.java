package Assignment1_Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class q_7 {
    // Q7. Write a programwhich read a name and date of birth(DOB)create a password which consist of the first two latter of the name and month from DOB.
    public static void main(String[] args)throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name ");
        String name = br.readLine();
        System.out.println("Enter DOB in DD/MM/YYY Format");
        String DOB = br.readLine();
        String m = "";
        String [] arr = DOB.split("/");
        System.out.println(name.charAt(0)+""+name.charAt(1)+""+arr[1]+"");
    }
}
