package interface_java;

public interface extend_interface {
    void prints();
}

interface shable extends extend_interface{
    void shaws();
}

class demo implements shable{

    @Override
    public void prints() {
        System.out.println("prints method..");

    }

    @Override
    public void shaws() {
        System.out.println("shable method...");

    }
}
class maind{
    public static void main(String[] args) {
        System.out.println("main method..");
        demo n = new demo();
        n.prints();
        n.shaws();
    }
}