package Private_field_call_Another;


//field and Method both are same work and same process.

public class Accessing_Private_Mathod {
private String name = "kapil";
private int Age = 35;

    public String getName() {
        return name;
    }



    public int getAge() {
        return Age;
    }


    }

class demo{
    public static void main(String[] args) {
        Accessing_Private_Mathod mh = new Accessing_Private_Mathod();

        System.out.println(mh.getName()+" : "+mh.getAge());
    }
}