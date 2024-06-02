package Guias.TP7.Ej3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ConcatIterator<E> implements Iterator<E> {
    Iterator<E>current;
    Iterator<E>it2;
    ConcatIterator(Iterator<E>it1, Iterator<E>it2){
        this.current = it1;
        this.it2 = it2;
    }
    @Override
    public boolean hasNext() {
        if (!current.hasNext() && current!=it2){
            current=it2;
        }
        return current.hasNext();
    }

    @Override
    public E next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return current.next();
    }
}
