package ToString_Method;

public class To_String {
    int Rollno;
    String city;
    String name;

    @Override
    public String toString() {
        return "To_String{" +
                "Rollno=" + Rollno +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public To_String(int rollno, String city, String name) {
        Rollno = rollno;
        this.city = city;
        this.name = name;


    }

    public static void main(String[] args) {
        To_String str = new To_String(56,"gurgaon","Amit");
        System.out.println(str);
    }
}
