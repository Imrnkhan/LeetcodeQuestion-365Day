package JavaGudia_Question;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(test(str));
    }
    public static String test(String str){
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
            return new String(arr);

    }
}



//another way
//public String reverseString(char[] s) {
//    StringBuilder hs = new StringBuilder(new String(s));
//    hs.reverse();
//    return hs.toString();
//}

//amother way

//    public static String reverseString(String input) {
//        int length = input.length();
//        StringBuilder reversed = new StringBuilder();
//        for (int i = length - 1; i >= 0; i--) {
//            reversed.append(input.charAt(i));
//        }
//        return reversed.toString();
//    }
