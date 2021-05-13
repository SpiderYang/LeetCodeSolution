package leetcode;

public class MaxDepth {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val = val;}

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static int maxDepth(TreeNode root){
        if (root == null)
            return 0;
        int r1 = maxDepth(root.left) + 1;
        int r2 = maxDepth(root.right) + 1;
        return Math.max(r1,r2);
    }

}
