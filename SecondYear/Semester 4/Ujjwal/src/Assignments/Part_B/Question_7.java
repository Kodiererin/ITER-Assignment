package Assignments.Part_B;
// Write a program to read N number from user and keep it in suitable
// data structure so that no duplicate element is present in that.
class Question_7{
    public static void main(String[] args) {
        noDuplicateElement();
    }
    public static void noDuplicateElement(){
        System.out.println("Enter The Numbers");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.HashSet<Integer> obj = new java.util.HashSet<>();
        // Added the Numbers 
        for(int i=0 ; i<10 ; i++){
            obj.add(sc.nextInt());
        }
        for(int i=0 ; i<obj.size() ; i++){
            System.out.println(obj);
        }
    }   
}