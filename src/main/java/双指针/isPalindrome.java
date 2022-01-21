package 双指针;

/**
 * @Author: Hikari
 * @Date: 2022/1/19 0:11
 */

public class isPalindrome {
    public boolean palinDrome(String s){
        int length = s.length();
        int left =0 , right = length-1;
        while (left<right){
//            while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
//            { left++;}
//            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                right--;
//            }
//            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                return false;
//            }
//            left++;
//            right--;
            if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean a = new isPalindrome().palinDrome("   A man, a plan, a canal: Panama");
        System.out.println(a);
    }
}
