package leetcode;

public class LongestCommonPrefix {

    static String longestCommonPrefix(String[] strs){
        if (strs.length == 0 || strs[0].length() ==0 ) return "";
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        int count = 0;
        char prefix = strs[0].charAt(pos);
        while ( true ){
            for(String s: strs){
                if (pos >= s.length() ) return  sb.length() > 0 ? sb.toString(): "";
                else if ( s.charAt(pos) != prefix) {
                    return  sb.length() > 0 ? sb.toString(): "";
                }else if(count == strs.length ){
                    pos++;
                    count = 0;
                    sb.append(String.valueOf(prefix));
                    if (pos < strs[0].length() ) {
                        prefix = strs[0].charAt(pos);
                    }
                }else
                    count++;

            }
        }

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"aaa","aa","aaa"}));
    }
}
