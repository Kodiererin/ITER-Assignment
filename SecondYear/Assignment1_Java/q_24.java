package Assignment1_Java;
// Q24. Write some programto demonstrate use of auto boxing.
public class q_24 {
    public static void main(String[] args) {
        int a=69;
        // Converting int to Integer
        Integer i = Integer.valueOf(a);
        System.out.println(a+"  "+i);
        // Autoboxing
        Integer j = a;
        System.out.println(a+"  "+i+"   "+j);
    }
}
