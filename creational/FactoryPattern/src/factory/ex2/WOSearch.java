package factory.ex2;

import java.util.Collection;

public class WOSearch implements Search<Double> {
    private String name;

    public WOSearch(String name) {
        this.name = name;
    }

    @Override
    public void operate(Collection<Double> o) {
        System.out.println(this.toString());
        o.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public String toString() {
        return "WOSearch{" +
                "name='" + name + '\'' +
                '}';
    }
}
