package JavaGudia_Question;

public class FindNumberMin_Max_Array {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 4, 8, 3, 2, 9};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}


//another way

//    public static void main(String[] args) {
//        int[] arr = {1, 5, 4, 8, 3, 2, 9};
//        test(arr);
//    }
//
//    public static void test(int[] arr) {
//        int smallest = arr[0];
//        int largest = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//            } else if (arr[i] < smallest) {
//                smallest = arr[i];
//            }
//        }
//            System.out.println(largest + " " + smallest);
//
//    }