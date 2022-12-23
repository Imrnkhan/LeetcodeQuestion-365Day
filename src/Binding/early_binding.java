package Binding;

public class early_binding {
    void  eat(){
        System.out.println("early binding");
    }

    public static void main(String[] args) {
        early_binding hb = new early_binding();
        hb.eat();
    }
}
