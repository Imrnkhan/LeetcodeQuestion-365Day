package ToString_Method;

public class ToString_Without {

    int mark;
    String name;
    int rollno;

    public ToString_Without(int mark, String name, int rollno) {
        this.mark = mark;
        this.name = name;
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        ToString_Without st = new ToString_Without(456,"Akhil",45);
        System.out.println(st);
    }
}
