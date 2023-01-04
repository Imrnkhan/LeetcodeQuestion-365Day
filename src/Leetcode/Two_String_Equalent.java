package Leetcode;

public class Two_String_Equalent {
    public static void main(String[] args) {
        String []str1 = {"ab", "c"};
        String[] str2 = {"a", "bc"};
//        System.out.println(test(str1,str2));
        if(test(str1,str2)){
            System.out.println("Eqaual string");
        }
        else
        System.out.println("Not equal String");
    }
    public static boolean test(String[]str1,String[] str2){
        return String.join("",str1).equals(String.join("",str2));
    }
}


// abc==abc true/else not true