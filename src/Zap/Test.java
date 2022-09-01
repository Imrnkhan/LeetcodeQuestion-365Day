package Zap;

import java.util.*;

public class Test {




        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1,2,2,2,3,5);

            System.out.println(numbers);

            Set<Integer> hashSet = new LinkedHashSet(numbers);
            ArrayList<Integer> removedDuplicates = new ArrayList(hashSet);

            System.out.println(removedDuplicates);
        }
    }



