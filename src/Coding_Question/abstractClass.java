package Coding_Question;

abstract class abstractClass {

    abstract void test();
}

class next extends abstractClass{

    @Override
    void test() {
        System.out.println("this method abstract");

    }

    public static void main(String[] args) {
        abstractClass abs = new next();
        abs.test();
    }
}


// abstract and interface main diff abs class extend and interface implement