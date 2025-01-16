package JavaGudia_Question;

import java.util.HashMap;
import java.util.Map;

public class Remove_Duplicate_Hashmap {
    public static void main(String[] args) {
        int[] arr = {52, 14, 65, 1, 2, 3, 5, 6, 2, 3, 6, 4, 8,8};
        Duplicate(arr);


    }

    public static void Duplicate(int[] arr) {
        Map<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
        }
            hs.forEach((k,v)-> System.out.print(k+" "));
    }
}
