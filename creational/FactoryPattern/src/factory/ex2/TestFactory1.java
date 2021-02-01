package factory.ex2;

import java.util.Arrays;

public class TestFactory1 {
    public static void main(String[] args) {
        Search search = SearchFactory.getInstance(v->v.equalsIgnoreCase("PO"), "PO-12345");
        search.operate(Arrays.asList("A","Z","B","C"));

        Search search1 = SearchFactory.getInstance(v->v.equalsIgnoreCase("WO"), "WO-12345");
        search1.operate(Arrays.asList(1.2, 3.2, 4.2, 5.2));

        Search search2 = SearchFactory.getInstance(v->v.equalsIgnoreCase("TASK"), "TASK-12345");
        search2.operate(Arrays.asList(1, 3, 4, 5));
    }
}
