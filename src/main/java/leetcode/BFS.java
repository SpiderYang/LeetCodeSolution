package leetcode;

import java.util.*;

public class BFS {

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

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null )
            return  result;
        queue.add(root);
        while (!queue.isEmpty()){
            int level =  queue.size();
            List<Integer> sublist = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                sublist.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
                result.add(sublist);
        }

        return result;
    }
}
