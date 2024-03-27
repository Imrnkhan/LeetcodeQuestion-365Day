package ArrayList_Problem;

public class ReverseString {
    public static void main(String[] args) {
        String str = "12345";
        System.out.println(test(str));
    }
    public static String test (String str){
        StringBuilder stringBuilder = new StringBuilder(str);

        // Use the reverse() method of StringBuilder to reverse the string
        stringBuilder.reverse();

        // Convert the StringBuilder back to a string and return it
        return stringBuilder.toString();

    }
}
