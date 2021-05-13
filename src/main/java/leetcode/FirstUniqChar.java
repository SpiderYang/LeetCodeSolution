package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FirstUniqChar {

    static int firstUniqChar1(String s){
        int pos = -1;
        char[] chars = s.toCharArray();
        return pos;
    }

    static int firstUniqChar(String s){
        int pos = -1;
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c: chars){
            if (map.containsKey(c)){
                int tmp = map.get(c);
                tmp++;
                map.put(c, tmp);
            }else {
                map.put(c, 1);
            }
        }
        for(int i = 0; i< chars.length; i++){
            if (map.get(chars[i]) == 1){
                return i;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar1("aabb"));
    }
}
