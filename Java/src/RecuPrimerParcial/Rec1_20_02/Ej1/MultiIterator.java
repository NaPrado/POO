package RecuPrimerParcial.Rec1_20_02.Ej1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MultiIterator <E> implements Iterator<E> {
    private static final int INITIAL_DIM = 2;
    private Iterator<E>[] iterators = (Iterator<E>[]) new Iterator[INITIAL_DIM];
    private int size = 0;
    private void resize(){
        iterators= Arrays.copyOf(iterators, iterators.length+INITIAL_DIM);
    }
    public void add(Iterator<E> it ){
        if (size== iterators.length){
            resize();
        }
        iterators[size++] = it;
    }
    public int size(){
        return size;
    }
    private Iterator<E> actual;
    private int curr=0;
    public boolean hasNext(){
        return actual.hasNext() || iterators[curr].hasNext();
    }
    public E next(){
        if (!hasNext()){
            if(curr<size){
                throw new NoSuchElementException();
            }
            
        }

    }
}
