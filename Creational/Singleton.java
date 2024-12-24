package Creational;

/**
 * Bill Pugh Singleton Implementation
 */
class SingletonClass {

    private SingletonClass() {
        // Exists only to defeat instantiation.
    }

    private static class SingletonHelper {
        public static final SingletonClass INSTANCE = new SingletonClass();
    }

    public static SingletonClass getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

public class Singleton {
    public static void main(String[] args) {
        // Get the singleton instance
        SingletonClass instance1 = SingletonClass.getInstance();
        SingletonClass instance2 = SingletonClass.getInstance();

        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}
