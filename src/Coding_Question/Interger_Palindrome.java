package Coding_Question;

public class Interger_Palindrome {
    public static void main(String[] args) {
        int ans = 121;
        System.out.println(plaindrome(ans));
    }
    public static boolean plaindrome(int ans){
        String str = String.valueOf(ans);

        int left = 0;
        int right = str.length()-1;

        while (left<right){
            if(str.charAt(left++)!=str.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}


/*

// this string palindrome
public  class Interger_Palindrome {
    public static void main(String[] args) {
        String ans = "madam";
        System.out.println(test(ans));
    }
    public static boolean test(String ans){
        int left = 0;
        int right = ans.length()-1;
        while (left<right){
            if(ans.charAt(left++)!=ans.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}

 */