package Taller.Taller5.Ej4;

import java.util.Iterator;

public interface List<T extends Comparable<? super T> > extends Iterable<T> {
    boolean isEmpty();
    void add(T element);
    int contains(T element);
    boolean remove(int index);
    default boolean removeElement(T element){
        int index = contains(element);
        if (index != -1){
            return remove(index);
        }
        return false;
    }

    Iterator<T> customIterator(Object o);
}
