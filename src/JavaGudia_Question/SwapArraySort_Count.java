package JavaGudia_Question;


//The minimum number of swaps required to sort an array
public class SwapArraySort_Count {
    public static void main(String[] args) {
        int[] arr = {101, 758, 315, 730, 472, 619, 460, 479};
        // 1
        System.out.println(test(arr));
    }
    public static int test(int[]arr){
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
            }
        }

        return swaps;
    }
}
