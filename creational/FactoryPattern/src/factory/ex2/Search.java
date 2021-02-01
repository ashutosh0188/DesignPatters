package factory.ex2;

import java.util.Collection;

public interface Search<T> {
    public abstract void operate(Collection<T> o);
}
