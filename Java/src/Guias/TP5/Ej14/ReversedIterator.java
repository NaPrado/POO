package Guias.TP5.Ej14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedIterator <T extends Comparable<? super T>> implements Iterator<T> {
    T[]reversedArray;
    ReversedIterator(T[] array){
        reversedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(reversedArray,Comparator.reverseOrder());
    }
    int currentIndex = 0;
    @Override
    public boolean hasNext(){
        return currentIndex<reversedArray.length;
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        T aux=reversedArray[currentIndex];
        currentIndex++;
        return aux;
    }
    /*
        La Solucion propone algo menos objetoso en mi humilde opinion, ya que no usa el reversed order,
        sin embargo la solucion es más eficiente
    */
    /*Solucion propuesta*/
    /*
       private int index;
   private final E[] collection;

   public ReversedIterator(E[] collection) {
       this.collection = collection;
       this.index = collection.length - 1;
   }

   @Override
   public boolean hasNext() {
       return index >= 0;
   }

   @Override
   public E next() {
       if(!hasNext()) {
           throw new NoSuchElementException();
       }
       return collection[index--];
   }
    */
}
