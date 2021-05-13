package leetcode;

public class Merge {
    static void merge(int[] nums1, int m, int[] nums2, int n){
        int[] res = new int[m+n];
        int count = 0;
        int i = 0;
        int j = 0;
        while( i < m && j < n ){
            if (nums1[i] < nums2[j]) {
                res[count++] = nums1[i++];
            }else{
                res[count++] = nums2[j++];
            }
        }
        for(; i< m; ){
            res[count++] = nums1[i++];
        }
        for (; j < n; ) {
            res[count++] = nums2[j++];
        }
       for(int l=0; l < count; l++){
            nums1[l] = res[l];
       }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 0, 0,};
        int[] b = new int[]{2,5,6};
        merge(a,3,b,3);
    }
}
