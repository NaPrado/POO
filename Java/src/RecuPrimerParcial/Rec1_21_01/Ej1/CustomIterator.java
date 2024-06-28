package RecuPrimerParcial.Rec1_21_01.Ej1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CustomIterator<E> implements Iterator<E> {
    private E elem;
    private UnaryOperator<E> op;
    private Predicate<E> pred;
    CustomIterator(E elem, UnaryOperator<E> op, Predicate<E> pred){
        this.elem = elem;
        this.op = op;
        this.pred = pred;
    }
    CustomIterator(E elem, UnaryOperator<E> op){
        this.elem = elem;
        this.op = op;
        this.pred = new Predicate<E>() {
            @Override
            public boolean test(E e) {
                return true;
            }
        };
    }
    @Override
    public boolean hasNext(){
        return pred.test(op.apply(elem));
    }
    @Override
    public E next(){
        if (!hasNext()) throw new NoSuchElementException();
        elem=op.apply(elem);
        return elem;
    }
}
