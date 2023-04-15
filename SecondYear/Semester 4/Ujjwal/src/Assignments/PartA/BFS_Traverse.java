package Assignments.PartA;

import java.util.Queue;

class Tree{
    int data;
    Tree left;
    Tree right;

    Tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BFS_Traverse {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Tree head = new Tree(10);
        head.left = new Tree(20);
        head.right = new Tree(30);

        head.left.left = new Tree(40);
        head.right.right = new Tree(50);

        head.left.left.left = new Tree(60);
        head.right.right.right = new Tree(70);

        
        BFSsearch(head);
    }
    
    public static void BFSsearch(Tree Head){
        if(Head==null){
            return;
        }
        java.util.Queue<Tree> queue = new java.util.LinkedList<>();
        queue.add(Head);
        while(!queue.isEmpty()){
        Tree current = queue.poll();
        System.out.println(current.data);

        if(current.left != null){
            queue.add(current.left);
        }

        if(current.right != null){
            queue.add(current.right);
        }
    }
    }
}
