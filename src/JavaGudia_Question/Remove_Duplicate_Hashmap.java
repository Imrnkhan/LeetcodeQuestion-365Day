package JavaGudia_Question;

import java.util.HashMap;
import java.util.Map;

public class Remove_Duplicate_Hashmap {
    public static void main(String[] args) {
        int[] arr = {52,14,65,1,2,3,5,6,2,3,6,4,8,};
        Duplicate(arr);

    }
    public static void Duplicate(int[] arr){
        Map<Integer,Integer> hs = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i],hs.get(arr[i]+1));
            }
            else {
                hs.put(arr[i],1);
        }
            }

            hs.forEach((k,v)-> System.out.print(k+" "));
    }
}
