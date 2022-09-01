package collection_framework_Day11;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {

    Stack<Integer> st = new Stack<>();
    st.push(25);
    st.push(58);
    st.push(78);
    st.push(25);
    st.push(58);
    st.push(78);
    st.pop();  // remove last element

for(int i =0;i<st.size();i++){

        System.out.println(st.get(i));
}
    }
}
