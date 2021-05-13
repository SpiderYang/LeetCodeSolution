package leetcode;

public class ElementOne {

    static int singleNum(int[] nums){
        int result = 0;
        for(Integer i: nums){
            result ^= i;
        }
        return result;
    }

    public static void main(String[] args) {
       int[] n ={1,2,3,4,5,6,7,7,6,5,4,3,2};
        System.out.println(singleNum(n));
    }
}
