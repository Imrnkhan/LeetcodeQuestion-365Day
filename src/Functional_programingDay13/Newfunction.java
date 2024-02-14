package Functional_programingDay13;

@FunctionalInterface
interface Funtional_interface {
    void sayHello(String name);
}
public class Newfunction implements Funtional_interface{

    @Override
    public void sayHello(String name) {
        System.out.println("welcome: " + name);
    }

    public static void main(String[] args) {
        Funtional_interface fs = new Newfunction ();
        fs.sayHello("admin");
        
    }
}