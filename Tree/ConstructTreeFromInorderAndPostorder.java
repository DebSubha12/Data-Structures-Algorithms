import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class ConstructTreeFromInorderAndPostorder {

    private int postIdx;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIdx = postorder.length - 1;
        return build(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder,
                           int inStart, int inEnd) {

        if (inStart > inEnd) {
            return null;
        }

        int rootVal = postorder[postIdx--];
        TreeNode root = new TreeNode(rootVal);

        int idx = findIndex(inorder, inStart, inEnd, rootVal);

        root.right = build(inorder, postorder, idx + 1, inEnd);
        root.left = build(inorder, postorder, inStart, idx - 1);

        return root;
    }

    private int findIndex(int[] inorder, int start, int end, int target) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        ConstructTreeFromInorderAndPostorder treeBuilder =
                new ConstructTreeFromInorderAndPostorder();

        TreeNode root = treeBuilder.buildTree(inorder, postorder);

        System.out.println("Preorder Traversal:");
        treeBuilder.preorder(root);
    }
}