package Access_modifier;
//
//Creating an abstract class Bike with an abstract method run, after that creating a
//        concrete class Apache as a child class of Bike and implementing the run method.


abstract class bike {
    abstract void run();
}
    class Apache extends bike{

        @Override
        void run() {
            System.out.println("child class ");

        }

        public static void main(String[] args) {
            bike b = new Apache();
            b.run();

    }
}