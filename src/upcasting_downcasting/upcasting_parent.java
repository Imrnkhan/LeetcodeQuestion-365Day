package upcasting_downcasting;

public class upcasting_parent {
    void display(){
        System.out.println("upcating method....");
    }

}
class child extends upcasting_parent{
    void display(){
        System.out.println("child method..");
    }
}
class casting {
    public static void main(String[] args) {
        child ch = new child();   // these thing are the same work
        ch.display();
        //other main aproch on the upcasting
        upcasting_parent hs = (upcasting_parent) new child();
        hs.display();
    }
}