package Coding_Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_Integer {
    public static void main(String[] args) {
        int [] num = {1,2,0,0};
        int k = 34;

        System.out.println(AddArray(num,k));
    }
    public static List<Integer> AddArray(int[] num, int k){
        ArrayList<Integer> hs = new ArrayList<>();
        for(int i = num.length-1;i>=0;i--){
            hs.add((num[i]+k)%10);
             k = (num[i]+k)/10;

        }
        while (k>0){
            hs.add(k%10);
            k = k/10;
        }
        Collections.reverse(hs);
        return hs;
    }
}
