package 双指针;

/**
 * @Author: Hikari
 * @Date: 2022/1/7 13:18
 */
/*
* 给定一个非空字符串s，最多删除一个字符。判断是否能成为回文字符串
* 题解：1：本身就是回文串，直接返回true；
* 2：需要删除1个字符为回文串，使用双指针存在两种情况，left这边删除一个后为回文，right这边删除一个。两种只要任意
* 一个为回文即可返回true；
* 3：上述都不符合返回false。
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
