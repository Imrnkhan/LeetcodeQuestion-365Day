package JavaGudia_Question;

public class reverse_String {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(test(str));
    }
    public static StringBuilder test(String str){

        StringBuilder hs = new StringBuilder();
        for(int i =str.length()-1;i>=0;i--){
            hs.append(str.charAt(i));
        }
        return hs;
    }
}
