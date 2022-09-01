package collection_framework_Day11;

import java.util.ArrayList;

public class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer>t = new ArrayList<>();

        t.add(25);
        t.add(58);
        t.add(12);
        t.add(16);
for(int i =0;i<t.size();i++){
    System.out.println(t.get(i));

        System.out.println(t);

        System.out.println(t.size());


    System.out.println(t.indexOf(16));

    System.out.println(t.contains(16));



    Object[] obj = t.toArray();

    int x = (Integer)i;
    System.out.println(x);


}
    }
}
