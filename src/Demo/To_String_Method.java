package Demo;

public class To_String_Method {

    int roll;
    String name;
    int mark;

    @Override
    public String toString() {
        return roll+" "+name+" "+mark;
    }

    public To_String_Method(int roll, String name, int mark) {
        this.roll = roll;
        this.name = name;
        this.mark = mark;


    }

    public static void main(String[] args) {
        To_String_Method demo = new To_String_Method(10,"aman",750);
        System.out.println(demo);
    }
}

