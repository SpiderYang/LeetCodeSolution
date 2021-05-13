package leetcode;

public class SortedArrayToBST {
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

    static TreeNode sortedArrayToBST(int[] nums){
        if (nums.length == 0)
            return null;
        return sortedArrayToBST(nums,0, nums.length - 1);
    }

    static TreeNode sortedArrayToBST(int[] nums, int start, int end){
        if (start > end)
            return null;
        int mid = (start + end ) >> 1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid+1, end);
        return  root;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        sortedArrayToBST(nums);
    }
}
