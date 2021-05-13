package leetcode;

public class PreOrder {
    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }

        public TreeNode() {
        }

        @Override
        public String toString() {
            return "[" + val + "]";
        }
    }
    static void preOrder(TreeNode tree) {
        if (tree == null)
            return;
        System.out.printf(tree.val + " ");
        preOrder(tree.left);
        preOrder(tree.right);
    }

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(0);
        TreeNode dummy = treeNode;
        for (int i = 1; i <20 ; i= i+3) {
            TreeNode left = new TreeNode(i);
            TreeNode right = new TreeNode(i+1);
            treeNode.left = left;
            treeNode.right = right;
            if ( i % 2 == 0)
                treeNode = left;
            treeNode = right;
        }
       // preOrder(dummy);
       int x = Integer.MIN_VALUE;
        System.out.println(x >> 33);
    }
}
