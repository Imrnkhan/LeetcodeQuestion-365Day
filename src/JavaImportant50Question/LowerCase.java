package JavaImportant50Question;

public class LowerCase {
    public static void main(String[] args) {
        String str = "LEETCODE";
        System.out.println(test(str));
    }
    public static String test(String str){
//        return str.toLowerCase();
        StringBuffer hs =  new StringBuffer();
        for(int i =0;i<str.length();i++){
            hs.append(Character.toLowerCase(str.charAt(i)));
        }
        return hs.toString();
    }
}



// Uppercase to lowercase all word
