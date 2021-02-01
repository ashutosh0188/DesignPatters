package factory.ex2;

import java.util.function.Predicate;

public class SearchFactory {

    private SearchFactory() {}

    public static Search getInstance(Predicate<String> p, String name) {
        if(p.test("PO")) {
            return new POSearch(name);
        }else if(p.test("WO")) {
            return new WOSearch(name);
        } else if(p.test("TASK")) {
            return new TaskSearch(name);
        }
        return null;
    }
}
