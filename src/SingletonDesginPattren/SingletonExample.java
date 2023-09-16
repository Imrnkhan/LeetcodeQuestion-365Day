package SingletonDesginPattren;

public class SingletonExample {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Both instances should be the same
        System.out.println(singleton1 == singleton2); // Output: true
    }
}
