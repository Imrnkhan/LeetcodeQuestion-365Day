package JavaGudia_Question;

public class Reverse_EachWord {
    public static void main(String[] args) {
        String str ="geeks for geeks";
        String[] word = str.split(" ");

        String ans = "";
        for(int i =0;i<word.length;i++){
            String res = word[i];
            String revword = "";

            for(int j =res.length()-1;j>=0;j--){
                revword+=res.charAt(j);
            }
            ans+=revword+" ";


        }
        System.out.println(ans);
    }
}
