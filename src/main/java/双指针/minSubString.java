package 双指针;

import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Hikari
 * @Date: 2022/1/9 0:43
 */
public class minSubString {
    public String minWindow(String s, String t){
        int left = 0, right = 0;
        int strStart = 0;
        int windowLength = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for(Character ch: t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        while (right < s.length()){
            if (map.containsKey(s.charAt(right)))
                map.put(s.charAt(right), map.get(s.charAt(right)) -1);
            right++;
            while (check(map)){

                if (right - left < windowLength){
                    windowLength = right - left;
                    strStart = left;
                }

                if (map.containsKey(s.charAt(left)))
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                left++;
            }
        }
        if (windowLength != Integer.MAX_VALUE)
            return s.substring(strStart, strStart+windowLength);
        return "";
    }


    boolean check(Map<Character, Integer> map){
        for(int value: map.values()){
            if (value > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        minSubString m = new minSubString();
        String ret = m.minWindow("ADOBECODEBANC", "ABC");
        System.out.println(ret);
    }
}
