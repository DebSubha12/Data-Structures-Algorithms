package Tree;

import java.util.Scanner;

public class CreateBinaryTreeUsingRecursion {
    
    // Create Node
    public static class Node {
        int data;
        Node left, right;

        public Node(int value) {
            this.data = value;
            left = right = null;
        }
    }
   static Node binaryTree(){
    Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        //System.out.print(x);
        if(x==-1){
            return null;
        }
        Node temp=new Node(x);
        System.out.print("Enter left child of " + x + " : ");
        temp.left=binaryTree();
        System.out.print("Enter right child of " + x + " : ");
        temp.right=binaryTree();
        return temp;
    }
    public static void main(String[] args) {
        System.out.print("Enter The root:");
        Node root;
        root=binaryTree();
    }
}
