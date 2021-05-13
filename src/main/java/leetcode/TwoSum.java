package leetcode;

import java.util.HashMap;

public class TwoSum {

    static int[] sum1(int[] nums, int target){
        for(int i = 0; i< nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    static int[] sum2(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap();
       return  null;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,11,15,7};
        int target = 100;
        int[] n = sum1(nums, target);

    }
}
