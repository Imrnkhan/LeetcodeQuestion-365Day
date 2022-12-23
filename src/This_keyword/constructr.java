package This_keyword;

public class constructr {
    int roll;
    int mark;

    constructr() {
        System.out.println("default constructor");
    }

    public constructr(int roll, int mark) {
        this.roll = roll;
        this.mark = mark;
    }

    public static void main(String[] args) {
        constructr cs = new constructr();

        System.out.println(cs);// hascode
        constructr dc = new constructr(45,450);
        System.out.println(dc.mark+" "+dc.roll);// value

    }
}
