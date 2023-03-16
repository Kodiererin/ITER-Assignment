package Assignment1_Java;

public class q_25 {
    // Write some programto demonstrate use of auto unboxing
    public static void main(String[] args) {
        Integer a  = 10;
        int i = a.intValue();
        int j=a;    // unboxing 
        System.out.println(a+" "+i+" "+j );
    }
}
