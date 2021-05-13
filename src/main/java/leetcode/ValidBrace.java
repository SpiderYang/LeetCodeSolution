package leetcode;

import java.util.Stack;

public class ValidBrace {
    static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(Character c: chars){
            if (c == '(')
                stack.push(')');
            else if(c == '[')
                stack.push(']');
            else if(c == '{')
                stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c )
                return false;
        }
        return stack.isEmpty();
    }
}
