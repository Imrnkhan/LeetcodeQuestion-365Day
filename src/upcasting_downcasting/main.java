package upcasting_downcasting;

 class DownCasting_Parent {
    String name;
    void cast(){
        System.out.println("parent casting method.. ");
    }
}
class Child extends DownCasting_Parent {
    int age;

    @Override
    void cast() {
        System.out.println("child method");
    }
}
    public class main {
    public static void main(String[] args) {
        DownCasting_Parent ks = new Child();
        ks.name= "subham";

        Child c = (Child) ks;
        c.age = 18;
        System.out.println(ks.name);
        System.out.println(c.age);
}
 }
