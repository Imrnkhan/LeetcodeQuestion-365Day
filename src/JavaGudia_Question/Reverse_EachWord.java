package JavaGudia_Question;

public class Reverse_EachWord {
    public static void main(String[] args) {
        String str ="geeks for geeks";
        String[] word = str.split(" ");

        String ans = "";
        for(int i =0;i<word.length;i++){
            String res = word[i];
            String revword = "";

            for(int j =res.length()-1;j>=0;j--){
                revword+=res.charAt(j);
            }
            ans+=revword+" ";


        }
        System.out.println(ans);
    }
}



/*
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        // Loop through the words array in reverse order and append each word
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        // Convert StringBuilder to String and return
        return reversed.toString();
 */

//another way O(n)

//public static String reverseWords(String s) {
//    StringBuilder sb = new StringBuilder();
//    Stack<String> stack = new Stack<>();
//    String[] words = s.split(" ");
//    for (String word : words) {
//        stack.push(word);
//    }
//    while (!stack.isEmpty()) {
//        sb.append(stack.pop()).append(" ");
//    }
//    return sb.toString().trim();
//}
