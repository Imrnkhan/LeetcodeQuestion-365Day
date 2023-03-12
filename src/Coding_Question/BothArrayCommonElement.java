package Coding_Question;

import java.util.Arrays;

public class BothArrayCommonElement {

        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {3, 4, 5, 6, 7};

            Arrays.sort(array1);
            Arrays.sort(array2);

            int i = 0;
            int j = 0;

            while (i < array1.length && j < array2.length) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    i++;
                    j++;
                } else if (array1[i] < array2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
        }
    }

    //another way
    /*
    public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}


//////////////////////

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        HashSet<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int num : array2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        for (int num : set1) {
            System.out.println(num);
        }
    }
}


     */