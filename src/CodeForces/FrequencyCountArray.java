package CodeForces;

import java.util.HashMap;

public class FrequencyCountArray {
    public static void main(String[] args) {
        int[]arr = {1, 5, 7, 10, 12, 14, 15, 18, 20, 22, 25, 27};
        System.out.println(test(arr));
//        test(arr);
    }
    public static HashMap<Integer, Integer> test(int[]arr){
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            hs.put(arr[i], hs.getOrDefault(arr[i],0)+1);
//            return hs;
//            if(hs.containsKey(arr[i])){
//                hs.put(arr[i], hs.get(i)+1);
//            }
//            else {
//                hs.put(arr[i],1);
//            }
        }
//        System.out.println(hs);
//        return hs;
//        for (Map.Entry<Integer, Integer> entry : hs.entrySet()){
//            System.out.println(entry.getKey() + "->" + entry.getValue());
//        }
        return hs;
    }
}
