package Coding_Question;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {8,8,8,8,7};

        System.out.println(test(arr) );
    }
    public static int test(int[]arr){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
            }

            else if (arr[i]<largest && arr[i]>second){
                second = arr[i];
            }


        }
        return (second==Integer.MIN_VALUE)? -1 : second;
    }
}
