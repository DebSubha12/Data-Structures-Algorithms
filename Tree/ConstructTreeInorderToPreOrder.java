import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ConstructTreeInorderToPreOrder {

    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = findIndex(inorder, inStart, inEnd, rootVal);

        root.left = build(preorder, inorder, inStart, rootIndex - 1);
        root.right = build(preorder, inorder, rootIndex + 1, inEnd);

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

    // Inorder traversal for verification
    private void printInorder(TreeNode root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        ConstructTreeInorderToPreOrder obj = new ConstructTreeInorderToPreOrder();

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = obj.buildTree(preorder, inorder);

        System.out.println("Inorder traversal of constructed tree:");
        obj.printInorder(root);
    }
}