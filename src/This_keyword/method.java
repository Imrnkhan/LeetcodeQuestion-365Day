package This_keyword;

public class method {
    void m(){
        this.n();  // call function
        System.out.println("print m");
    }
    void n(){
        System.out.println("print n");
    }

    public static void main(String[] args) {
        method tm = new method();
        tm.m();

    }

}


// call the cureent class method when you call main method than
// print the both method with the help of the this keyword