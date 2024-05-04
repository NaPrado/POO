package Guias.TP5.Ej4;

import Guias.TP5.Ej3.P1.LinearList;

public class PrependLinearListImpl<T> implements LinearList<T> {

    private Node first;

    @Override
    public void add(T obj) {
        first = new Node(obj);
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public void set(int i, T obj) {

    }

    @Override
    public void remove(int i) {

    }

    @Override
    public int indexOf(T obj) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    private class Node {

        private Object head;
        private Node tail;

        Node(Object head) {
            this.head = head;
            this.tail = first;
            first = this;
        }

    }

}

