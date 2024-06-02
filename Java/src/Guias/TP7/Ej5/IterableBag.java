package Guias.TP7.Ej5;
import Guias.TP6.Ej8.Bag;

public interface IterableBag <E extends Comparable<? super E>> extends Bag<E>{
    /**
     * Para iterar, en orden descendente, por todos los elementos que hay en la bolsa.
     */
    Iterable<E> elements();

    /**
     * Para iterar, en orden descendente, por todos los elementos distintos
     * que hay en la bolsa.
     */
    Iterable<E> elementsDistinct();
}
