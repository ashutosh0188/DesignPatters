package singleton.ex2;

/**
 * This is lazy initialization of a singleton design pattern having thread safety with double checked locking principal
 * by synchronized block at if condition. This also increase performance as compared to adding synchronized at method level.
 */
public class Driver {
    private static Driver driver = null;
    private String name = "defaultName";

    private Driver(){ /*do not remove */}

    public static Driver getInstance() {
        if(driver == null) {
            synchronized (Driver.class) {
                driver = new Driver();
            }
        }
        return driver;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                '}';
    }
}
