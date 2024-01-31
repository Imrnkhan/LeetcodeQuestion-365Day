package CodeForces;

public class Lowest_Highest {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,8,3,2,4,5,9};


                // Find the lowest and highest numbers and their index their
                int min = arr[0];
                int max = arr[0];
                int minIndex = 0;
                int maxIndex = 0;

                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < min) {
                        min = arr[i];
                        minIndex = i;
                    } else if (arr[i] > max) {
                        max = arr[i];
                        maxIndex = i;
                    }
                }

                // Print the results
                System.out.println("Lowest: " + min + " at index " + minIndex);
                System.out.println("Highest: " + max + " at index " + maxIndex);
            }
        }

//lowest and highest number
//
//public class LowestHighestNumbers {
//    public static void main(String[] args) {
//        int[] arr = {1, 4, 6, 7, 8, 3, 2, 4, 5, 9};
//
//        // Find the lowest and highest numbers
//        int min = arr[0];
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            } else if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        // Print the results
//        System.out.println("Lowest: " + min);
//        System.out.println("Highest: " + max);
//    }
//}
//
