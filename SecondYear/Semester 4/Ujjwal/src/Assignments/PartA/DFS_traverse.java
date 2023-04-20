package Assignments.PartA;

import java.time.temporal.Temporal;

import javax.swing.plaf.multi.MultiButtonUI;
import javax.swing.text.AbstractDocument.LeafElement;
import javax.swing.tree.TreeNode;

public class DFS_traverse {
    static class Tree {
        int data;
        Tree left;
        Tree right;

        Tree(int data) {
            this.left = null;
            this.data = data;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Tree head = new Tree(10);
        head.left = new Tree(20);
        head.right = new Tree(30);

        head.left.left = new Tree(40);
        head.left.left.right = new Tree(100);
        head.right.right = new Tree(50);

        head.left.left.left = new Tree(60);
        head.right.right.right = new Tree(70);

        // System.out.println("InOrder Traversal");
        // DFS_Traverse_inorder(head);
        // System.out.println("Pre Order Traversal");
        // DFS_Traverse_preOrder(head);
        // System.out.println("PostOrder Traversal");
        // DFS_Traverse_postOrder(head);

        usingStackCollection(head);

    }

    // Using Stack Collection Frameword and Without using Recursion
    public static void usingStackCollection(Tree Head) {
        System.out.println("Kem Cho India");

        Tree tempHead = Head;

        java.util.Stack<Tree> stack = new java.util.Stack<>();
        stack.push(tempHead);
        tempHead = tempHead.left;
        while (tempHead != null) {
            stack.push(tempHead);
            tempHead = tempHead.left;
        }
        tempHead = Head.right;
        while (tempHead != null) {
            stack.push(tempHead);
            tempHead = tempHead.right;
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.peek().data);
            stack.pop();
        }
    }

    public static void usingStackCollection2(Tree head) {
        if (head == null)
            return;
        java.util.Stack<Tree> stack = new java.util.Stack<>();
        stack.push(head);

        Tree tempTree = head.left;
        while (tempTree != null) {
            stack.push(tempTree);
            tempTree = tempTree.left;
        }

        while (stack.isEmpty()) {
            System.out.println(stack.pop());
            if (tempTree.right != null) {
                while (tempTree != null) {
                    stack.push(tempTree);
                    tempTree = tempTree.right;
                }
            }
        }

    }

    public static void DFS_Traverse_inorder(Tree Head) {
        // Inorder Traversal
        if (Head == null)
            return;
        DFS_Traverse_inorder(Head.left);
        System.out.println(Head.data);
        DFS_Traverse_inorder(Head.right);
    }

    public static void DFS_Traverse_preOrder(Tree Head) {
        if (Head == null)
            return;
        System.out.println(Head.data);
        // Inorder Traversal
        DFS_Traverse_preOrder(Head.left);
        DFS_Traverse_preOrder(Head.right);
    }

    public static void DFS_Traverse_postOrder(Tree Head) {
        if (Head == null)
            return;
        // Inorder Traversal
        DFS_Traverse_postOrder(Head.left);
        DFS_Traverse_postOrder(Head.right);
        System.out.println(Head.data);
    }

}
