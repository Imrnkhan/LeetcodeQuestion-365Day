package SingletonDesginPattren;



public class Singleton {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // Initialization code here
    }

    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and attributes can be added here

}

/*
Explanation:

       private static Singleton instance: This variable holds the single instance of the class.
        It's declared as private to prevent direct access from outside the class, and static to ensure there's only one instance shared across all objects.

     private Singleton(): The constructor is made private to prevent other classes from creating instances of the Singleton.

     public static Singleton getInstance(): This method provides a way to access the single instance.
        If the instance doesn't exist yet (null), it's created; otherwise, the existing instance is returned.

 */