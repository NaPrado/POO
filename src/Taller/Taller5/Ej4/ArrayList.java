package Taller.Taller5.Ej4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
public class ArrayList< T extends Comparable <? super T > >   implements List<T>, Iterable<T>{
    private static final int INITIAL_DIM = 5;
    private T[] array = (T[]) new Comparable[INITIAL_DIM];
    private int dim;
    private Comparator <T>cmp;

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    @Override
    public void add(T element) {
        if (dim == array.length){
            resize();
        }
        array[dim++]=element;
    }

    private  void resize(){
        array = Arrays.copyOf(array, array.length + INITIAL_DIM);
    }

    @Override
    public int contains(T element) {
        for (int i = 0; i < dim; i++) {
            if (array[i] == element){
                return i;
            }
        }
        return -1;
    }
    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= dim){
            return  false;
        }
        System.arraycopy(array, index+1, array, index, dim -index - 1);
        dim--;
        return  true;
    }

    @Override
    public Iterator<T> customIterator(Comparator<T> cmp) {
        T[] aux =Arrays.copyOf(array,dim);
        Arrays.sort(aux,cmp);
        return new arrayListIterator<>(array,dim);
    }
    Iterator<T> arrayListIteratorIterator(T[] array,int dim) {
        int current;

        public boolean hasNext() {
            return current<dim;
        }

        @Override
        public T next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            return array[current++];
        }
    };

    @Override
    public Iterator<T> iterator() {
        T[] arrayCopy = Arrays.copyOf(array, dim);
        Arrays.sort(arrayCopy);
        return new Iterator<T>() {
            private int current;

            @Override
            public boolean hasNext() {
                return current<dim;
            }

            @Override
            public T next() {
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                return arrayCopy[current++];
            }
        };
    }
}
*/
