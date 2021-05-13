package leetcode;

import java.util.Stack;

public class ValidBST {
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

    static boolean isValidBST(TreeNode root){
        if (root == null )
            return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            if (pre != null && pre.val <= root.val)
                return false;
            pre = root;
            root = root.right;
        }
        return true;
    }
}
