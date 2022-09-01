package multiple_inheritance_interface;



//how to achive and make program in the multiple inheritance interface

public interface animal {
    void print();
}
interface showble{
    void show();
}

class demo implements animal,showble{

    @Override
    public void print() {
        System.out.println("animal method....");
    }

    @Override
    public void show() {
        System.out.println("showbale method....");

    }
}
class mains{
    public static void main(String[] args) {
        System.out.println("main method...");
        demo d = new demo();
        d.print();
        d.show();


//        animal m = new demo();   //same working on upper function
//        m.print();
//
//
//        showble s = new demo();
//        s.show();
    }
}