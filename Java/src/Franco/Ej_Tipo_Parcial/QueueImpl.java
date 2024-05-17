package Franco.Ej_Tipo_Parcial;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueImpl<E> implements Queue<E>, Iterable<E> {

    private Node<E> first, last;

    @Override
    public void enqueue(E elem) {
        Node<E> newNode = new Node<>(elem);
        if(isEmpty()) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    private static class Node<T> {
        T elem;
        Node<T> next;

        public Node(T elem) {
            this.elem = elem;
        }
    }

    @Override
    public E dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        E toReturn = first.elem;
        if(first == last) {
            first = last = null;
        } else {
            first = first.next;
        }
        return toReturn;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
    @Override
    public Iterator<E> iterator(){
        return new Iterator<E>() {
            private Node<E> current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                E toReturn = current.elem;
                current=current.next;
                return toReturn;
            }
        };
    }
}
