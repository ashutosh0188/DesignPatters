package factory.ex2;

import java.util.Collection;

public class TaskSearch implements Search<Integer> {
    private String name;

    public TaskSearch(String name) {
        this.name = name;
    }

    @Override
    public void operate(Collection<Integer> o) {
        System.out.println(this.toString());
        o.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public String toString() {
        return "TaskSearch{" +
                "name='" + name + '\'' +
                '}';
    }
}
