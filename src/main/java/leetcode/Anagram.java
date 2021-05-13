package leetcode;

import java.util.Arrays;

public class Anagram {

    static boolean isAnagram(String s, String t){
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        if ( Arrays.equals(s1,t1) ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
