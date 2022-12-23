package This_keyword;

public class current_classObj {   // this way to call cureent class object
    int id;
    String name;

    public current_classObj(int id, String name) { //constructor cratee
        this.id = id;
        this.name = name;

        }

        void display(){   // method make
            System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        current_classObj demo = new current_classObj(90,"sahil");
        demo.display();
    }
}
