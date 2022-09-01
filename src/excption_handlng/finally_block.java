package excption_handlng;

public class finally_block {
    public static void main(String[] args) {
        try {
            System.out.println("inside try bolck...");
            int data = 34/0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("exception handler...");
            System.out.println(e);
        }
        finally {
            System.out.println("finally bolock accoured..");
        }
            System.out.println("rest of code...");
    }
}
