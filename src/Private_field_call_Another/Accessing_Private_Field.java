package Private_field_call_Another;

public class Accessing_Private_Field {

    private int B =50;
    private int D = 30;



    public int getB() {
        return B;
    }

//    public void setB(int b) {
//        B = b;
//    }

    public int getD() {
        return D;
    }

//    public void setD(int d) {
//        D = d;
//    }
}


class Access{
    public static void main(String[] args) {
        Accessing_Private_Field fg = new Accessing_Private_Field();
        System.out.println(fg.getB());
        System.out.println(fg.getD());
    }
}