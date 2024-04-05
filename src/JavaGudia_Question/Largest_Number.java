package JavaGudia_Question;

import java.util.Arrays;

public class Largest_Number {
    public static void main(String[] args) {
        int [] arr = {2,3,4,51,2,6,7};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);    //largest number

        System.out.println(arr[0]);          //lowest number
    }
}


// both number lower high