package Assignments_2B;

public class Question1 {
    public static void main(String[] args) {
        compute();
    }
    public static void compute(){
        java.util.TreeSet<Integer> tree = new java.util.TreeSet<>();
        tree.add(12);
        tree.add(13);
        tree.add(12);
        tree.add(123);
        tree.add(12);

        // If the element is present in the tree set or not?
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the Number that You want to check ");
        Integer x = sc.nextInt();
        for (Integer treeSetData : tree) {
            System.out.println(treeSetData);
            if(treeSetData-x==0){
                System.out.println("Element Found");
                break;
            }
        }
// Will be completed Later
    }
}
