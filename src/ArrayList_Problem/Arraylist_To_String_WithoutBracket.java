package ArrayList_Problem;

    import java.util.ArrayList;
public class Arraylist_To_String_WithoutBracket {

        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("Hello");
            list.add("World");
            list.add("addrss");
            list.add("delhi");
            list.add("pune");
            list.add("best");

            StringBuilder sb = new StringBuilder();
//            for (String str : list) {                   //other way to use
            for(int i =0;i<list.size();i++){

                sb.append(list.get(i));
                sb.append(" ");
            }
            String str = sb.toString().trim();
            System.out.println(str);
        }
    }

