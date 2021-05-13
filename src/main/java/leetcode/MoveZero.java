package leetcode;

public class MoveZero {

    static int[] move(int[] nums){

        for(int i = 0; i< nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] == 0 && nums[j] != 0 ){
                    nums[i] = nums[j];
                    nums[j] = 0;
                    break;
                }else
                    continue;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] b = {0,1,0,3,12};
        move(b);
        for(Integer i: b){
            System.out.println(i);
        }
    }
}
