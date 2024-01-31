package JavaGudia_Question;

import java.util.Arrays;
import java.util.Collections;

public class SortModuloBasic {


        public static void main(String[] args) {

                    Integer[] arr = {10, 3, 2, 6, 12};
                    int k = 4;

                    Arrays.sort(arr, (a, b) -> a % k - b % k);

                    for (int i =0;i<arr.length;i++) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }

// 10%4=2
//3%4=3
//2%4=2
//6%4=2
//12%4=0


//after that answer => 12,10,2,6,3



