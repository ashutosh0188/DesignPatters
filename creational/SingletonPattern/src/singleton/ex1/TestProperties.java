package singleton.ex1;

public class TestProperties {
    public static void main(String[] args) {
        Properties properties = Properties.getInstance();
        System.out.println(properties.getName());
        System.out.println(properties.getType());

        System.out.println();

        //again checking instance.. output must be same
        Properties properties1 = Properties.getInstance();
        System.out.println(properties1.getName());
        System.out.println(properties1.getType());
    }
}
