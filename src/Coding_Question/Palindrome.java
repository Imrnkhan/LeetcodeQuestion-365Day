package Coding_Question;

public class Palindrome {
    public static void main(String[] args) {
        String str = "racer";
      test(str);

    }
    public static void  test(String str){
        String ans = "";
        for(int i =str.length()-1;i>=0;i--)
            ans = ans+str.charAt(i);
            if(str.equals(ans))

                System.out.println("isPalindrome");
            else
            System.out.println("NotPalindrome");
    }
}
