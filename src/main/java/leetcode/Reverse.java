package leetcode;

import java.util.zip.DataFormatException;

public class Reverse {

    static int resverse1(int x ){
        long result = 0;
        while(Math.abs(x)>0){
            int remain = x%10;
            result = result *10 + remain;
            x = x/10;
        }
        if(result >Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        return (int)result;

    }

    static int reverse(int x){
        int result = 0;
        int flag = x > 0 ? 1 : -1;
        if (x == 0 || x == Integer.MAX_VALUE || x == Integer.MIN_VALUE) return 0;
        String s = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();
        try {
           result =  Integer.valueOf(s);
        }catch (NumberFormatException e){
            return  0;
        }
        return result * flag;
    }

    public static void main(String[] args) {
        System.out.println(resverse1(-123));
    }
}
