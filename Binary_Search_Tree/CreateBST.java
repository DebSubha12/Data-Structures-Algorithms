package Binary_Search_Tree;
// public class  Node {
//     int data;
//     Node left;
//     Node right;
//     public Node (int value){
//         this.data=value;
//         left=right=null;
//     }
    
// }
public class CreateBST {
    public class  Node {
    int data;
    Node left;
    Node right;
    public Node (int value){
        this.data=value;
        left=right=null;
    }
    
}
    Node insert(Node root,int target){
        //base case
        if(root==null){
            Node temp=new Node (target);
            return temp;
        }
        if(target<root.data){
            root.left=insert(root.left,target);
        }else{
            root.right=insert(root.right, target);
        }
        return root;
    }
  static  void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String[] args) {
        CreateBST obj=new CreateBST();
        int arr[]={3,7,4,1,6,8};
        int n=arr.length;
        Node root=null;
        for(int i=0;i<n;i++){
        root =   obj.insert(root,arr[i]);
        }
        inorder(root);
    }
}
