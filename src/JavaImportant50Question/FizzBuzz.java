package JavaImportant50Question;

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
     int n =10;
        System.out.println(test(n));
    }
    public static ArrayList<String> test(int n){
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0)
                list.add("FizzBuzz");
            else if(i%3==0)
                list.add("Fizz");
            else if(i%5==0)
                list.add("Buzz");
            else
                list.add(""+i);
        }
        return list;

        }

        }


