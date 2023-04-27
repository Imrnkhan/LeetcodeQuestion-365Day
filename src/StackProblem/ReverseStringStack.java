package StackProblem;

import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        String str = "Leetcode";
        System.out.println(test(str));
    }
    public static String test(String str){
        Stack<Character> hs= new Stack<>();
        for(int i =0;i<str.length();i++){
            hs.push(str.charAt(i));

            }
            StringBuilder st = new StringBuilder();
            while (!hs.empty()){

                st.append(hs.pop());

        }
        return st.toString();
    }
}


// given string reverse
//come
//emoc