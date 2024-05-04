package Guias.TP5.Ej15;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CyclicWindowIterator<E> implements Iterator<E[]> {

    private final E[] collection;
    private int windowDim, index;

    public CyclicWindowIterator(E[] collection, int windowDim) {
        this.collection = collection;
        this.windowDim = windowDim;
    }

    @Override
    public boolean hasNext() {
        return collection.length != 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E[] next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        E[] window = (E[]) new Object[windowDim];
        for(int i = 0; i < windowDim; i++) {
            window[i] = collection[(index + i) % collection.length];
        }
        index++;
        return window;
    }

}

