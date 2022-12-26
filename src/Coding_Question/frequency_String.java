package Coding_Question;

public class frequency_String {
    public static void main(String[] args) {
        String str =  "GeeeEEKKKss";

    frequcny(str);
    }

    public  static void frequcny(String str){
        for(int i =0;i<str.length();i++){
            int ans =1;
            while (i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                ans++;
                i++;
            }
        System.out.println(str.charAt(i)+"-"+ ans);
        }
    }
}

//same wayto work arrays frequency