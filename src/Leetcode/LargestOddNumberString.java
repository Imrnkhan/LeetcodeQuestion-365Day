package Leetcode;

public class LargestOddNumberString {
    public static void main(String[] args) {
        String str = "4276";
        System.out.println(test(str));
    }
    public static String test(String str){
        for(int i =str.length()-1;i>=0;i--){
            if(str.charAt(i)%2!=0){
                return str.substring(0,i+1);
            }
        }
        return "";
    }
}
