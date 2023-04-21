package Assignments_2B;

public class Question4 {
    public static void main(String[] args) {
        stringHashSet();
    }
    public static void stringHashSet(){
        java.util.HashSet<String> obj = new java.util.HashSet<>();
        obj.add("Ujjwal");
        obj.add("Kumar");
        obj.add("Ujjwal Kumar");

        for (String myName : obj) {
            System.out.println(myName);
        }

    }
}
