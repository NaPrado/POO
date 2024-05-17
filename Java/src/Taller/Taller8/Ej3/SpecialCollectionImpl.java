package Taller.Taller8.Ej3;

import java.util.*;
import java.util.function.Predicate;

public class SpecialCollectionImpl<T extends Comparable<? super T>> extends TreeSet<T> implements SpecialCollection<T> {
    public SpecialCollectionImpl() {
        super(Comparator.reverseOrder());
    }

    Deque<T> LastRemoves = new ArrayDeque<>();

    @Override
    public void deleteFirst(Predicate<T> predicate){
        T first = getFirst();
        if(predicate.test(first)) {
            remove(first);
            LastRemoves.push(first);
        }
    }
    @Override
    public void undoDeleteFirst(){
        if (LastRemoves.isEmpty()){
            throw new NothingToUndoException();
        }
        add(LastRemoves.pop());
    }
}
