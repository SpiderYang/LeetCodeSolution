package leetcode;

public class MyAtoi {

    static int myatoi(String s){
        StringBuilder sb = new StringBuilder();
        int resulte;
        int flag = 1;
        for(int i = 0; i< s.length(); i++){
            if(Character.isWhitespace(s.charAt(i))) continue;
            else {
                if(s.charAt(i) == '-') {
                    flag = -1;
                    s = s.substring(i+1, s.length());
                    break;
                }else  if(s.charAt(i) == '+'){
                    flag = 1;
                    s = s.substring(i+1, s.length());
                    break;
                }
                else if(! Character.isDigit(s.charAt(i))){
                    return 0;
                }
                s = s.substring(i,s.length());
                break;
            }
        }
        for(int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }else {
               // if (sb.length() == 0) return  0;
                break;
            }
        }
        try {
            if (sb.length() == 0) return 0;
            resulte = Integer.valueOf(sb.toString());
            resulte = resulte * flag;
        }catch (NumberFormatException e){
            if (flag < 0 ){
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
        return  resulte;
    }

    public static void main(String[] args) {
        System.out.println(myatoi("21474836460"));

    }
}
