package 双指针;

/**
 * @Author: Hikari
 * @Date: 2022/1/7 13:18
 */
/*
* 给定一个非空字符串s，最多删除一个字符。判断是否能成为回文字符串
* */
public class validPalindrome {
        public validPalindrome(){}

        public boolean validPalindrome(String s){
            int left = 0;
            int right = s.length()-1;
            while(left < right){
                if (s.charAt(left) != s.charAt(right)){
                    return isPalindrome(s, left+1, right) ||
                            isPalindrome(s, left, right-1);
                }
                left++;
                right--;
            }
        return true;
        }

        public boolean isPalindrome(String s, int left, int right){
            while(left < right){
                if (s.charAt(left++) != s.charAt(right--))
                    return false;
            }
            return true;
        }

}
