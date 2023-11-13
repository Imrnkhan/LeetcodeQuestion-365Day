package JavaImportant50Question;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println(test(str));
    }
    public static boolean test(String str){
        int start =0;
        int end = str.length()-1;
        while (start<end){
            if(str.charAt(start++)!=str.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}

//check palindrome in two pointer way
//its means both string check both side