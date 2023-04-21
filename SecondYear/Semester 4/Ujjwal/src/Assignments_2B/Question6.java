package Assignments_2B;

import java.util.LinkedHashSet;

public class Question6 {
    public static void main(String[] args) {
        createLinkedHashSet();
    }
    public static void createLinkedHashSet(){
        java.util.LinkedHashSet<Double> obj = new LinkedHashSet<>();
        obj.add(12.00);
        obj.add(123.00);
        obj.add(112.00);
        obj.add(132.00);

        // Displaying the Hashset
        for (Double myData : obj) {
            System.out.println(myData);
        }
    }
}
