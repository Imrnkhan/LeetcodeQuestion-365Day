package GeekForGeek;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateArrayListFind{
        public static int test(ArrayList<Integer> arr, int n){
            HashSet<Integer> hs = new HashSet<>();

            // Iterate over the array/list
            for(int i = 0; i < arr.size(); i++){
                // Check if the element is already in the HashSet
                if(hs.contains(arr.get(i))){
                    // If it's present, return the duplicate element
                    return arr.get(i);
                }
                // If not present, add the element to the set
                hs.add(arr.get(i));
            }

            // If no duplicate is found, return -1 (although in this problem, there should always be one duplicate)
            return -1;
        }
    }


