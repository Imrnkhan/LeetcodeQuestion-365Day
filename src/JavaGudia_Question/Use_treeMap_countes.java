package JavaGudia_Question;

import java.util.TreeMap;

public class Use_treeMap_countes {

    public static void main(String[] args) {

        String str = "abcdddaartgde ";

        System.out.println(solve(str));

    }
    public static TreeMap<Character,Integer> solve(String str){

        TreeMap<Character,Integer> map = new TreeMap<>();

        for(int i=0;i<str.length();i++){

            if(!map.containsKey(str.charAt(i)))

                map.put(str.charAt(i),1);

            else {
                Integer x =  map.get(str.charAt(i));

                map.put(str.charAt(i),++x);
            }
        }
        return map;
    }
}
