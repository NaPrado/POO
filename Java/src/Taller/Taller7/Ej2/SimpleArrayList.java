package Taller.Taller7.Ej2;

import java.util.ArrayList;
import java.util.function.Function;

public class SimpleArrayList<E> extends ArrayList<E> implements SimpleList<E> {
    @Override
    public <T>SimpleList<T> map(Function<E,T> mapper) {
        SimpleList<T> toRet= new SimpleArrayList<>();
        for (E elem: this){
            toRet.add(mapper.apply(elem));
        }
        return toRet;
    }
}
