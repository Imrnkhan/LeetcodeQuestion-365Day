package ArrayList_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_to_Array {
    public static void main(String[] args) {
        //creating Arraylist
        List<String> fruitList = new ArrayList<>();
        //adding String Objects to fruitsList ArrayList
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Pineapple");
        System.out.println("Converting ArrayList to Array========" );

        String[] item = fruitList.toArray(new String[fruitList.size()]);
        for(String s : item){
            System.out.println(s);
        }
        System.out.println("Converting Array to ArrayList========" );
        List<String>l2 = new ArrayList<>();
        l2 =  Arrays.asList(item);
        System.out.println(l2);
    }
}




//other way
/*
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Add elements to the list
        list.add(5);
        list.add(10);
        list.add(15);

        // Convert ArrayList to Array
        Integer[] array = list.toArray(new Integer[0]);

        // Print the array
        for (Integer n : array) {
            System.out.println(n);
        }
    }
}

 */