package Private_field_call_Another;

public class Class2 {

    public static void main(String[] args) {
        Class1 hs = new Class1(10);
        System.out.println(hs.getA());

//        Another varible

   Class1 hd = new Class1(20);
    System.out.println(hd.getA());
    }
}
