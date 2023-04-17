package ArrayList_Problem;

    import java.util.ArrayList;

    public class ArraylisttoArray {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            Integer[] arr = list.toArray(new Integer[0]);
//            for (Integer num : array) {
            for(int i =0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }




    //another way
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Object[] array = list.stream().toArray();
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
    }
}
 */