package leetcode;

public class StrStr {

    static int strStr1(String haystack, String needle){
        if (needle.length() == 0 ) return 0;
        if ( needle.length() > haystack.length()) return -1;
        for(int i = 0; i< haystack.length(); i++){
            if (i + needle.length() <= haystack.length() &&  haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    static int strStr(String haystack, String needle){
        if (needle.length() == 0 ) return 0;
        if ( needle.length() > haystack.length()) return -1;
        int nstart = 0;
        int hstart = 0;
        while(hstart < haystack.length()  ){
            if (haystack.charAt(hstart) == needle.charAt(nstart) ){
                hstart++;
                nstart++;
            }else  if(hstart < haystack.length() && nstart < needle.length()-1  ){
                nstart = 0;
                hstart++;
            }else if (nstart >= needle.length() - 1 ){
                return  hstart - needle.length();
            }else {
                return  -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr1("a",
                "a"));
    }
}
