package leetcode;

public class CountAndSay {



    static String countAndSay(int n){
        if (n == 1) return "1";
        String tmp = countAndSay(n -1);
        StringBuilder sb = new StringBuilder();
        char flag = tmp.charAt(0);
        int count = 0;
        for(int i =0; i< tmp.length(); i++){
            if ( tmp.charAt(i) == flag ){
                count++;
            }else  if( tmp.charAt(i) != flag){
                sb.append(String.valueOf(count)+String.valueOf(flag));
                flag = tmp.charAt(i);
                count = 1;
            }
        }
        sb.append(String.valueOf(count) + String.valueOf(flag));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
