package Taller.Taller8.Ej3;

import java.util.SortedSet;
import java.util.function.Predicate;

public interface SpecialCollection<T extends Comparable<? super T>> extends SortedSet<T> {

    void deleteFirst(Predicate<T> predicate);
    default void deleteFirst(){
        deleteFirst(first -> true);
    }
    void undoDeleteFirst();
}
