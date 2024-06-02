package Guias.TP7.Ej2;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public interface SimpleList <T> extends List<T> {
    public <E>E reduce(E inicial, BiFunction<E,T,E> cmp);
}
