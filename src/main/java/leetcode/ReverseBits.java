package leetcode;

public class ReverseBits {
    static int reverseBits(int n){
        int res = 0;
        int lastnum;
        while (n !=0 ){
            res =  res << 1;
            lastnum = n & 1;
            res += lastnum;
            n  = n >> 1;
        }
        return res;
    }
}
