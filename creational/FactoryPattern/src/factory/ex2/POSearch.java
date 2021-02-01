package factory.ex2;

import java.util.Collection;

public class POSearch implements Search<String> {
    private String name;

    public POSearch(String name) {
        this.name = name;
    }

    @Override
    public void operate(Collection<String> o) {
        System.out.println(this.toString());
        o.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public String toString() {
        return "POSearch{" +
                "name='" + name + '\'' +
                '}';
    }
}
