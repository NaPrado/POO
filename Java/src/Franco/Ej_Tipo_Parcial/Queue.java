package Franco.Ej_Tipo_Parcial;

import java.util.Iterator;

public interface Queue<E> extends Iterable<E>{

    void enqueue(E elem);

    E dequeue();

    boolean isEmpty();

    Iterator<E> iterator();
}
