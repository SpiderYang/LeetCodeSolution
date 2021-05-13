package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PowerOfThree {
    static boolean isPowerOfThree(int n){
        return n > 0 && (n == 1 || (n % 3==0 && isPowerOfThree(n/3) ));
    }

    static boolean isPowerOfThree1(int n){
        while( n % 3 == 0){
            n = n / 3;
        }
        return n == 1 ;
    }

    static boolean isPowerOfThree2(int n){
        List<Integer> list = new ArrayList<>();
        int count = 0;
        double res = 1;
        while ( res>=0 &&  res <= Integer.MAX_VALUE ){

            list.add((int)res);
            count++;
            res = Math.pow(3,count);
        }
        return list.contains(n);
    }

    static boolean isPowerOfThree3(int n){
        Map<Integer, Boolean> map = new HashMap<>();
        
        int count = 0;
        double res = 1;
        while ( res>=0 &&  res <= Integer.MAX_VALUE ){

            map.put((int)res,true);
            count++;
            res = Math.pow(3,count);
        }
        return map.getOrDefault(n, false);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree2(9));
    }
}
