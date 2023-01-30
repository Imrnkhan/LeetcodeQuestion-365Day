package polyporphism;

public class ployprishim {
    void funA(byte b){
        System.out.println("funA byte of method");
    }
    void funB(int i){
        System.out.println("funB int of method");
    }

    public static void main(String[] args) {
        ployprishim ps = new ployprishim();
//        byte bx = 20;
//        ps.funA(bx);    // it will give the priority to the nearest one
        ps.funB(20);
    }
}

