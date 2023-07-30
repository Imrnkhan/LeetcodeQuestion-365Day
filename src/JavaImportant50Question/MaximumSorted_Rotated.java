package JavaImportant50Question;

public class MaximumSorted_Rotated {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5};
        System.out.println(findMax(arr));
    }

    public static int findMax(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return arr[high];
    }
}

//explain
/*
low = 0;
high = arr.length-1
3-1 = 2 high
mid = 0+2=2/2 =>1
arr[1]<arr[2]
than left = mid+1 => 1+1=2 mid now
than mid and high => 2=2 both are equal than print left
arr[left] = 2 index is max = 5 elemnt

 */
//
//    // Create a copy of the original array to avoid modifying the input array
//    int[] sortedArr = Arrays.copyOf(nums, nums.length);
//
//// Sort the copy in ascending order
//        Arrays.sort(sortedArr);
//
//                // Return the last element of the sorted array, which will be the maximum element
//                return sortedArr[nums.length - 1];