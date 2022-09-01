package Demo;

public class this_key {

    public this_key(){
        this(10);
        System.out.println("inside zero argument constructor Demo()");
    }

    public this_key(int x){
        this(100, 200);
        System.out.println("inside one argument constructor Demo(int x)");
    }
    public this_key(int x,int y){
        this("Hello");
        System.out.println("inside two argument constructor Demo(int x,int y)");
    }
    public this_key(String s){
//this(); //it will become recursive call
        System.out.println("inside one(String) argument constructor Demo(String s)");
    }
    public static void main(String[] args){

        this_key d1=new this_key();
    }
}
