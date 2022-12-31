package Coding_Question;


public class repeted {
    public static void main(String[] args) {
        //intial array
        int arr[] = {2, 4, 6, 4, 2, 4, 5, 8};

          int max_element = 8;



        //declare an array of size max_element+1

        int count_arr[] = new int[max_element+1];

        //loop through the original array and update the count

        for(int i=0; i<arr.length; i++){

            count_arr[arr[i]]++;
        }

        //fetch the element having the max count


        int max_repeated = Integer.MIN_VALUE;

        int max_count = -1;

        for(int i=0; i<arr.length; i++){

            if(count_arr[arr[i]] > max_count){

                max_count = count_arr[arr[i]];

                max_repeated = arr[i];
            }
        }

        System.out.println("Most repeated: "+max_repeated);
    }
}