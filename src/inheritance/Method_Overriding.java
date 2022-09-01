package inheritance;

public class Method_Overriding {
    void run(){
        System.out.println("running method....");
    }
}
class bike extends Method_Overriding{
    void out(){
        System.out.println("Bike is running.");
    }

    public static void main(String[] args) {
        Method_Overriding hm = new Method_Overriding();
        hm.run();
    }
}
