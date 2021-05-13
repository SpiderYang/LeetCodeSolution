package leetcode;

public class Rotate {

    static void rotate1(int[] nums, int k){
        int[] tmp =new int[nums.length];
        int tmp_index = 0;
        int index = k % nums.length;
        int start = nums.length - index;
        for(int i = start; i < nums.length; i++){
            tmp[tmp_index ] = nums[i];
            tmp_index++;
        }
        for(int i = 0; i < start; i++){
            tmp[tmp_index ] = nums[i];
            tmp_index++;
        }
        for(int i = 0; i< nums.length; i++){
            nums[i] = tmp[i];
        }

    }

    static void rotate(int[] nums, int k) {
        int length = nums.length;
        if (k % length != 0) {
            int endStart = k%length;
            int prevStart = length - endStart - 1;


            for (int i = prevStart; i >= 0; i--) {
                for (int j = 0; j < endStart ; j++) {
                    int tmp = nums[i+j];
                    nums[i+j] = nums[i+j+1];
                    nums[i+j+1] = tmp;
                }
            }
        }
        for(Integer i: nums){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7};
        rotate1(nums, 3);
    }
}
