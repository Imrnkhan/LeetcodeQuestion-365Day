package Zap;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Geeks";
//        System.out.println(test(str));
        test(str);
    }
    public static void test(String str){

        //bruteforce app

//        String ans = "";
//        for(int i= str.length()-1;i>=0;i--){
//            ans+=str.charAt(i);
//        }
//        return ans;


        //optimal app
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        System.out.println(rev.toString());

    }
}

//    StringBuilder reversed = new StringBuilder();
//
//        for (int i = num.length() - 1; i >= 0; i--) {
//                reversed.append(num.charAt(i));
//                }
//
//                return reversed.toString();