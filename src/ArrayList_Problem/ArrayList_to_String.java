package ArrayList_Problem;
//ArrayList to convert String


import java.util.ArrayList;

public class ArrayList_to_String {
    public static void main(String[] args) {
            ArrayList<String> hs = new ArrayList<>();
            hs.add("addrss");
            hs.add("delhi");
            hs.add("pune");
            hs.add("best");
        System.out.println(hs);

//        other way===========================
        String vb = String.join(" ",hs);
        System.out.println(vb);
//==============================================

        StringBuffer sb = new StringBuffer();

        for(String str:hs){

            sb.append(str+" ");
        }
        String mystr = sb.toString();
        System.out.println(mystr);
    }
}
