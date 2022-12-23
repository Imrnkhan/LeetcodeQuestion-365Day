package ArrayList_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_to_Arraylist {
    public static void main(String[] args) {
        String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};
        List<String> hs = new ArrayList<>();
        hs = Arrays.asList(geeks);
        System.out.println(hs);
    }
}

//Array to arraylist make  way
//Collections.addAll()
//        Arrays.asList()