package singleton.ex3;

/**
 * This is lazy initialization of a singleton design pattern having thread safety at method level itself.
 */
public class Singleton {
    private static Singleton singleton = null;
    private long millis = System.currentTimeMillis();
    private Singleton(){}

    public static synchronized Singleton getInstance() {
        if(singleton==null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);

        System.out.println("Output of all three instances are same i.e. millis");
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "millis=" + millis +
                '}';
    }
}
