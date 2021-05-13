package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {


    static boolean isPalindrome1(String s ){
            s = s.toLowerCase();
            int start = 0;
            int end = s.length() - 1;
            while( start <= end){
                if (!Character.isLetterOrDigit(s.charAt(start))){
                    start++;
                    continue;
                }else  if(!Character.isLetterOrDigit(s.charAt(end)) ){
                    end--;
                    continue;
                }else if( s.charAt(start) != s.charAt(end) ){
                    return false;
                }else {
                    start++;
                    end--;
                }
            }
        return true;
    }

    static boolean isPalindrome(String s){
        char[] chars = s.toLowerCase().toCharArray();
        List<Character> list = new ArrayList<>();
        for(Character c: chars){
            if (Character.isLetterOrDigit(c))
            {
                list.add(c);
            }
        }
        int end = list.size() - 1;
        for(int i = 0; i <= end; i++) {
            if (list.get(i) != list.get(end)) {
                return false;
            } else {
                end--;
                continue;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome1("A man, a plan, a canal: Panama"));


    }
}
