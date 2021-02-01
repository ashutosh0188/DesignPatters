package singleton.ex1;

public class TestProperties {
    public static void main(String[] args) {
        Properties properties = Properties.getInstance("application","Test");
        System.out.println(properties.getName());
        System.out.println(properties.getType());
    }
}
