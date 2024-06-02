package Guias.TP7.Ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class SimpleArrayList <T> extends ArrayList<T> implements SimpleList<T>{

    @Override
    public <E> E reduce(E inicial, BiFunction<E, T, E> cmp) {
        E result = inicial;
        for (T elem: this){
            result = cmp.apply(result, elem);
        }
        return result;
    }
}
