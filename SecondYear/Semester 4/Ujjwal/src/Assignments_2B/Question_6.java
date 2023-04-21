package Assignments_2B;

import java.security.KeyStore.Entry;

public class Question_6 {
    public static void main(String[] args) {
        createHashMap();
    }
    public static void createHashMap(){
        java.util.HashMap<Integer,Integer> obj = new java.util.HashMap<>();
        obj.put(1, 100);
        obj.put(2, 200);
        obj.put(3, 300);
        obj.put(4, 400);

        System.out.println(obj.entrySet());

        // iterating the hashmap through entry set

        for(java.util.Map.Entry<Integer, Integer> entry : obj.entrySet()){
            System.out.println(entry);
        }

        // For Printing Key 
        for(java.util.Map.Entry<Integer, Integer> entry : obj.entrySet()){
            System.out.println(entry.getKey());
        }

        // for Printing Value
        
        for(java.util.Map.Entry<Integer, Integer> entry : obj.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
