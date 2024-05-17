package Guias.TP6.Ej3;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PairCyclicIterator <T> implements Iterator<Pair<T>> {
    Iterable <T> collection;
    Iterator<T> iterator;
    PairCyclicIterator(Collection<T> collection){
        this.collection=collection;
        this.iterator=collection.iterator();
    }
    @Override
    public boolean hasNext() {
        return collection.iterator().hasNext();
    }

    @Override
    public Pair<T> next() {
        if(!hasNext())
            throw new NoSuchElementException();
        T left, right;
        if(!iterator.hasNext()) {
            iterator = collection.iterator();
        }
        left = iterator.next();
        if(!iterator.hasNext()) {
            iterator = collection.iterator();
        }
        right = iterator.next();
        return new Pair<>(left, right);
    }

}
