package 双指针;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Hikari
 * @Date: 2022/1/11 17:43
 */

public class Intersect {
    public int[] intersect(int[] a, int[] b){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i],map.getOrDefault(a[i], 0)+1);
        }
        for (int j = 0; j < b.length; j++) {
            if(map.containsKey(b[j]) && map.getOrDefault(b[j], 0 ) >0){
                list.add(b[j]);
                map.put(b[j], map.get(b[j]) - 1);
            }
        }
        //int[] ret = new int[list.size()];
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,9,5};
        int[] b = new int[]{9,4,9,8,4};
        Intersect intersect = new Intersect();
        int[] c =  intersect.intersect(a, b);
        System.out.println();
    }
}
