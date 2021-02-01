package builder.ex1;

import java.util.HashMap;
import java.util.Map;

public final class MapBuilder<K,V> {
    private final Map<K,V> map;

    public MapBuilder(){
        this.map = new HashMap<>();
    }

    public MapBuilder<K,V> withKeyAndVal(K key, V val) {
        this.map.put(key,val);
        return this;
    }

    public Map<K,V> build() {
        return this.map;
    }
}
