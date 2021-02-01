package singleton.ex2;

public class TestDriver {
    public static void main(String[] args) {
        Driver driver = Driver.getInstance();
        System.out.println(driver);
    }
}
