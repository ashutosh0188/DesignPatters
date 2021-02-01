package builder.ex1;

import java.util.Map;

public class TestMapBuilder {
    public static void main(String[] args) {
        Map<String, Integer> map = new MapBuilder<String,Integer>()
                .withKeyAndVal("A",123)
                .withKeyAndVal("B",234)
                .build();
        //System.out.println(map);
        map.entrySet().stream().forEach(System.out::println);
        map.keySet().stream().forEach(System.out::println);
        map.values().stream().forEach(System.out::println);
    }
}
