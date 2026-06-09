package Binary_Search_Tree;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class DeleteNodeBST {

    // Delete a node from BST
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node found

            // Case 1: No left child
            if (root.left == null) {
                return root.right;
            }

            // Case 2: No right child
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }

        return root;
    }

    // Find minimum node in a subtree
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Insert a node into BST
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder Traversal
    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        DeleteNodeBST bst = new DeleteNodeBST();

        TreeNode root = null;

        // Creating BST: [5,3,6,2,4,null,7]
        int[] values = {5, 3, 6, 2, 4, 7};

        for (int val : values) {
            root = bst.insert(root, val);
        }

        System.out.println("Original BST (Inorder):");
        bst.inorder(root);

        int key = 3;
        root = bst.deleteNode(root, key);

        System.out.println("\n\nBST after deleting " + key + " (Inorder):");
        bst.inorder(root);
    }
}