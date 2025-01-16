package Coding_Question;

import java.util.HashMap;

public class MaximumOccuringElementInteger {
    public static void main(String[] args) {


        int[] arr = {5, 0, 2, 0, 6, 9};

        // create a hashmap to store the frequency of each element
        HashMap<Integer, Integer> elementFreq = new HashMap<>();

// iterate through the array and count the frequency
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            elementFreq.put(element,elementFreq.getOrDefault(element,0)+1);
        }

        // find the element with the highest frequency
        int maxElement = 0;
        int maxFreq = 0;
        for (int element : elementFreq.keySet()) {
            int freq = elementFreq.get(element);
            if (freq > maxFreq) {
                maxElement = element;
                maxFreq = freq;
            }
        }

        System.out.println("The maximum occurring element is " + maxElement + " ->"+ maxFreq);

    }
}



/*
public static void maximumOccuringElement(int[] A, int N) {
    int maxElement = A[0];
    int maxFreq = 1;
    for (int i = 0; i < N; i++) {
        int count = 1;
        for (int j = i + 1; j < N; j++) {
            if (A[i] == A[j]) {
                count++;
            }
        }
        if (count > maxFreq) {
            maxFreq = count;
            maxElement = A[i];
        }
    }
    System.out.println("The maximum occurring element is " + maxElement + " with a frequency of " + maxFreq);
}

 */