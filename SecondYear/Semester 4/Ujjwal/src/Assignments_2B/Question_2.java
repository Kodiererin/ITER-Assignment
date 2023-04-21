//  Write a program to create a class named it as Address, having member
//  variable plot no, at, post and required member function. Create a
//  tree map having key as name of a person and value as address. Insert
//  required key and value in the created tree map and display it.
package Assignments_2B;

class Address {
    int plotNo;
    String at;
    int post;

    Address(int plot, String at, int post) {
        this.plotNo = plot;
        this.at = at;
        this.post = post;
    }
    public String toString() {
		return this.plotNo+" "+this.at+" "+this.post;
    	
    }

}

public class Question_2 {
    public static void main(String[] args) {
        compute();
    }

    public static void compute() {
        // Creating Tree	
    	java.util.TreeMap<Integer, Address> treeMap = new java.util.TreeMap();
    	treeMap.put(0, new Address(00,"Krishna Nagar",826000));
    	treeMap.put(1, new Address(01,"Krishna Nagar",826000));
    	treeMap.put(2, new Address(02,"Krishna Nagar",826000));
    	treeMap.put(3, new Address(03,"Krishna Nagar",826000));
    	treeMap.put(4, new Address(04,"Krishna Nagar",826000));
    	treeMap.put(5, new Address(05,"Krishna Nagar",826000));
    	treeMap.put(6, new Address(06,"Krishna Nagar",826000));
    	
    	display(treeMap);
    }
    public static void display(java.util.TreeMap<Integer, Address> obj) {
    	for(int i=0 ; i<obj.size() ; i++) {
    		System.out.println(obj.get(i));
    	}
    }
}
