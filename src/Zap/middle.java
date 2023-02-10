//package Zap;
//
//public class middle {
//        public static void main(String[] args) {
//          int[] arr= {4, 3, 6, 7, 8};
//          int n = arr.length;
//            System.out.println(test(arr,n));
//
//        }
//        public static int test(int[] arr, int n){
//            int[] leftMax = new int[n];
//            leftMax[0] = Integer.MIN_VALUE;
//
//            // Fill leftMax[1..n-1]
//            for (int i = 1; i < n; i++)
//                leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
//
//            // Initialize minimum from right
//            int rightMin = Integer.MAX_VALUE;
//
//            // Traverse array from right
//            for (int i = n - 1; i >= 0; i--)
//            {
//                // Check if we found a required element
//                if (leftMax[i] < arr[i] && rightMin > arr[i])
//                    return i;
//
//                // Update right minimum
//                rightMin = Math.min(rightMin, arr[i]);
//            }
//
//            // If there was no element matching criteria
//            return -1;
//
//        }
//    }
//
//
