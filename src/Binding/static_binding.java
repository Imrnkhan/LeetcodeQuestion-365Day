package Binding;

public class static_binding {
    void eat(){
        System.out.println("stati binding");
    }
    }
    class dog extends static_binding{
        void eat(){
            System.out.println("static dog class");
        }
}
class demo{
    public static void main(String[] args) {
        static_binding bh = new dog();
        bh.eat();
    }
}
