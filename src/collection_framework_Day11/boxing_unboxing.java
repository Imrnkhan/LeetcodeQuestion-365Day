package collection_framework_Day11;

public class boxing_unboxing {
    public static void main(String[] args) {
        int x = 10;

        Integer l1 = Integer.valueOf(x); //boxing

        System.out.println(l1);



        Integer l2 = x;  //autoboxing
        System.out.println(l2);



        //in second way on the direct written

        Integer l3 = 10;
        System.out.println(l3);
        // unboxing

        int y = l3.intValue(); // unboxing
        System.out.println(y);
        int z = l3;
        System.out.println(z);








    }
}
