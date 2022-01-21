package 双指针;

/**
 * @Author: Hikari
 * @Date: 2022/1/9 14:02
 */
public class noDuplicatedNumber {
    public int deleteDuplicatedNumber(int [] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int left = 0;
        for(int right = 1; right < nums.length; right++){
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
        }
        return ++left;
    }
}
