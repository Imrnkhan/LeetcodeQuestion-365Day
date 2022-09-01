package Functional_programingDay13;

interface Funtional_interface {
    void sayHello(String name);
}
class x implements Funtional_interface{

    @Override
    public void sayHello(String name) {
        System.out.println("welcome: " + name);
    }

    public static void main(String[] args) {
        Funtional_interface fs = new x();
        fs.sayHello("admin");
        
    }
}