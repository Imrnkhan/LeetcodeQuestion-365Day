package JavaGudia_Question;

public class String_countin_Digit {
    public static void main(String[] args) {
        String str = "java es best365";

        if(test(str)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }

    public static boolean test(String str){
        for(int i =0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}


// if (!Character.isLetter(cs.charAt(i))) { similer is the process on latter