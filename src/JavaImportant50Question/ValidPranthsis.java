package JavaImportant50Question;

import java.util.Stack;

public class ValidPranthsis {
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(test(str));
    }
    public static boolean test(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            // char a = s.charAt(i);
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
                stack.push(str.charAt(i));
            else if(stack.empty())
                return false;
            else if(str.charAt(i) == ')' && stack.pop() != '(') return false;
            else if(str.charAt(i) == ']' && stack.pop() != '[') return false;
            else if(str.charAt(i) == '}' && stack.pop() != '{') return false;
        }
        return stack.empty();
    }
    }

