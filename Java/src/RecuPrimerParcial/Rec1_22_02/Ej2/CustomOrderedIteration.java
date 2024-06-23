package RecuPrimerParcial.Rec1_22_02.Ej2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomOrderedIteration<T> implements Iterable<T> {
    T f;
    T[] v;
    Comparator<T> cmp;

    CustomOrderedIteration(T[] v, Comparator<T> cmp, T f){
        this.v = v;
        this.cmp = cmp;
        this.f=f;
    }
    public void setStopElement(T f){
        this.f=f;
    }

    public Iterator<T> iterator() {
        T[] arr = Arrays.copyOf(v, v.length);
        Arrays.sort(arr, cmp);
        T fin= f;
        return new Iterator<T>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < arr.length && !arr[i].equals(fin);
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return arr[i++];
            }
        };
    }
}
