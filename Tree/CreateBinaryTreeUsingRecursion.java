

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
    //Traversal
    //Pre-Order
   static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    //In-Order 
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    //Post - Order
    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }
    
    public static void main(String[] args) {
        System.out.print("Enter The root:");
        Node root;
        root=binaryTree();
        System.out.println("Pre Order :");
        preorder(root);
        System.out.println("In-Order");
        inorder(root);
        System.out.println("Post-Order");
        postorder(root);
    }
}
