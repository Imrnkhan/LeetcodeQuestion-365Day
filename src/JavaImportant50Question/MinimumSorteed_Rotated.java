package JavaImportant50Question;

public class MinimumSorteed_Rotated {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(test(arr));
    }
    public static int test(int[] arr){
        int left = 0;                            // start
        int right = arr.length - 1;                  // end
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }
}
