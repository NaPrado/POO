package Taller.Taller7.Ej2;

import java.util.List;
import java.util.function.Function;

public interface SimpleList<E> extends List<E> {
   <T>SimpleList<T> map(Function<E,T> mapper);
}
