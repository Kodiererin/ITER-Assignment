package College.SecondYear.TestJava;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class a_hashMap {
    public static void main(String[] args){
        System.out.println("Hello World");
        testHashMap();
    }
    public static void testHashMap(){
        java.util.HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 1);
        map.put(4, 1);

        System.out.println(map);

        map.forEach((key,value)->{
            System.out.println(key+" "+value);
        });

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
